package fr.integrum.nike.models;

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

}
