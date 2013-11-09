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
@javax.persistence.Table(name = "load_balancer_vm_map", schema = "cloud", uniqueConstraints = {
	@javax.persistence.UniqueConstraint(columnNames = {"load_balancer_id", "instance_id"})
})
public class LoadBalancerVmMapRecord extends org.jooq.impl.UpdatableRecordImpl<org.apache.cloudstack.db.jooq.generated.tables.records.LoadBalancerVmMapRecord> implements org.jooq.Record5<java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Boolean, java.lang.String> {

	private static final long serialVersionUID = 694280473;

	/**
	 * Setter for <code>cloud.load_balancer_vm_map.id</code>. 
	 */
	public void setId(java.lang.Long value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>cloud.load_balancer_vm_map.id</code>. 
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 20)
	public java.lang.Long getId() {
		return (java.lang.Long) getValue(0);
	}

	/**
	 * Setter for <code>cloud.load_balancer_vm_map.load_balancer_id</code>. 
	 */
	public void setLoadBalancerId(java.lang.Long value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>cloud.load_balancer_vm_map.load_balancer_id</code>. 
	 */
	@javax.persistence.Column(name = "load_balancer_id", nullable = false, precision = 20)
	public java.lang.Long getLoadBalancerId() {
		return (java.lang.Long) getValue(1);
	}

	/**
	 * Setter for <code>cloud.load_balancer_vm_map.instance_id</code>. 
	 */
	public void setInstanceId(java.lang.Long value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>cloud.load_balancer_vm_map.instance_id</code>. 
	 */
	@javax.persistence.Column(name = "instance_id", nullable = false, precision = 20)
	public java.lang.Long getInstanceId() {
		return (java.lang.Long) getValue(2);
	}

	/**
	 * Setter for <code>cloud.load_balancer_vm_map.revoke</code>. 
	 */
	public void setRevoke(java.lang.Boolean value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>cloud.load_balancer_vm_map.revoke</code>. 
	 */
	@javax.persistence.Column(name = "revoke", nullable = false, precision = 1)
	public java.lang.Boolean getRevoke() {
		return (java.lang.Boolean) getValue(3);
	}

	/**
	 * Setter for <code>cloud.load_balancer_vm_map.state</code>. 
	 */
	public void setState(java.lang.String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>cloud.load_balancer_vm_map.state</code>. 
	 */
	@javax.persistence.Column(name = "state", length = 40)
	public java.lang.String getState() {
		return (java.lang.String) getValue(4);
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
	// Record5 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row5<java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Boolean, java.lang.String> fieldsRow() {
		return (org.jooq.Row5) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row5<java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Boolean, java.lang.String> valuesRow() {
		return (org.jooq.Row5) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field1() {
		return org.apache.cloudstack.db.jooq.generated.tables.LoadBalancerVmMap.LOAD_BALANCER_VM_MAP.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field2() {
		return org.apache.cloudstack.db.jooq.generated.tables.LoadBalancerVmMap.LOAD_BALANCER_VM_MAP.LOAD_BALANCER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field3() {
		return org.apache.cloudstack.db.jooq.generated.tables.LoadBalancerVmMap.LOAD_BALANCER_VM_MAP.INSTANCE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Boolean> field4() {
		return org.apache.cloudstack.db.jooq.generated.tables.LoadBalancerVmMap.LOAD_BALANCER_VM_MAP.REVOKE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return org.apache.cloudstack.db.jooq.generated.tables.LoadBalancerVmMap.LOAD_BALANCER_VM_MAP.STATE;
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
	public java.lang.Long value2() {
		return getLoadBalancerId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value3() {
		return getInstanceId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Boolean value4() {
		return getRevoke();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value5() {
		return getState();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached LoadBalancerVmMapRecord
	 */
	public LoadBalancerVmMapRecord() {
		super(org.apache.cloudstack.db.jooq.generated.tables.LoadBalancerVmMap.LOAD_BALANCER_VM_MAP);
	}

	/**
	 * Create a detached, initialised LoadBalancerVmMapRecord
	 */
	public LoadBalancerVmMapRecord(java.lang.Long id, java.lang.Long loadBalancerId, java.lang.Long instanceId, java.lang.Boolean revoke, java.lang.String state) {
		super(org.apache.cloudstack.db.jooq.generated.tables.LoadBalancerVmMap.LOAD_BALANCER_VM_MAP);

		setValue(0, id);
		setValue(1, loadBalancerId);
		setValue(2, instanceId);
		setValue(3, revoke);
		setValue(4, state);
	}
}