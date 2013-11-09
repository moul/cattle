/**
 * This class is generated by jOOQ
 */
package org.apache.cloudstack.db.jooq.generated.tables.records;

/**
 * This class is generated by jOOQ.
 *
 * VIEW
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.2.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.persistence.Entity
@javax.persistence.Table(name = "free_ip_view", schema = "cloud")
public class FreeIpViewRecord extends org.jooq.impl.TableRecordImpl<org.apache.cloudstack.db.jooq.generated.tables.records.FreeIpViewRecord> implements org.jooq.Record1<java.lang.Long> {

	private static final long serialVersionUID = -81449616;

	/**
	 * Setter for <code>cloud.free_ip_view.free_ip</code>. 
	 */
	public void setFreeIp(java.lang.Long value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>cloud.free_ip_view.free_ip</code>. 
	 */
	@javax.persistence.Column(name = "free_ip", nullable = false, precision = 19)
	public java.lang.Long getFreeIp() {
		return (java.lang.Long) getValue(0);
	}

	// -------------------------------------------------------------------------
	// Record1 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row1<java.lang.Long> fieldsRow() {
		return (org.jooq.Row1) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row1<java.lang.Long> valuesRow() {
		return (org.jooq.Row1) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field1() {
		return org.apache.cloudstack.db.jooq.generated.tables.FreeIpView.FREE_IP_VIEW.FREE_IP;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value1() {
		return getFreeIp();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached FreeIpViewRecord
	 */
	public FreeIpViewRecord() {
		super(org.apache.cloudstack.db.jooq.generated.tables.FreeIpView.FREE_IP_VIEW);
	}

	/**
	 * Create a detached, initialised FreeIpViewRecord
	 */
	public FreeIpViewRecord(java.lang.Long freeIp) {
		super(org.apache.cloudstack.db.jooq.generated.tables.FreeIpView.FREE_IP_VIEW);

		setValue(0, freeIp);
	}
}