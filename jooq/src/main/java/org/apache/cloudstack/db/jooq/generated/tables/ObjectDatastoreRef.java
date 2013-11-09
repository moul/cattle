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
public class ObjectDatastoreRef extends org.jooq.impl.TableImpl<org.apache.cloudstack.db.jooq.generated.tables.records.ObjectDatastoreRefRecord> {

	private static final long serialVersionUID = -987937390;

	/**
	 * The singleton instance of <code>cloud.object_datastore_ref</code>
	 */
	public static final org.apache.cloudstack.db.jooq.generated.tables.ObjectDatastoreRef OBJECT_DATASTORE_REF = new org.apache.cloudstack.db.jooq.generated.tables.ObjectDatastoreRef();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.apache.cloudstack.db.jooq.generated.tables.records.ObjectDatastoreRefRecord> getRecordType() {
		return org.apache.cloudstack.db.jooq.generated.tables.records.ObjectDatastoreRefRecord.class;
	}

	/**
	 * The column <code>cloud.object_datastore_ref.id</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.ObjectDatastoreRefRecord, java.lang.Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this);

	/**
	 * The column <code>cloud.object_datastore_ref.datastore_uuid</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.ObjectDatastoreRefRecord, java.lang.String> DATASTORE_UUID = createField("datastore_uuid", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this);

	/**
	 * The column <code>cloud.object_datastore_ref.datastore_role</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.ObjectDatastoreRefRecord, java.lang.String> DATASTORE_ROLE = createField("datastore_role", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this);

	/**
	 * The column <code>cloud.object_datastore_ref.object_uuid</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.ObjectDatastoreRefRecord, java.lang.String> OBJECT_UUID = createField("object_uuid", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this);

	/**
	 * The column <code>cloud.object_datastore_ref.object_type</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.ObjectDatastoreRefRecord, java.lang.String> OBJECT_TYPE = createField("object_type", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this);

	/**
	 * The column <code>cloud.object_datastore_ref.created</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.ObjectDatastoreRefRecord, java.sql.Timestamp> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this);

	/**
	 * The column <code>cloud.object_datastore_ref.last_updated</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.ObjectDatastoreRefRecord, java.sql.Timestamp> LAST_UPDATED = createField("last_updated", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * The column <code>cloud.object_datastore_ref.job_id</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.ObjectDatastoreRefRecord, java.lang.String> JOB_ID = createField("job_id", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>cloud.object_datastore_ref.download_pct</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.ObjectDatastoreRefRecord, java.lang.Integer> DOWNLOAD_PCT = createField("download_pct", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>cloud.object_datastore_ref.download_state</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.ObjectDatastoreRefRecord, java.lang.String> DOWNLOAD_STATE = createField("download_state", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>cloud.object_datastore_ref.url</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.ObjectDatastoreRefRecord, java.lang.String> URL = createField("url", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>cloud.object_datastore_ref.format</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.ObjectDatastoreRefRecord, java.lang.String> FORMAT = createField("format", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>cloud.object_datastore_ref.checksum</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.ObjectDatastoreRefRecord, java.lang.String> CHECKSUM = createField("checksum", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>cloud.object_datastore_ref.error_str</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.ObjectDatastoreRefRecord, java.lang.String> ERROR_STR = createField("error_str", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>cloud.object_datastore_ref.local_path</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.ObjectDatastoreRefRecord, java.lang.String> LOCAL_PATH = createField("local_path", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>cloud.object_datastore_ref.install_path</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.ObjectDatastoreRefRecord, java.lang.String> INSTALL_PATH = createField("install_path", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>cloud.object_datastore_ref.size</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.ObjectDatastoreRefRecord, java.lang.Long> SIZE = createField("size", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The column <code>cloud.object_datastore_ref.state</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.ObjectDatastoreRefRecord, java.lang.String> STATE = createField("state", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this);

	/**
	 * The column <code>cloud.object_datastore_ref.update_count</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.ObjectDatastoreRefRecord, java.lang.Long> UPDATE_COUNT = createField("update_count", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this);

	/**
	 * The column <code>cloud.object_datastore_ref.updated</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.ObjectDatastoreRefRecord, java.sql.Timestamp> UPDATED = createField("updated", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * Create a <code>cloud.object_datastore_ref</code> table reference
	 */
	public ObjectDatastoreRef() {
		super("object_datastore_ref", org.apache.cloudstack.db.jooq.generated.Cloud.CLOUD);
	}

	/**
	 * Create an aliased <code>cloud.object_datastore_ref</code> table reference
	 */
	public ObjectDatastoreRef(java.lang.String alias) {
		super(alias, org.apache.cloudstack.db.jooq.generated.Cloud.CLOUD, org.apache.cloudstack.db.jooq.generated.tables.ObjectDatastoreRef.OBJECT_DATASTORE_REF);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<org.apache.cloudstack.db.jooq.generated.tables.records.ObjectDatastoreRefRecord, java.lang.Long> getIdentity() {
		return org.apache.cloudstack.db.jooq.generated.Keys.IDENTITY_OBJECT_DATASTORE_REF;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.apache.cloudstack.db.jooq.generated.tables.records.ObjectDatastoreRefRecord> getPrimaryKey() {
		return org.apache.cloudstack.db.jooq.generated.Keys.KEY_OBJECT_DATASTORE_REF_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.apache.cloudstack.db.jooq.generated.tables.records.ObjectDatastoreRefRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.apache.cloudstack.db.jooq.generated.tables.records.ObjectDatastoreRefRecord>>asList(org.apache.cloudstack.db.jooq.generated.Keys.KEY_OBJECT_DATASTORE_REF_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.apache.cloudstack.db.jooq.generated.tables.ObjectDatastoreRef as(java.lang.String alias) {
		return new org.apache.cloudstack.db.jooq.generated.tables.ObjectDatastoreRef(alias);
	}
}