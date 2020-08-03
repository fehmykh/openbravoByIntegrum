package fr.integrum.ob.nike.retailmodels;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "NK_Names")
public class Name {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "name_id")
	private Integer nameId;

	@Column(name = "FullName")
	private String fullName;

	@Column(name = "PickupId")
	private Integer pickupId;
	
	@Column(name = "DeliveryID")
	private Integer deliveryID;
	
	@Column(name = "CustomerID")
	private Integer customerID;
	
	public Name() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getNameId() {
		return nameId;
	}

	public void setNameId(Integer nameId) {
		this.nameId = nameId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Integer getPickupId() {
		return pickupId;
	}

	public void setPickupId(Integer pickupId) {
		this.pickupId = pickupId;
	}

	public Integer getDeliveryID() {
		return deliveryID;
	}

	public void setDeliveryID(Integer deliveryID) {
		this.deliveryID = deliveryID;
	}

	public Integer getCustomerID() {
		return customerID;
	}

	public void setCustomerID(Integer customerID) {
		this.customerID = customerID;
	}

}
