package fr.integrum.nike.retailModels;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "NK_Deliveries")
public class Delivery {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "DeliveryID")
	private Integer deliveryId;
	
	@Column(name = "Name")
	private Name name;
	
	@Column(name = "Addresses")
	private List<Addresse> addresses;
}
