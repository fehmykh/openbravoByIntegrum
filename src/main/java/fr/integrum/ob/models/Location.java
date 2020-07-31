package fr.integrum.ob.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="locations")
public class Location {

	@Id
	@Column(name="location_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer locationId;
	private String address;
	private String city;
	private String zipCode;
	private String country;
	private String region;
	private String name;
	@Column(name="business_partner_id")
	private Integer businessPartnerId;
	public Location() {
		super();
	}
	
	
}
