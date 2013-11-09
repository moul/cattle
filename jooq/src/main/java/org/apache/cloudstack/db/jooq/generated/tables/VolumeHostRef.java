/**
 * This class is generated by jOOQ
 */
package org.apache.cloudstack.db.jooq.generated.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.2.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class VolumeHostRef extends org.jooq.impl.TableImpl<org.apache.cloudstack.db.jooq.generated.tables.records.VolumeHostRefRecord> {

	private static final long serialVersionUID = -1630510969;

	/**
	 * The singleton instance of <code>cloud.volume_host_ref</code>
	 */
	public static final org.apache.cloudstack.db.jooq.generated.tables.VolumeHostRef VOLUME_HOST_REF = new org.apache.cloudstack.db.jooq.generated.tables.VolumeHostRef();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.apache.cloudstack.db.jooq.generated.tables.records.VolumeHostRefRecord> getRecordType() {
		return org.apache.cloudstack.db.jooq.generated.tables.records.VolumeHostRefRecord.class;
	}

	/**
	 * The column <code>cloud.volume_host_ref.id</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.VolumeHostRefRecord, java.lang.Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this);

	/**
	 * The column <code>cloud.volume_host_ref.host_id</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.VolumeHostRefRecord, java.lang.Long> HOST_ID = createField("host_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this);

	/**
	 * The column <code>cloud.volume_host_ref.volume_id</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.VolumeHostRefRecord, java.lang.Long> VOLUME_ID = createField("volume_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this);

	/**
	 * The column <code>cloud.volume_host_ref.zone_id</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.VolumeHostRefRecord, java.lang.Long> ZONE_ID = createField("zone_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this);

	/**
	 * The column <code>cloud.volume_host_ref.created</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.VolumeHostRefRecord, java.sql.Timestamp> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this);

	/**
	 * The column <code>cloud.volume_host_ref.last_updated</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.VolumeHostRefRecord, java.sql.Timestamp> LAST_UPDATED = createField("last_updated", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * The column <code>cloud.volume_host_ref.job_id</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.VolumeHostRefRecord, java.lang.String> JOB_ID = createField("job_id", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>cloud.volume_host_ref.download_pct</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.VolumeHostRefRecord, java.lang.Integer> DOWNLOAD_PCT = createField("download_pct", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>cloud.volume_host_ref.size</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.VolumeHostRefRecord, java.lang.Long> SIZE = createField("size", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The column <code>cloud.volume_host_ref.physical_size</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.VolumeHostRefRecord, java.lang.Long> PHYSICAL_SIZE = createField("physical_size", org.jooq.impl.SQLDataType.BIGINT.defaulted(true), this);

	/**
	 * The column <code>cloud.volume_host_ref.download_state</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.VolumeHostRefRecord, java.lang.String> DOWNLOAD_STATE = createField("download_state", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>cloud.volume_host_ref.checksum</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.VolumeHostRefRecord, java.lang.String> CHECKSUM = createField("checksum", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>cloud.volume_host_ref.error_str</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.VolumeHostRefRecord, java.lang.String> ERROR_STR = createField("error_str", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>cloud.volume_host_ref.local_path</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.VolumeHostRefRecord, java.lang.String> LOCAL_PATH = createField("local_path", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>cloud.volume_host_ref.install_path</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.VolumeHostRefRecord, java.lang.String> INSTALL_PATH = createField("install_path", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>cloud.volume_host_ref.url</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.VolumeHostRefRecord, java.lang.String> URL = createField("url", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>cloud.volume_host_ref.format</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.VolumeHostRefRecord, java.lang.String> FORMAT = createField("format", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false), this);

	/**
	 * The column <code>cloud.volume_host_ref.destroyed</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.VolumeHostRefRecord, java.lang.Boolean> DESTROYED = createField("destroyed", org.jooq.impl.SQLDataType.BIT, this);

	/**
	 * Create a <code>cloud.volume_host_ref</code> table reference
	 */
	public VolumeHostRef() {
		super("volume_host_ref", org.apache.cloudstack.db.jooq.generated.Cloud.CLOUD);
	}

	/**
	 * Create an aliased <code>cloud.volume_host_ref</code> table reference
	 */
	public VolumeHostRef(java.lang.String alias) {
		super(alias, org.apache.cloudstack.db.jooq.generated.Cloud.CLOUD, org.apache.cloudstack.db.jooq.generated.tables.VolumeHostRef.VOLUME_HOST_REF);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<org.apache.cloudstack.db.jooq.generated.tables.records.VolumeHostRefRecord, java.lang.Long> getIdentity() {
		return org.apache.cloudstack.db.jooq.generated.Keys.IDENTITY_VOLUME_HOST_REF;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.apache.cloudstack.db.jooq.generated.tables.records.VolumeHostRefRecord> getPrimaryKey() {
		return org.apache.cloudstack.db.jooq.generated.Keys.KEY_VOLUME_HOST_REF_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.apache.cloudstack.db.jooq.generated.tables.records.VolumeHostRefRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.apache.cloudstack.db.jooq.generated.tables.records.VolumeHostRefRecord>>asList(org.apache.cloudstack.db.jooq.generated.Keys.KEY_VOLUME_HOST_REF_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.apache.cloudstack.db.jooq.generated.tables.records.VolumeHostRefRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.apache.cloudstack.db.jooq.generated.tables.records.VolumeHostRefRecord, ?>>asList(org.apache.cloudstack.db.jooq.generated.Keys.FK_VOLUME_HOST_REF__HOST_ID, org.apache.cloudstack.db.jooq.generated.Keys.FK_VOLUME_HOST_REF__VOLUME_ID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.apache.cloudstack.db.jooq.generated.tables.VolumeHostRef as(java.lang.String alias) {
		return new org.apache.cloudstack.db.jooq.generated.tables.VolumeHostRef(alias);
	}
}