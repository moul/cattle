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
public class VmTemplate extends org.jooq.impl.TableImpl<org.apache.cloudstack.db.jooq.generated.tables.records.VmTemplateRecord> {

	private static final long serialVersionUID = 345772128;

	/**
	 * The singleton instance of <code>cloud.vm_template</code>
	 */
	public static final org.apache.cloudstack.db.jooq.generated.tables.VmTemplate VM_TEMPLATE = new org.apache.cloudstack.db.jooq.generated.tables.VmTemplate();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.apache.cloudstack.db.jooq.generated.tables.records.VmTemplateRecord> getRecordType() {
		return org.apache.cloudstack.db.jooq.generated.tables.records.VmTemplateRecord.class;
	}

	/**
	 * The column <code>cloud.vm_template.id</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.VmTemplateRecord, java.lang.Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this);

	/**
	 * The column <code>cloud.vm_template.unique_name</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.VmTemplateRecord, java.lang.String> UNIQUE_NAME = createField("unique_name", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this);

	/**
	 * The column <code>cloud.vm_template.name</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.VmTemplateRecord, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this);

	/**
	 * The column <code>cloud.vm_template.uuid</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.VmTemplateRecord, java.lang.String> UUID = createField("uuid", org.jooq.impl.SQLDataType.VARCHAR.length(40), this);

	/**
	 * The column <code>cloud.vm_template.public</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.VmTemplateRecord, java.lang.Integer> PUBLIC = createField("public", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this);

	/**
	 * The column <code>cloud.vm_template.featured</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.VmTemplateRecord, java.lang.Integer> FEATURED = createField("featured", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this);

	/**
	 * The column <code>cloud.vm_template.type</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.VmTemplateRecord, java.lang.String> TYPE = createField("type", org.jooq.impl.SQLDataType.VARCHAR.length(32), this);

	/**
	 * The column <code>cloud.vm_template.hvm</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.VmTemplateRecord, java.lang.Integer> HVM = createField("hvm", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this);

	/**
	 * The column <code>cloud.vm_template.bits</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.VmTemplateRecord, java.lang.Integer> BITS = createField("bits", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this);

	/**
	 * The column <code>cloud.vm_template.url</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.VmTemplateRecord, java.lang.String> URL = createField("url", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>cloud.vm_template.format</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.VmTemplateRecord, java.lang.String> FORMAT = createField("format", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false), this);

	/**
	 * The column <code>cloud.vm_template.created</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.VmTemplateRecord, java.sql.Timestamp> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this);

	/**
	 * The column <code>cloud.vm_template.removed</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.VmTemplateRecord, java.sql.Timestamp> REMOVED = createField("removed", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * The column <code>cloud.vm_template.account_id</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.VmTemplateRecord, java.lang.Long> ACCOUNT_ID = createField("account_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this);

	/**
	 * The column <code>cloud.vm_template.checksum</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.VmTemplateRecord, java.lang.String> CHECKSUM = createField("checksum", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>cloud.vm_template.display_text</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.VmTemplateRecord, java.lang.String> DISPLAY_TEXT = createField("display_text", org.jooq.impl.SQLDataType.VARCHAR.length(4096), this);

	/**
	 * The column <code>cloud.vm_template.enable_password</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.VmTemplateRecord, java.lang.Integer> ENABLE_PASSWORD = createField("enable_password", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this);

	/**
	 * The column <code>cloud.vm_template.enable_sshkey</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.VmTemplateRecord, java.lang.Integer> ENABLE_SSHKEY = createField("enable_sshkey", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this);

	/**
	 * The column <code>cloud.vm_template.guest_os_id</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.VmTemplateRecord, java.lang.Long> GUEST_OS_ID = createField("guest_os_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this);

	/**
	 * The column <code>cloud.vm_template.bootable</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.VmTemplateRecord, java.lang.Integer> BOOTABLE = createField("bootable", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this);

	/**
	 * The column <code>cloud.vm_template.prepopulate</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.VmTemplateRecord, java.lang.Integer> PREPOPULATE = createField("prepopulate", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this);

	/**
	 * The column <code>cloud.vm_template.cross_zones</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.VmTemplateRecord, java.lang.Integer> CROSS_ZONES = createField("cross_zones", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this);

	/**
	 * The column <code>cloud.vm_template.extractable</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.VmTemplateRecord, java.lang.Integer> EXTRACTABLE = createField("extractable", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this);

	/**
	 * The column <code>cloud.vm_template.hypervisor_type</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.VmTemplateRecord, java.lang.String> HYPERVISOR_TYPE = createField("hypervisor_type", org.jooq.impl.SQLDataType.VARCHAR.length(32), this);

	/**
	 * The column <code>cloud.vm_template.source_template_id</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.VmTemplateRecord, java.lang.Long> SOURCE_TEMPLATE_ID = createField("source_template_id", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The column <code>cloud.vm_template.template_tag</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.VmTemplateRecord, java.lang.String> TEMPLATE_TAG = createField("template_tag", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>cloud.vm_template.sort_key</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.VmTemplateRecord, java.lang.Integer> SORT_KEY = createField("sort_key", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this);

	/**
	 * The column <code>cloud.vm_template.size</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.VmTemplateRecord, java.lang.Long> SIZE = createField("size", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The column <code>cloud.vm_template.state</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.VmTemplateRecord, java.lang.String> STATE = createField("state", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>cloud.vm_template.update_count</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.VmTemplateRecord, java.lang.Long> UPDATE_COUNT = createField("update_count", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The column <code>cloud.vm_template.updated</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.VmTemplateRecord, java.sql.Timestamp> UPDATED = createField("updated", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * The column <code>cloud.vm_template.dynamically_scalable</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.VmTemplateRecord, java.lang.Boolean> DYNAMICALLY_SCALABLE = createField("dynamically_scalable", org.jooq.impl.SQLDataType.BIT.nullable(false).defaulted(true), this);

	/**
	 * Create a <code>cloud.vm_template</code> table reference
	 */
	public VmTemplate() {
		super("vm_template", org.apache.cloudstack.db.jooq.generated.Cloud.CLOUD);
	}

	/**
	 * Create an aliased <code>cloud.vm_template</code> table reference
	 */
	public VmTemplate(java.lang.String alias) {
		super(alias, org.apache.cloudstack.db.jooq.generated.Cloud.CLOUD, org.apache.cloudstack.db.jooq.generated.tables.VmTemplate.VM_TEMPLATE);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<org.apache.cloudstack.db.jooq.generated.tables.records.VmTemplateRecord, java.lang.Long> getIdentity() {
		return org.apache.cloudstack.db.jooq.generated.Keys.IDENTITY_VM_TEMPLATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.apache.cloudstack.db.jooq.generated.tables.records.VmTemplateRecord> getPrimaryKey() {
		return org.apache.cloudstack.db.jooq.generated.Keys.KEY_VM_TEMPLATE_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.apache.cloudstack.db.jooq.generated.tables.records.VmTemplateRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.apache.cloudstack.db.jooq.generated.tables.records.VmTemplateRecord>>asList(org.apache.cloudstack.db.jooq.generated.Keys.KEY_VM_TEMPLATE_PRIMARY, org.apache.cloudstack.db.jooq.generated.Keys.KEY_VM_TEMPLATE_UC_VM_TEMPLATE__UUID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.apache.cloudstack.db.jooq.generated.tables.VmTemplate as(java.lang.String alias) {
		return new org.apache.cloudstack.db.jooq.generated.tables.VmTemplate(alias);
	}
}