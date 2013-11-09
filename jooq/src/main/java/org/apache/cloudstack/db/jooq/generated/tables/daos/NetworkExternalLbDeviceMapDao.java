/**
 * This class is generated by jOOQ
 */
package org.apache.cloudstack.db.jooq.generated.tables.daos;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.2.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class NetworkExternalLbDeviceMapDao extends org.jooq.impl.DAOImpl<org.apache.cloudstack.db.jooq.generated.tables.records.NetworkExternalLbDeviceMapRecord, org.apache.cloudstack.db.jooq.generated.tables.pojos.NetworkExternalLbDeviceMap, java.lang.Long> {

	/**
	 * Create a new NetworkExternalLbDeviceMapDao without any configuration
	 */
	public NetworkExternalLbDeviceMapDao() {
		super(org.apache.cloudstack.db.jooq.generated.tables.NetworkExternalLbDeviceMap.NETWORK_EXTERNAL_LB_DEVICE_MAP, org.apache.cloudstack.db.jooq.generated.tables.pojos.NetworkExternalLbDeviceMap.class);
	}

	/**
	 * Create a new NetworkExternalLbDeviceMapDao with an attached configuration
	 */
	public NetworkExternalLbDeviceMapDao(org.jooq.Configuration configuration) {
		super(org.apache.cloudstack.db.jooq.generated.tables.NetworkExternalLbDeviceMap.NETWORK_EXTERNAL_LB_DEVICE_MAP, org.apache.cloudstack.db.jooq.generated.tables.pojos.NetworkExternalLbDeviceMap.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected java.lang.Long getId(org.apache.cloudstack.db.jooq.generated.tables.pojos.NetworkExternalLbDeviceMap object) {
		return object.getId();
	}

	/**
	 * Fetch records that have <code>id IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.NetworkExternalLbDeviceMap> fetchById(java.lang.Long... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.NetworkExternalLbDeviceMap.NETWORK_EXTERNAL_LB_DEVICE_MAP.ID, values);
	}

	/**
	 * Fetch a unique record that has <code>id = value</code>
	 */
	public org.apache.cloudstack.db.jooq.generated.tables.pojos.NetworkExternalLbDeviceMap fetchOneById(java.lang.Long value) {
		return fetchOne(org.apache.cloudstack.db.jooq.generated.tables.NetworkExternalLbDeviceMap.NETWORK_EXTERNAL_LB_DEVICE_MAP.ID, value);
	}

	/**
	 * Fetch records that have <code>uuid IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.NetworkExternalLbDeviceMap> fetchByUuid(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.NetworkExternalLbDeviceMap.NETWORK_EXTERNAL_LB_DEVICE_MAP.UUID, values);
	}

	/**
	 * Fetch a unique record that has <code>uuid = value</code>
	 */
	public org.apache.cloudstack.db.jooq.generated.tables.pojos.NetworkExternalLbDeviceMap fetchOneByUuid(java.lang.String value) {
		return fetchOne(org.apache.cloudstack.db.jooq.generated.tables.NetworkExternalLbDeviceMap.NETWORK_EXTERNAL_LB_DEVICE_MAP.UUID, value);
	}

	/**
	 * Fetch records that have <code>network_id IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.NetworkExternalLbDeviceMap> fetchByNetworkId(java.lang.Long... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.NetworkExternalLbDeviceMap.NETWORK_EXTERNAL_LB_DEVICE_MAP.NETWORK_ID, values);
	}

	/**
	 * Fetch records that have <code>external_load_balancer_device_id IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.NetworkExternalLbDeviceMap> fetchByExternalLoadBalancerDeviceId(java.lang.Long... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.NetworkExternalLbDeviceMap.NETWORK_EXTERNAL_LB_DEVICE_MAP.EXTERNAL_LOAD_BALANCER_DEVICE_ID, values);
	}

	/**
	 * Fetch records that have <code>created IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.NetworkExternalLbDeviceMap> fetchByCreated(java.sql.Timestamp... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.NetworkExternalLbDeviceMap.NETWORK_EXTERNAL_LB_DEVICE_MAP.CREATED, values);
	}

	/**
	 * Fetch records that have <code>removed IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.NetworkExternalLbDeviceMap> fetchByRemoved(java.sql.Timestamp... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.NetworkExternalLbDeviceMap.NETWORK_EXTERNAL_LB_DEVICE_MAP.REMOVED, values);
	}
}