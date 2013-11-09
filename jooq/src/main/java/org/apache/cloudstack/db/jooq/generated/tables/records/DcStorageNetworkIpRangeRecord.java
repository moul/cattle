/**
 * This class is generated by jOOQ
 */
package org.apache.cloudstack.db.jooq.generated.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.2.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.persistence.Entity
@javax.persistence.Table(name = "dc_storage_network_ip_range", schema = "cloud")
public class DcStorageNetworkIpRangeRecord extends org.jooq.impl.UpdatableRecordImpl<org.apache.cloudstack.db.jooq.generated.tables.records.DcStorageNetworkIpRangeRecord> implements org.jooq.Record10<java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.Long, java.lang.Long, java.lang.Long> {

	private static final long serialVersionUID = -1866711417;

	/**
	 * Setter for <code>cloud.dc_storage_network_ip_range.id</code>. 
	 */
	public void setId(java.lang.Long value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>cloud.dc_storage_network_ip_range.id</code>. 
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 20)
	public java.lang.Long getId() {
		return (java.lang.Long) getValue(0);
	}

	/**
	 * Setter for <code>cloud.dc_storage_network_ip_range.uuid</code>. 
	 */
	public void setUuid(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>cloud.dc_storage_network_ip_range.uuid</code>. 
	 */
	@javax.persistence.Column(name = "uuid", unique = true, length = 40)
	public java.lang.String getUuid() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>cloud.dc_storage_network_ip_range.start_ip</code>. 
	 */
	public void setStartIp(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>cloud.dc_storage_network_ip_range.start_ip</code>. 
	 */
	@javax.persistence.Column(name = "start_ip", nullable = false, length = 40)
	public java.lang.String getStartIp() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>cloud.dc_storage_network_ip_range.end_ip</code>. 
	 */
	public void setEndIp(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>cloud.dc_storage_network_ip_range.end_ip</code>. 
	 */
	@javax.persistence.Column(name = "end_ip", nullable = false, length = 40)
	public java.lang.String getEndIp() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>cloud.dc_storage_network_ip_range.gateway</code>. 
	 */
	public void setGateway(java.lang.String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>cloud.dc_storage_network_ip_range.gateway</code>. 
	 */
	@javax.persistence.Column(name = "gateway", nullable = false, length = 15)
	public java.lang.String getGateway() {
		return (java.lang.String) getValue(4);
	}

	/**
	 * Setter for <code>cloud.dc_storage_network_ip_range.vlan</code>. 
	 */
	public void setVlan(java.lang.Integer value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>cloud.dc_storage_network_ip_range.vlan</code>. 
	 */
	@javax.persistence.Column(name = "vlan", precision = 10)
	public java.lang.Integer getVlan() {
		return (java.lang.Integer) getValue(5);
	}

	/**
	 * Setter for <code>cloud.dc_storage_network_ip_range.netmask</code>. 
	 */
	public void setNetmask(java.lang.String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>cloud.dc_storage_network_ip_range.netmask</code>. 
	 */
	@javax.persistence.Column(name = "netmask", nullable = false, length = 15)
	public java.lang.String getNetmask() {
		return (java.lang.String) getValue(6);
	}

	/**
	 * Setter for <code>cloud.dc_storage_network_ip_range.data_center_id</code>. 
	 */
	public void setDataCenterId(java.lang.Long value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>cloud.dc_storage_network_ip_range.data_center_id</code>. 
	 */
	@javax.persistence.Column(name = "data_center_id", nullable = false, precision = 20)
	public java.lang.Long getDataCenterId() {
		return (java.lang.Long) getValue(7);
	}

	/**
	 * Setter for <code>cloud.dc_storage_network_ip_range.pod_id</code>. 
	 */
	public void setPodId(java.lang.Long value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>cloud.dc_storage_network_ip_range.pod_id</code>. 
	 */
	@javax.persistence.Column(name = "pod_id", nullable = false, precision = 20)
	public java.lang.Long getPodId() {
		return (java.lang.Long) getValue(8);
	}

	/**
	 * Setter for <code>cloud.dc_storage_network_ip_range.network_id</code>. 
	 */
	public void setNetworkId(java.lang.Long value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>cloud.dc_storage_network_ip_range.network_id</code>. 
	 */
	@javax.persistence.Column(name = "network_id", nullable = false, precision = 20)
	public java.lang.Long getNetworkId() {
		return (java.lang.Long) getValue(9);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Long> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record10 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row10<java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.Long, java.lang.Long, java.lang.Long> fieldsRow() {
		return (org.jooq.Row10) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row10<java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.Long, java.lang.Long, java.lang.Long> valuesRow() {
		return (org.jooq.Row10) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field1() {
		return org.apache.cloudstack.db.jooq.generated.tables.DcStorageNetworkIpRange.DC_STORAGE_NETWORK_IP_RANGE.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return org.apache.cloudstack.db.jooq.generated.tables.DcStorageNetworkIpRange.DC_STORAGE_NETWORK_IP_RANGE.UUID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return org.apache.cloudstack.db.jooq.generated.tables.DcStorageNetworkIpRange.DC_STORAGE_NETWORK_IP_RANGE.START_IP;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return org.apache.cloudstack.db.jooq.generated.tables.DcStorageNetworkIpRange.DC_STORAGE_NETWORK_IP_RANGE.END_IP;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return org.apache.cloudstack.db.jooq.generated.tables.DcStorageNetworkIpRange.DC_STORAGE_NETWORK_IP_RANGE.GATEWAY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field6() {
		return org.apache.cloudstack.db.jooq.generated.tables.DcStorageNetworkIpRange.DC_STORAGE_NETWORK_IP_RANGE.VLAN;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field7() {
		return org.apache.cloudstack.db.jooq.generated.tables.DcStorageNetworkIpRange.DC_STORAGE_NETWORK_IP_RANGE.NETMASK;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field8() {
		return org.apache.cloudstack.db.jooq.generated.tables.DcStorageNetworkIpRange.DC_STORAGE_NETWORK_IP_RANGE.DATA_CENTER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field9() {
		return org.apache.cloudstack.db.jooq.generated.tables.DcStorageNetworkIpRange.DC_STORAGE_NETWORK_IP_RANGE.POD_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field10() {
		return org.apache.cloudstack.db.jooq.generated.tables.DcStorageNetworkIpRange.DC_STORAGE_NETWORK_IP_RANGE.NETWORK_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getUuid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getStartIp();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getEndIp();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value5() {
		return getGateway();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value6() {
		return getVlan();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value7() {
		return getNetmask();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value8() {
		return getDataCenterId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value9() {
		return getPodId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value10() {
		return getNetworkId();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached DcStorageNetworkIpRangeRecord
	 */
	public DcStorageNetworkIpRangeRecord() {
		super(org.apache.cloudstack.db.jooq.generated.tables.DcStorageNetworkIpRange.DC_STORAGE_NETWORK_IP_RANGE);
	}

	/**
	 * Create a detached, initialised DcStorageNetworkIpRangeRecord
	 */
	public DcStorageNetworkIpRangeRecord(java.lang.Long id, java.lang.String uuid, java.lang.String startIp, java.lang.String endIp, java.lang.String gateway, java.lang.Integer vlan, java.lang.String netmask, java.lang.Long dataCenterId, java.lang.Long podId, java.lang.Long networkId) {
		super(org.apache.cloudstack.db.jooq.generated.tables.DcStorageNetworkIpRange.DC_STORAGE_NETWORK_IP_RANGE);

		setValue(0, id);
		setValue(1, uuid);
		setValue(2, startIp);
		setValue(3, endIp);
		setValue(4, gateway);
		setValue(5, vlan);
		setValue(6, netmask);
		setValue(7, dataCenterId);
		setValue(8, podId);
		setValue(9, networkId);
	}
}