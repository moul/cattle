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
@javax.persistence.Table(name = "ldap_configuration", schema = "cloud")
public class LdapConfiguration implements java.io.Serializable {

	private static final long serialVersionUID = -891478596;

	private java.lang.Long    id;
	private java.lang.String  hostname;
	private java.lang.Integer port;

	public LdapConfiguration() {}

	public LdapConfiguration(
		java.lang.Long    id,
		java.lang.String  hostname,
		java.lang.Integer port
	) {
		this.id = id;
		this.hostname = hostname;
		this.port = port;
	}

	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 20)
	public java.lang.Long getId() {
		return this.id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	@javax.persistence.Column(name = "hostname", nullable = false, length = 255)
	public java.lang.String getHostname() {
		return this.hostname;
	}

	public void setHostname(java.lang.String hostname) {
		this.hostname = hostname;
	}

	@javax.persistence.Column(name = "port", precision = 10)
	public java.lang.Integer getPort() {
		return this.port;
	}

	public void setPort(java.lang.Integer port) {
		this.port = port;
	}
}