/**
 * This class is generated by jOOQ
 */
package org.apache.cloudstack.db.jooq.generated.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.2.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.persistence.Entity
@javax.persistence.Table(name = "vm_instance", schema = "cloud")
public class VmInstance implements java.io.Serializable {

	private static final long serialVersionUID = 887969105;

	private java.lang.Long     id;
	private java.lang.String   name;
	private java.lang.String   uuid;
	private java.lang.String   instanceName;
	private java.lang.String   state;
	private java.lang.Long     vmTemplateId;
	private java.lang.Long     guestOsId;
	private java.lang.String   privateMacAddress;
	private java.lang.String   privateIpAddress;
	private java.lang.Long     podId;
	private java.lang.Long     dataCenterId;
	private java.lang.Long     hostId;
	private java.lang.Long     lastHostId;
	private java.lang.Long     proxyId;
	private java.sql.Timestamp proxyAssignTime;
	private java.lang.String   vncPassword;
	private java.lang.Boolean  haEnabled;
	private java.lang.Boolean  limitCpuUse;
	private java.lang.Long     updateCount;
	private java.sql.Timestamp updateTime;
	private java.sql.Timestamp created;
	private java.sql.Timestamp removed;
	private java.lang.String   type;
	private java.lang.String   vmType;
	private java.lang.Long     accountId;
	private java.lang.Long     domainId;
	private java.lang.Long     serviceOfferingId;
	private java.lang.String   reservationId;
	private java.lang.String   hypervisorType;
	private java.lang.Long     diskOfferingId;
	private java.lang.Integer  cpu;
	private java.lang.Long     ram;
	private java.lang.String   owner;
	private java.lang.Integer  speed;
	private java.lang.String   hostName;
	private java.lang.String   displayName;
	private java.lang.String   desiredState;
	private java.lang.Boolean  dynamicallyScalable;
	private java.lang.Boolean  displayVm;
	private java.lang.String   powerState;
	private java.sql.Timestamp powerStateUpdateTime;
	private java.lang.Integer  powerStateUpdateCount;
	private java.lang.Long     powerHost;

	public VmInstance() {}

	public VmInstance(
		java.lang.Long     id,
		java.lang.String   name,
		java.lang.String   uuid,
		java.lang.String   instanceName,
		java.lang.String   state,
		java.lang.Long     vmTemplateId,
		java.lang.Long     guestOsId,
		java.lang.String   privateMacAddress,
		java.lang.String   privateIpAddress,
		java.lang.Long     podId,
		java.lang.Long     dataCenterId,
		java.lang.Long     hostId,
		java.lang.Long     lastHostId,
		java.lang.Long     proxyId,
		java.sql.Timestamp proxyAssignTime,
		java.lang.String   vncPassword,
		java.lang.Boolean  haEnabled,
		java.lang.Boolean  limitCpuUse,
		java.lang.Long     updateCount,
		java.sql.Timestamp updateTime,
		java.sql.Timestamp created,
		java.sql.Timestamp removed,
		java.lang.String   type,
		java.lang.String   vmType,
		java.lang.Long     accountId,
		java.lang.Long     domainId,
		java.lang.Long     serviceOfferingId,
		java.lang.String   reservationId,
		java.lang.String   hypervisorType,
		java.lang.Long     diskOfferingId,
		java.lang.Integer  cpu,
		java.lang.Long     ram,
		java.lang.String   owner,
		java.lang.Integer  speed,
		java.lang.String   hostName,
		java.lang.String   displayName,
		java.lang.String   desiredState,
		java.lang.Boolean  dynamicallyScalable,
		java.lang.Boolean  displayVm,
		java.lang.String   powerState,
		java.sql.Timestamp powerStateUpdateTime,
		java.lang.Integer  powerStateUpdateCount,
		java.lang.Long     powerHost
	) {
		this.id = id;
		this.name = name;
		this.uuid = uuid;
		this.instanceName = instanceName;
		this.state = state;
		this.vmTemplateId = vmTemplateId;
		this.guestOsId = guestOsId;
		this.privateMacAddress = privateMacAddress;
		this.privateIpAddress = privateIpAddress;
		this.podId = podId;
		this.dataCenterId = dataCenterId;
		this.hostId = hostId;
		this.lastHostId = lastHostId;
		this.proxyId = proxyId;
		this.proxyAssignTime = proxyAssignTime;
		this.vncPassword = vncPassword;
		this.haEnabled = haEnabled;
		this.limitCpuUse = limitCpuUse;
		this.updateCount = updateCount;
		this.updateTime = updateTime;
		this.created = created;
		this.removed = removed;
		this.type = type;
		this.vmType = vmType;
		this.accountId = accountId;
		this.domainId = domainId;
		this.serviceOfferingId = serviceOfferingId;
		this.reservationId = reservationId;
		this.hypervisorType = hypervisorType;
		this.diskOfferingId = diskOfferingId;
		this.cpu = cpu;
		this.ram = ram;
		this.owner = owner;
		this.speed = speed;
		this.hostName = hostName;
		this.displayName = displayName;
		this.desiredState = desiredState;
		this.dynamicallyScalable = dynamicallyScalable;
		this.displayVm = displayVm;
		this.powerState = powerState;
		this.powerStateUpdateTime = powerStateUpdateTime;
		this.powerStateUpdateCount = powerStateUpdateCount;
		this.powerHost = powerHost;
	}

	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 20)
	public java.lang.Long getId() {
		return this.id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	@javax.persistence.Column(name = "name", nullable = false, length = 255)
	public java.lang.String getName() {
		return this.name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	@javax.persistence.Column(name = "uuid", unique = true, length = 40)
	public java.lang.String getUuid() {
		return this.uuid;
	}

	public void setUuid(java.lang.String uuid) {
		this.uuid = uuid;
	}

	@javax.persistence.Column(name = "instance_name", nullable = false, length = 255)
	public java.lang.String getInstanceName() {
		return this.instanceName;
	}

	public void setInstanceName(java.lang.String instanceName) {
		this.instanceName = instanceName;
	}

	@javax.persistence.Column(name = "state", nullable = false, length = 32)
	public java.lang.String getState() {
		return this.state;
	}

	public void setState(java.lang.String state) {
		this.state = state;
	}

	@javax.persistence.Column(name = "vm_template_id", precision = 20)
	public java.lang.Long getVmTemplateId() {
		return this.vmTemplateId;
	}

	public void setVmTemplateId(java.lang.Long vmTemplateId) {
		this.vmTemplateId = vmTemplateId;
	}

	@javax.persistence.Column(name = "guest_os_id", nullable = false, precision = 20)
	public java.lang.Long getGuestOsId() {
		return this.guestOsId;
	}

	public void setGuestOsId(java.lang.Long guestOsId) {
		this.guestOsId = guestOsId;
	}

	@javax.persistence.Column(name = "private_mac_address", length = 17)
	public java.lang.String getPrivateMacAddress() {
		return this.privateMacAddress;
	}

	public void setPrivateMacAddress(java.lang.String privateMacAddress) {
		this.privateMacAddress = privateMacAddress;
	}

	@javax.persistence.Column(name = "private_ip_address", length = 40)
	public java.lang.String getPrivateIpAddress() {
		return this.privateIpAddress;
	}

	public void setPrivateIpAddress(java.lang.String privateIpAddress) {
		this.privateIpAddress = privateIpAddress;
	}

	@javax.persistence.Column(name = "pod_id", precision = 20)
	public java.lang.Long getPodId() {
		return this.podId;
	}

	public void setPodId(java.lang.Long podId) {
		this.podId = podId;
	}

	@javax.persistence.Column(name = "data_center_id", nullable = false, precision = 20)
	public java.lang.Long getDataCenterId() {
		return this.dataCenterId;
	}

	public void setDataCenterId(java.lang.Long dataCenterId) {
		this.dataCenterId = dataCenterId;
	}

	@javax.persistence.Column(name = "host_id", precision = 20)
	public java.lang.Long getHostId() {
		return this.hostId;
	}

	public void setHostId(java.lang.Long hostId) {
		this.hostId = hostId;
	}

	@javax.persistence.Column(name = "last_host_id", precision = 20)
	public java.lang.Long getLastHostId() {
		return this.lastHostId;
	}

	public void setLastHostId(java.lang.Long lastHostId) {
		this.lastHostId = lastHostId;
	}

	@javax.persistence.Column(name = "proxy_id", precision = 20)
	public java.lang.Long getProxyId() {
		return this.proxyId;
	}

	public void setProxyId(java.lang.Long proxyId) {
		this.proxyId = proxyId;
	}

	@javax.persistence.Column(name = "proxy_assign_time")
	public java.sql.Timestamp getProxyAssignTime() {
		return this.proxyAssignTime;
	}

	public void setProxyAssignTime(java.sql.Timestamp proxyAssignTime) {
		this.proxyAssignTime = proxyAssignTime;
	}

	@javax.persistence.Column(name = "vnc_password", nullable = false, length = 255)
	public java.lang.String getVncPassword() {
		return this.vncPassword;
	}

	public void setVncPassword(java.lang.String vncPassword) {
		this.vncPassword = vncPassword;
	}

	@javax.persistence.Column(name = "ha_enabled", nullable = false, precision = 1)
	public java.lang.Boolean getHaEnabled() {
		return this.haEnabled;
	}

	public void setHaEnabled(java.lang.Boolean haEnabled) {
		this.haEnabled = haEnabled;
	}

	@javax.persistence.Column(name = "limit_cpu_use", nullable = false, precision = 1)
	public java.lang.Boolean getLimitCpuUse() {
		return this.limitCpuUse;
	}

	public void setLimitCpuUse(java.lang.Boolean limitCpuUse) {
		this.limitCpuUse = limitCpuUse;
	}

	@javax.persistence.Column(name = "update_count", nullable = false, precision = 20)
	public java.lang.Long getUpdateCount() {
		return this.updateCount;
	}

	public void setUpdateCount(java.lang.Long updateCount) {
		this.updateCount = updateCount;
	}

	@javax.persistence.Column(name = "update_time")
	public java.sql.Timestamp getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(java.sql.Timestamp updateTime) {
		this.updateTime = updateTime;
	}

	@javax.persistence.Column(name = "created", nullable = false)
	public java.sql.Timestamp getCreated() {
		return this.created;
	}

	public void setCreated(java.sql.Timestamp created) {
		this.created = created;
	}

	@javax.persistence.Column(name = "removed")
	public java.sql.Timestamp getRemoved() {
		return this.removed;
	}

	public void setRemoved(java.sql.Timestamp removed) {
		this.removed = removed;
	}

	@javax.persistence.Column(name = "type", nullable = false, length = 32)
	public java.lang.String getType() {
		return this.type;
	}

	public void setType(java.lang.String type) {
		this.type = type;
	}

	@javax.persistence.Column(name = "vm_type", nullable = false, length = 32)
	public java.lang.String getVmType() {
		return this.vmType;
	}

	public void setVmType(java.lang.String vmType) {
		this.vmType = vmType;
	}

	@javax.persistence.Column(name = "account_id", nullable = false, precision = 20)
	public java.lang.Long getAccountId() {
		return this.accountId;
	}

	public void setAccountId(java.lang.Long accountId) {
		this.accountId = accountId;
	}

	@javax.persistence.Column(name = "domain_id", nullable = false, precision = 20)
	public java.lang.Long getDomainId() {
		return this.domainId;
	}

	public void setDomainId(java.lang.Long domainId) {
		this.domainId = domainId;
	}

	@javax.persistence.Column(name = "service_offering_id", nullable = false, precision = 20)
	public java.lang.Long getServiceOfferingId() {
		return this.serviceOfferingId;
	}

	public void setServiceOfferingId(java.lang.Long serviceOfferingId) {
		this.serviceOfferingId = serviceOfferingId;
	}

	@javax.persistence.Column(name = "reservation_id", length = 40)
	public java.lang.String getReservationId() {
		return this.reservationId;
	}

	public void setReservationId(java.lang.String reservationId) {
		this.reservationId = reservationId;
	}

	@javax.persistence.Column(name = "hypervisor_type", length = 32)
	public java.lang.String getHypervisorType() {
		return this.hypervisorType;
	}

	public void setHypervisorType(java.lang.String hypervisorType) {
		this.hypervisorType = hypervisorType;
	}

	@javax.persistence.Column(name = "disk_offering_id", precision = 20)
	public java.lang.Long getDiskOfferingId() {
		return this.diskOfferingId;
	}

	public void setDiskOfferingId(java.lang.Long diskOfferingId) {
		this.diskOfferingId = diskOfferingId;
	}

	@javax.persistence.Column(name = "cpu", precision = 10)
	public java.lang.Integer getCpu() {
		return this.cpu;
	}

	public void setCpu(java.lang.Integer cpu) {
		this.cpu = cpu;
	}

	@javax.persistence.Column(name = "ram", precision = 20)
	public java.lang.Long getRam() {
		return this.ram;
	}

	public void setRam(java.lang.Long ram) {
		this.ram = ram;
	}

	@javax.persistence.Column(name = "owner", length = 255)
	public java.lang.String getOwner() {
		return this.owner;
	}

	public void setOwner(java.lang.String owner) {
		this.owner = owner;
	}

	@javax.persistence.Column(name = "speed", precision = 10)
	public java.lang.Integer getSpeed() {
		return this.speed;
	}

	public void setSpeed(java.lang.Integer speed) {
		this.speed = speed;
	}

	@javax.persistence.Column(name = "host_name", length = 255)
	public java.lang.String getHostName() {
		return this.hostName;
	}

	public void setHostName(java.lang.String hostName) {
		this.hostName = hostName;
	}

	@javax.persistence.Column(name = "display_name", length = 255)
	public java.lang.String getDisplayName() {
		return this.displayName;
	}

	public void setDisplayName(java.lang.String displayName) {
		this.displayName = displayName;
	}

	@javax.persistence.Column(name = "desired_state", length = 32)
	public java.lang.String getDesiredState() {
		return this.desiredState;
	}

	public void setDesiredState(java.lang.String desiredState) {
		this.desiredState = desiredState;
	}

	@javax.persistence.Column(name = "dynamically_scalable", nullable = false, precision = 1)
	public java.lang.Boolean getDynamicallyScalable() {
		return this.dynamicallyScalable;
	}

	public void setDynamicallyScalable(java.lang.Boolean dynamicallyScalable) {
		this.dynamicallyScalable = dynamicallyScalable;
	}

	@javax.persistence.Column(name = "display_vm", nullable = false, precision = 1)
	public java.lang.Boolean getDisplayVm() {
		return this.displayVm;
	}

	public void setDisplayVm(java.lang.Boolean displayVm) {
		this.displayVm = displayVm;
	}

	@javax.persistence.Column(name = "power_state", length = 74)
	public java.lang.String getPowerState() {
		return this.powerState;
	}

	public void setPowerState(java.lang.String powerState) {
		this.powerState = powerState;
	}

	@javax.persistence.Column(name = "power_state_update_time")
	public java.sql.Timestamp getPowerStateUpdateTime() {
		return this.powerStateUpdateTime;
	}

	public void setPowerStateUpdateTime(java.sql.Timestamp powerStateUpdateTime) {
		this.powerStateUpdateTime = powerStateUpdateTime;
	}

	@javax.persistence.Column(name = "power_state_update_count", precision = 10)
	public java.lang.Integer getPowerStateUpdateCount() {
		return this.powerStateUpdateCount;
	}

	public void setPowerStateUpdateCount(java.lang.Integer powerStateUpdateCount) {
		this.powerStateUpdateCount = powerStateUpdateCount;
	}

	@javax.persistence.Column(name = "power_host", precision = 20)
	public java.lang.Long getPowerHost() {
		return this.powerHost;
	}

	public void setPowerHost(java.lang.Long powerHost) {
		this.powerHost = powerHost;
	}
}