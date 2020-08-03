package fr.integrum.nike.retailModels;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "NK_Business_Unit")
public class BusinessUnit {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "UnitID")
	private Integer unitId;

	@Column(name = "Brand")
	private String brand;

	@Column(name = "Country")
	private String country;

	@Column(name = "LocationType")
	private String locationType;

	@Column(name = "LocationCode")
	private String locationCode;

	public BusinessUnit() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getUnitId() {
		return unitId;
	}

	public void setUnitId(Integer unitId) {
		this.unitId = unitId;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getLocationType() {
		return locationType;
	}

	public void setLocationType(String locationType) {
		this.locationType = locationType;
	}

	public String getLocationCode() {
		return locationCode;
	}

	public void setLocationCode(String locationCode) {
		this.locationCode = locationCode;
	}

}
