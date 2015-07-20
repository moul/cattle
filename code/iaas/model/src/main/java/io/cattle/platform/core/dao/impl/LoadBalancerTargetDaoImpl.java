package io.cattle.platform.core.dao.impl;

import static io.cattle.platform.core.model.tables.InstanceTable.INSTANCE;
import static io.cattle.platform.core.model.tables.LoadBalancerTargetTable.LOAD_BALANCER_TARGET;
import io.cattle.platform.core.addon.LoadBalancerTargetInput;
import io.cattle.platform.core.constants.CommonStatesConstants;
import io.cattle.platform.core.constants.InstanceConstants;
import io.cattle.platform.core.constants.LoadBalancerConstants;
import io.cattle.platform.core.dao.GenericResourceDao;
import io.cattle.platform.core.dao.LoadBalancerDao;
import io.cattle.platform.core.dao.LoadBalancerTargetDao;
import io.cattle.platform.core.model.Instance;
import io.cattle.platform.core.model.LoadBalancer;
import io.cattle.platform.core.model.LoadBalancerListener;
import io.cattle.platform.core.model.LoadBalancerTarget;
import io.cattle.platform.core.model.tables.records.InstanceRecord;
import io.cattle.platform.core.model.tables.records.LoadBalancerTargetRecord;
import io.cattle.platform.core.util.LoadBalancerTargetPortSpec;
import io.cattle.platform.db.jooq.dao.impl.AbstractJooqDao;
import io.cattle.platform.json.JsonMapper;
import io.cattle.platform.object.ObjectManager;
import io.cattle.platform.object.process.ObjectProcessManager;
import io.cattle.platform.object.util.DataAccessor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

public class LoadBalancerTargetDaoImpl extends AbstractJooqDao implements LoadBalancerTargetDao {

    @Inject
    ObjectManager objectManager;

    @Inject
    LoadBalancerDao lbDao;

    @Inject
    GenericResourceDao resourceDao;

    @Inject
    ObjectProcessManager objectProcessManager;

    @Inject
    JsonMapper jsonMapper;

    @Override
    public LoadBalancerTarget getLoadBalancerTarget(long lbId, LoadBalancerTargetInput targetInput) {
        Map<Object, Object> criteria = new HashMap<>();
        criteria.put(LOAD_BALANCER_TARGET.LOAD_BALANCER_ID, lbId);
        criteria.put(LOAD_BALANCER_TARGET.IP_ADDRESS, targetInput.getIpAddress());
        criteria.put(LOAD_BALANCER_TARGET.INSTANCE_ID, targetInput.getInstanceId());
        criteria.put(LOAD_BALANCER_TARGET.REMOVED, null);
        List<? extends LoadBalancerTarget> targets = objectManager.find(LoadBalancerTarget.class, criteria);
        for (LoadBalancerTarget target : targets) {
            List<? extends String> ports = DataAccessor.fields(target).
            withKey(LoadBalancerConstants.FIELD_LB_TARGET_PORTS).withDefault(Collections.EMPTY_LIST)
                    .asList(jsonMapper, String.class);
            if (ports.containsAll(targetInput.getPorts()) && targetInput.getPorts().containsAll(ports)) {
                return target;
            }
        }
        return null;
    }

    @Override
    public List<? extends LoadBalancerTarget> listByLbIdToRemove(long lbId) {
        return create()
                .selectFrom(LOAD_BALANCER_TARGET)
                .where(
                        LOAD_BALANCER_TARGET.LOAD_BALANCER_ID.eq(lbId)
                                .and(LOAD_BALANCER_TARGET.REMOVED.isNull().
                                        or(LOAD_BALANCER_TARGET.STATE.eq(CommonStatesConstants.REMOVING))))
                .fetchInto(LoadBalancerTargetRecord.class);
    }

    @Override
    public List<? extends LoadBalancerTarget> listByLbId(long lbId) {
        return create()
                .selectFrom(LOAD_BALANCER_TARGET)
                .where(
                        LOAD_BALANCER_TARGET.LOAD_BALANCER_ID.eq(lbId)
                                .and(LOAD_BALANCER_TARGET.REMOVED.isNull()))
                .fetchInto(LoadBalancerTargetRecord.class);
    }

    @Override
    public List<? extends Instance> getLoadBalancerActiveTargetInstances(long lbId) {
        return create()
                .select(INSTANCE.fields())
                .from(INSTANCE)
                .join(LOAD_BALANCER_TARGET)
                .on(LOAD_BALANCER_TARGET.INSTANCE_ID.eq(INSTANCE.ID)
                        .and(LOAD_BALANCER_TARGET.LOAD_BALANCER_ID.eq(lbId))
                        .and(LOAD_BALANCER_TARGET.STATE.in(CommonStatesConstants.ACTIVATING,
                                CommonStatesConstants.ACTIVE)))
                .where(INSTANCE.REMOVED.isNull().and(
                        INSTANCE.STATE.in(InstanceConstants.STATE_RUNNING, InstanceConstants.STATE_STARTING,
                                InstanceConstants.STATE_RESTARTING)))
                .fetchInto(InstanceRecord.class);
    }

    @Override
    public List<? extends LoadBalancerTarget> getLoadBalancerActiveIpTargets(long lbId) {
        return create()
                .select(LOAD_BALANCER_TARGET.fields())
                .from(LOAD_BALANCER_TARGET)
                .where(LOAD_BALANCER_TARGET.REMOVED.isNull()
                        .and(
                        LOAD_BALANCER_TARGET.STATE.in(CommonStatesConstants.ACTIVATING,
                                        CommonStatesConstants.ACTIVE))
                        .and(LOAD_BALANCER_TARGET.IP_ADDRESS.isNotNull())
                        .and(LOAD_BALANCER_TARGET.LOAD_BALANCER_ID.eq(lbId)))
                .fetchInto(LoadBalancerTargetRecord.class);
    }

    @Override
    public List<? extends LoadBalancerTarget> getLoadBalancerActiveInstanceTargets(long lbId) {
        return create()
                .select(LOAD_BALANCER_TARGET.fields())
                .from(LOAD_BALANCER_TARGET)
                .where(LOAD_BALANCER_TARGET.REMOVED.isNull()
                        .and(
                                LOAD_BALANCER_TARGET.STATE.in(CommonStatesConstants.ACTIVATING,
                                        CommonStatesConstants.ACTIVE))
                        .and(LOAD_BALANCER_TARGET.INSTANCE_ID.isNotNull())
                        .and(LOAD_BALANCER_TARGET.LOAD_BALANCER_ID.eq(lbId)))
                .fetchInto(LoadBalancerTargetRecord.class);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<LoadBalancerTargetPortSpec> getLoadBalancerTargetPorts(LoadBalancerTarget target) {
        List<LoadBalancerTargetPortSpec> portSpecs = new ArrayList<>();
        List<String> portsData = DataAccessor.fields(target)
                .withKey(LoadBalancerConstants.FIELD_LB_TARGET_PORTS).withDefault(Collections.EMPTY_LIST)
                .as(List.class);
        if (portsData != null && !portsData.isEmpty()) {
            for (String portData : portsData) {
                portSpecs.add(new LoadBalancerTargetPortSpec(portData));
            }
        } else {
            // LEGACY: to support the case when ports are not defined on per target, and read from listener instead
            List<? extends LoadBalancerListener> listeners = lbDao.listActiveListenersForConfig(target
                    .getLoadBalancerId());
            for (LoadBalancerListener listener : listeners) {
                portSpecs.add(new LoadBalancerTargetPortSpec(listener.getTargetPort()));
            }
        }
        return portSpecs;
    }

    @Override
    public void createLoadBalancerTarget(LoadBalancer lb, LoadBalancerTargetInput toAdd) {
        LoadBalancerTarget target = getLoadBalancerTarget(lb.getId(), toAdd);
        if (target == null) {
            target = resourceDao.createAndSchedule(LoadBalancerTarget.class, LOAD_BALANCER_TARGET.INSTANCE_ID, null,
                    LOAD_BALANCER_TARGET.LOAD_BALANCER_ID, lb.getId(),
                    LOAD_BALANCER_TARGET.IP_ADDRESS, toAdd.getIpAddress(),
                    LOAD_BALANCER_TARGET.INSTANCE_ID, toAdd.getInstanceId(),
                    LOAD_BALANCER_TARGET.ACCOUNT_ID, lb.getAccountId(),
                    LoadBalancerConstants.FIELD_LB_TARGET_PORTS, toAdd.getPorts());
        }
    }

    @Override
    public void removeLoadBalancerTarget(LoadBalancer lb, LoadBalancerTargetInput toRemove) {
        LoadBalancerTarget target = getLoadBalancerTarget(lb.getId(), toRemove);

        if (target != null) {
            objectProcessManager.scheduleProcessInstance(LoadBalancerConstants.PROCESS_LB_TARGET_MAP_REMOVE,
                    target, null);
        }
    }
}
