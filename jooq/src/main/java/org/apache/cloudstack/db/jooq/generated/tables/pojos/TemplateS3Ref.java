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
@javax.persistence.Table(name = "template_s3_ref", schema = "cloud")
public class TemplateS3Ref implements java.io.Serializable {

	private static final long serialVersionUID = 2046329473;

	private java.lang.Long     id;
	private java.lang.Long     s3Id;
	private java.lang.Long     templateId;
	private java.sql.Timestamp created;
	private java.lang.Long     size;
	private java.lang.Long     physicalSize;

	public TemplateS3Ref() {}

	public TemplateS3Ref(
		java.lang.Long     id,
		java.lang.Long     s3Id,
		java.lang.Long     templateId,
		java.sql.Timestamp created,
		java.lang.Long     size,
		java.lang.Long     physicalSize
	) {
		this.id = id;
		this.s3Id = s3Id;
		this.templateId = templateId;
		this.created = created;
		this.size = size;
		this.physicalSize = physicalSize;
	}

	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 20)
	public java.lang.Long getId() {
		return this.id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	@javax.persistence.Column(name = "s3_id", nullable = false, precision = 20)
	public java.lang.Long getS3Id() {
		return this.s3Id;
	}

	public void setS3Id(java.lang.Long s3Id) {
		this.s3Id = s3Id;
	}

	@javax.persistence.Column(name = "template_id", unique = true, nullable = false, precision = 20)
	public java.lang.Long getTemplateId() {
		return this.templateId;
	}

	public void setTemplateId(java.lang.Long templateId) {
		this.templateId = templateId;
	}

	@javax.persistence.Column(name = "created", nullable = false)
	public java.sql.Timestamp getCreated() {
		return this.created;
	}

	public void setCreated(java.sql.Timestamp created) {
		this.created = created;
	}

	@javax.persistence.Column(name = "size", precision = 20)
	public java.lang.Long getSize() {
		return this.size;
	}

	public void setSize(java.lang.Long size) {
		this.size = size;
	}

	@javax.persistence.Column(name = "physical_size", precision = 20)
	public java.lang.Long getPhysicalSize() {
		return this.physicalSize;
	}

	public void setPhysicalSize(java.lang.Long physicalSize) {
		this.physicalSize = physicalSize;
	}
}