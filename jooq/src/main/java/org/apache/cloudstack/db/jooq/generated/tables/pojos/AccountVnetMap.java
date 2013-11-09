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
@javax.persistence.Table(name = "account_vnet_map", schema = "cloud")
public class AccountVnetMap implements java.io.Serializable {

	private static final long serialVersionUID = -1825890879;

	private java.lang.Long   id;
	private java.lang.String uuid;
	private java.lang.String vnetRange;
	private java.lang.Long   accountId;
	private java.lang.Long   physicalNetworkId;

	public AccountVnetMap() {}

	public AccountVnetMap(
		java.lang.Long   id,
		java.lang.String uuid,
		java.lang.String vnetRange,
		java.lang.Long   accountId,
		java.lang.Long   physicalNetworkId
	) {
		this.id = id;
		this.uuid = uuid;
		this.vnetRange = vnetRange;
		this.accountId = accountId;
		this.physicalNetworkId = physicalNetworkId;
	}

	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 20)
	public java.lang.Long getId() {
		return this.id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	@javax.persistence.Column(name = "uuid", unique = true, length = 255)
	public java.lang.String getUuid() {
		return this.uuid;
	}

	public void setUuid(java.lang.String uuid) {
		this.uuid = uuid;
	}

	@javax.persistence.Column(name = "vnet_range", nullable = false, length = 255)
	public java.lang.String getVnetRange() {
		return this.vnetRange;
	}

	public void setVnetRange(java.lang.String vnetRange) {
		this.vnetRange = vnetRange;
	}

	@javax.persistence.Column(name = "account_id", nullable = false, precision = 20)
	public java.lang.Long getAccountId() {
		return this.accountId;
	}

	public void setAccountId(java.lang.Long accountId) {
		this.accountId = accountId;
	}

	@javax.persistence.Column(name = "physical_network_id", nullable = false, precision = 20)
	public java.lang.Long getPhysicalNetworkId() {
		return this.physicalNetworkId;
	}

	public void setPhysicalNetworkId(java.lang.Long physicalNetworkId) {
		this.physicalNetworkId = physicalNetworkId;
	}
}