package fr.integrum.ob.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "locations")
public class UserLocation {

	@Id
	@Column(name = "user_location_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer userLocationId;
	@Column
	private String address;
	@Column
	private String city;
	@Column
	private String zipCode;
	@Column
	private String country;
	@Column
	private String region;
	@Column
	private String name;
	@Column(name = "business_partner_id")
	private Integer businessPartnerId;

	public UserLocation() {
		super();
	}

	public Integer getLocationId() {
		return userLocationId;
	}

	public void setLocationId(Integer userLocationId) {
		this.userLocationId = userLocationId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getBusinessPartnerId() {
		return businessPartnerId;
	}

	public void setBusinessPartnerId(Integer businessPartnerId) {
		this.businessPartnerId = businessPartnerId;
	}

}
