package fr.integrum.ob.nike.retailmodels;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "NK_Names")
public class Name {

	@Id
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid")
	@Column(name = "name_id")
	private String nameId;

	@Column(name = "FullName")
	private String fullName;

	@Column(name = "PickupId")
	private String pickupId;

	@Column(name = "DeliveryID")
	private String deliveryID;

	@Column(name = "CustomerID")
	private String customerID;

	public Name() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

}
