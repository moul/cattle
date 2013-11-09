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
public class Domain extends org.jooq.impl.TableImpl<org.apache.cloudstack.db.jooq.generated.tables.records.DomainRecord> {

	private static final long serialVersionUID = 1094693768;

	/**
	 * The singleton instance of <code>cloud.domain</code>
	 */
	public static final org.apache.cloudstack.db.jooq.generated.tables.Domain DOMAIN = new org.apache.cloudstack.db.jooq.generated.tables.Domain();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.apache.cloudstack.db.jooq.generated.tables.records.DomainRecord> getRecordType() {
		return org.apache.cloudstack.db.jooq.generated.tables.records.DomainRecord.class;
	}

	/**
	 * The column <code>cloud.domain.id</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.DomainRecord, java.lang.Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this);

	/**
	 * The column <code>cloud.domain.parent</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.DomainRecord, java.lang.Long> PARENT = createField("parent", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The column <code>cloud.domain.name</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.DomainRecord, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>cloud.domain.uuid</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.DomainRecord, java.lang.String> UUID = createField("uuid", org.jooq.impl.SQLDataType.VARCHAR.length(40), this);

	/**
	 * The column <code>cloud.domain.owner</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.DomainRecord, java.lang.Long> OWNER = createField("owner", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this);

	/**
	 * The column <code>cloud.domain.path</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.DomainRecord, java.lang.String> PATH = createField("path", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this);

	/**
	 * The column <code>cloud.domain.level</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.DomainRecord, java.lang.Integer> LEVEL = createField("level", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this);

	/**
	 * The column <code>cloud.domain.child_count</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.DomainRecord, java.lang.Integer> CHILD_COUNT = createField("child_count", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this);

	/**
	 * The column <code>cloud.domain.next_child_seq</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.DomainRecord, java.lang.Long> NEXT_CHILD_SEQ = createField("next_child_seq", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaulted(true), this);

	/**
	 * The column <code>cloud.domain.removed</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.DomainRecord, java.sql.Timestamp> REMOVED = createField("removed", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * The column <code>cloud.domain.state</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.DomainRecord, java.lang.String> STATE = createField("state", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false).defaulted(true), this);

	/**
	 * The column <code>cloud.domain.network_domain</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.DomainRecord, java.lang.String> NETWORK_DOMAIN = createField("network_domain", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>cloud.domain.type</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.DomainRecord, java.lang.String> TYPE = createField("type", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false).defaulted(true), this);

	/**
	 * Create a <code>cloud.domain</code> table reference
	 */
	public Domain() {
		super("domain", org.apache.cloudstack.db.jooq.generated.Cloud.CLOUD);
	}

	/**
	 * Create an aliased <code>cloud.domain</code> table reference
	 */
	public Domain(java.lang.String alias) {
		super(alias, org.apache.cloudstack.db.jooq.generated.Cloud.CLOUD, org.apache.cloudstack.db.jooq.generated.tables.Domain.DOMAIN);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<org.apache.cloudstack.db.jooq.generated.tables.records.DomainRecord, java.lang.Long> getIdentity() {
		return org.apache.cloudstack.db.jooq.generated.Keys.IDENTITY_DOMAIN;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.apache.cloudstack.db.jooq.generated.tables.records.DomainRecord> getPrimaryKey() {
		return org.apache.cloudstack.db.jooq.generated.Keys.KEY_DOMAIN_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.apache.cloudstack.db.jooq.generated.tables.records.DomainRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.apache.cloudstack.db.jooq.generated.tables.records.DomainRecord>>asList(org.apache.cloudstack.db.jooq.generated.Keys.KEY_DOMAIN_PRIMARY, org.apache.cloudstack.db.jooq.generated.Keys.KEY_DOMAIN_PARENT, org.apache.cloudstack.db.jooq.generated.Keys.KEY_DOMAIN_UC_DOMAIN__UUID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.apache.cloudstack.db.jooq.generated.tables.Domain as(java.lang.String alias) {
		return new org.apache.cloudstack.db.jooq.generated.tables.Domain(alias);
	}
}