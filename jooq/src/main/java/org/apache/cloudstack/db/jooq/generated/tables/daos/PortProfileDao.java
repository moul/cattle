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
public class PortProfileDao extends org.jooq.impl.DAOImpl<org.apache.cloudstack.db.jooq.generated.tables.records.PortProfileRecord, org.apache.cloudstack.db.jooq.generated.tables.pojos.PortProfile, java.lang.Long> {

	/**
	 * Create a new PortProfileDao without any configuration
	 */
	public PortProfileDao() {
		super(org.apache.cloudstack.db.jooq.generated.tables.PortProfile.PORT_PROFILE, org.apache.cloudstack.db.jooq.generated.tables.pojos.PortProfile.class);
	}

	/**
	 * Create a new PortProfileDao with an attached configuration
	 */
	public PortProfileDao(org.jooq.Configuration configuration) {
		super(org.apache.cloudstack.db.jooq.generated.tables.PortProfile.PORT_PROFILE, org.apache.cloudstack.db.jooq.generated.tables.pojos.PortProfile.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected java.lang.Long getId(org.apache.cloudstack.db.jooq.generated.tables.pojos.PortProfile object) {
		return object.getId();
	}

	/**
	 * Fetch records that have <code>id IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.PortProfile> fetchById(java.lang.Long... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.PortProfile.PORT_PROFILE.ID, values);
	}

	/**
	 * Fetch a unique record that has <code>id = value</code>
	 */
	public org.apache.cloudstack.db.jooq.generated.tables.pojos.PortProfile fetchOneById(java.lang.Long value) {
		return fetchOne(org.apache.cloudstack.db.jooq.generated.tables.PortProfile.PORT_PROFILE.ID, value);
	}

	/**
	 * Fetch records that have <code>uuid IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.PortProfile> fetchByUuid(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.PortProfile.PORT_PROFILE.UUID, values);
	}

	/**
	 * Fetch records that have <code>port_profile_name IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.PortProfile> fetchByPortProfileName(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.PortProfile.PORT_PROFILE.PORT_PROFILE_NAME, values);
	}

	/**
	 * Fetch records that have <code>port_mode IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.PortProfile> fetchByPortMode(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.PortProfile.PORT_PROFILE.PORT_MODE, values);
	}

	/**
	 * Fetch records that have <code>vsm_id IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.PortProfile> fetchByVsmId(java.lang.Long... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.PortProfile.PORT_PROFILE.VSM_ID, values);
	}

	/**
	 * Fetch records that have <code>trunk_low_vlan_id IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.PortProfile> fetchByTrunkLowVlanId(java.lang.Integer... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.PortProfile.PORT_PROFILE.TRUNK_LOW_VLAN_ID, values);
	}

	/**
	 * Fetch records that have <code>trunk_high_vlan_id IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.PortProfile> fetchByTrunkHighVlanId(java.lang.Integer... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.PortProfile.PORT_PROFILE.TRUNK_HIGH_VLAN_ID, values);
	}

	/**
	 * Fetch records that have <code>access_vlan_id IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.PortProfile> fetchByAccessVlanId(java.lang.Integer... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.PortProfile.PORT_PROFILE.ACCESS_VLAN_ID, values);
	}

	/**
	 * Fetch records that have <code>port_type IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.PortProfile> fetchByPortType(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.PortProfile.PORT_PROFILE.PORT_TYPE, values);
	}

	/**
	 * Fetch records that have <code>port_binding IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.PortProfile> fetchByPortBinding(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.PortProfile.PORT_PROFILE.PORT_BINDING, values);
	}
}