package fr.integrum.ob.nike.retailmodels;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "NK_Names")
public class NumberOf {

	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	@Column(name = "name_id")
	private String nameId;

	@Column(name = "Number")
	private String number;

	@Column(name = "PickupId")
	private String pickupId;

	public NumberOf() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getNameId() {
		return nameId;
	}

	public void setNameId(String nameId) {
		this.nameId = nameId;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getPickupId() {
		return pickupId;
	}

	public void setPickupId(String pickupId) {
		this.pickupId = pickupId;
	}
}
