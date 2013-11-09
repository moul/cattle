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
public class SnapshotsDao extends org.jooq.impl.DAOImpl<org.apache.cloudstack.db.jooq.generated.tables.records.SnapshotsRecord, org.apache.cloudstack.db.jooq.generated.tables.pojos.Snapshots, java.lang.Long> {

	/**
	 * Create a new SnapshotsDao without any configuration
	 */
	public SnapshotsDao() {
		super(org.apache.cloudstack.db.jooq.generated.tables.Snapshots.SNAPSHOTS, org.apache.cloudstack.db.jooq.generated.tables.pojos.Snapshots.class);
	}

	/**
	 * Create a new SnapshotsDao with an attached configuration
	 */
	public SnapshotsDao(org.jooq.Configuration configuration) {
		super(org.apache.cloudstack.db.jooq.generated.tables.Snapshots.SNAPSHOTS, org.apache.cloudstack.db.jooq.generated.tables.pojos.Snapshots.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected java.lang.Long getId(org.apache.cloudstack.db.jooq.generated.tables.pojos.Snapshots object) {
		return object.getId();
	}

	/**
	 * Fetch records that have <code>id IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.Snapshots> fetchById(java.lang.Long... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.Snapshots.SNAPSHOTS.ID, values);
	}

	/**
	 * Fetch a unique record that has <code>id = value</code>
	 */
	public org.apache.cloudstack.db.jooq.generated.tables.pojos.Snapshots fetchOneById(java.lang.Long value) {
		return fetchOne(org.apache.cloudstack.db.jooq.generated.tables.Snapshots.SNAPSHOTS.ID, value);
	}

	/**
	 * Fetch records that have <code>data_center_id IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.Snapshots> fetchByDataCenterId(java.lang.Long... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.Snapshots.SNAPSHOTS.DATA_CENTER_ID, values);
	}

	/**
	 * Fetch records that have <code>account_id IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.Snapshots> fetchByAccountId(java.lang.Long... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.Snapshots.SNAPSHOTS.ACCOUNT_ID, values);
	}

	/**
	 * Fetch records that have <code>domain_id IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.Snapshots> fetchByDomainId(java.lang.Long... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.Snapshots.SNAPSHOTS.DOMAIN_ID, values);
	}

	/**
	 * Fetch records that have <code>volume_id IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.Snapshots> fetchByVolumeId(java.lang.Long... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.Snapshots.SNAPSHOTS.VOLUME_ID, values);
	}

	/**
	 * Fetch records that have <code>disk_offering_id IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.Snapshots> fetchByDiskOfferingId(java.lang.Long... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.Snapshots.SNAPSHOTS.DISK_OFFERING_ID, values);
	}

	/**
	 * Fetch records that have <code>status IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.Snapshots> fetchByStatus(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.Snapshots.SNAPSHOTS.STATUS, values);
	}

	/**
	 * Fetch records that have <code>path IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.Snapshots> fetchByPath(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.Snapshots.SNAPSHOTS.PATH, values);
	}

	/**
	 * Fetch records that have <code>name IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.Snapshots> fetchByName(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.Snapshots.SNAPSHOTS.NAME, values);
	}

	/**
	 * Fetch records that have <code>uuid IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.Snapshots> fetchByUuid(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.Snapshots.SNAPSHOTS.UUID, values);
	}

	/**
	 * Fetch a unique record that has <code>uuid = value</code>
	 */
	public org.apache.cloudstack.db.jooq.generated.tables.pojos.Snapshots fetchOneByUuid(java.lang.String value) {
		return fetchOne(org.apache.cloudstack.db.jooq.generated.tables.Snapshots.SNAPSHOTS.UUID, value);
	}

	/**
	 * Fetch records that have <code>snapshot_type IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.Snapshots> fetchBySnapshotType(java.lang.Integer... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.Snapshots.SNAPSHOTS.SNAPSHOT_TYPE, values);
	}

	/**
	 * Fetch records that have <code>type_description IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.Snapshots> fetchByTypeDescription(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.Snapshots.SNAPSHOTS.TYPE_DESCRIPTION, values);
	}

	/**
	 * Fetch records that have <code>size IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.Snapshots> fetchBySize(java.lang.Long... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.Snapshots.SNAPSHOTS.SIZE, values);
	}

	/**
	 * Fetch records that have <code>created IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.Snapshots> fetchByCreated(java.sql.Timestamp... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.Snapshots.SNAPSHOTS.CREATED, values);
	}

	/**
	 * Fetch records that have <code>removed IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.Snapshots> fetchByRemoved(java.sql.Timestamp... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.Snapshots.SNAPSHOTS.REMOVED, values);
	}

	/**
	 * Fetch records that have <code>backup_snap_id IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.Snapshots> fetchByBackupSnapId(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.Snapshots.SNAPSHOTS.BACKUP_SNAP_ID, values);
	}

	/**
	 * Fetch records that have <code>swift_id IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.Snapshots> fetchBySwiftId(java.lang.Long... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.Snapshots.SNAPSHOTS.SWIFT_ID, values);
	}

	/**
	 * Fetch records that have <code>sechost_id IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.Snapshots> fetchBySechostId(java.lang.Long... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.Snapshots.SNAPSHOTS.SECHOST_ID, values);
	}

	/**
	 * Fetch records that have <code>prev_snap_id IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.Snapshots> fetchByPrevSnapId(java.lang.Long... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.Snapshots.SNAPSHOTS.PREV_SNAP_ID, values);
	}

	/**
	 * Fetch records that have <code>hypervisor_type IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.Snapshots> fetchByHypervisorType(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.Snapshots.SNAPSHOTS.HYPERVISOR_TYPE, values);
	}

	/**
	 * Fetch records that have <code>version IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.Snapshots> fetchByVersion(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.Snapshots.SNAPSHOTS.VERSION, values);
	}

	/**
	 * Fetch records that have <code>s3_id IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.Snapshots> fetchByS3Id(java.lang.Long... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.Snapshots.SNAPSHOTS.S3_ID, values);
	}
}