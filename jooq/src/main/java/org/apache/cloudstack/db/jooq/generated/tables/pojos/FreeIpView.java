/**
 * This class is generated by jOOQ
 */
package org.apache.cloudstack.db.jooq.generated.tables.pojos;

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
public class FreeIpView implements java.io.Serializable {

	private static final long serialVersionUID = 2041234550;

	private java.lang.Long freeIp;

	public FreeIpView() {}

	public FreeIpView(
		java.lang.Long freeIp
	) {
		this.freeIp = freeIp;
	}

	@javax.persistence.Column(name = "free_ip", nullable = false, precision = 19)
	public java.lang.Long getFreeIp() {
		return this.freeIp;
	}

	public void setFreeIp(java.lang.Long freeIp) {
		this.freeIp = freeIp;
	}
}