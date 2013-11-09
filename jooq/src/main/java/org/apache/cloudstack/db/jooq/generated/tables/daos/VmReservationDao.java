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
public class VmReservationDao extends org.jooq.impl.DAOImpl<org.apache.cloudstack.db.jooq.generated.tables.records.VmReservationRecord, org.apache.cloudstack.db.jooq.generated.tables.pojos.VmReservation, java.lang.Long> {

	/**
	 * Create a new VmReservationDao without any configuration
	 */
	public VmReservationDao() {
		super(org.apache.cloudstack.db.jooq.generated.tables.VmReservation.VM_RESERVATION, org.apache.cloudstack.db.jooq.generated.tables.pojos.VmReservation.class);
	}

	/**
	 * Create a new VmReservationDao with an attached configuration
	 */
	public VmReservationDao(org.jooq.Configuration configuration) {
		super(org.apache.cloudstack.db.jooq.generated.tables.VmReservation.VM_RESERVATION, org.apache.cloudstack.db.jooq.generated.tables.pojos.VmReservation.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected java.lang.Long getId(org.apache.cloudstack.db.jooq.generated.tables.pojos.VmReservation object) {
		return object.getId();
	}

	/**
	 * Fetch records that have <code>id IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.VmReservation> fetchById(java.lang.Long... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.VmReservation.VM_RESERVATION.ID, values);
	}

	/**
	 * Fetch a unique record that has <code>id = value</code>
	 */
	public org.apache.cloudstack.db.jooq.generated.tables.pojos.VmReservation fetchOneById(java.lang.Long value) {
		return fetchOne(org.apache.cloudstack.db.jooq.generated.tables.VmReservation.VM_RESERVATION.ID, value);
	}

	/**
	 * Fetch records that have <code>uuid IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.VmReservation> fetchByUuid(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.VmReservation.VM_RESERVATION.UUID, values);
	}

	/**
	 * Fetch a unique record that has <code>uuid = value</code>
	 */
	public org.apache.cloudstack.db.jooq.generated.tables.pojos.VmReservation fetchOneByUuid(java.lang.String value) {
		return fetchOne(org.apache.cloudstack.db.jooq.generated.tables.VmReservation.VM_RESERVATION.UUID, value);
	}

	/**
	 * Fetch records that have <code>vm_id IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.VmReservation> fetchByVmId(java.lang.Long... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.VmReservation.VM_RESERVATION.VM_ID, values);
	}

	/**
	 * Fetch records that have <code>data_center_id IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.VmReservation> fetchByDataCenterId(java.lang.Long... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.VmReservation.VM_RESERVATION.DATA_CENTER_ID, values);
	}

	/**
	 * Fetch records that have <code>pod_id IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.VmReservation> fetchByPodId(java.lang.Long... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.VmReservation.VM_RESERVATION.POD_ID, values);
	}

	/**
	 * Fetch records that have <code>cluster_id IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.VmReservation> fetchByClusterId(java.lang.Long... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.VmReservation.VM_RESERVATION.CLUSTER_ID, values);
	}

	/**
	 * Fetch records that have <code>host_id IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.VmReservation> fetchByHostId(java.lang.Long... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.VmReservation.VM_RESERVATION.HOST_ID, values);
	}

	/**
	 * Fetch records that have <code>created IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.VmReservation> fetchByCreated(java.sql.Timestamp... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.VmReservation.VM_RESERVATION.CREATED, values);
	}

	/**
	 * Fetch records that have <code>removed IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.VmReservation> fetchByRemoved(java.sql.Timestamp... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.VmReservation.VM_RESERVATION.REMOVED, values);
	}
}