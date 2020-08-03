package fr.integrum.nike.retailModels;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "NK_Pickups")
public class Pickup {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "pickup_id")
	private Integer pickupId;
	@Column(name = "Name")
	private Name name;
	@Column(name = "Note")
	private String note;
	@Column(name = "TelephoneNumber")
	private Number telephoneNumber;
	@Column(name = "PreferredDateTime")
	private Date PreferredDateTime;
	
}
