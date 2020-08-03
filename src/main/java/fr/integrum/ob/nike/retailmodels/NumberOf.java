package fr.integrum.ob.nike.retailmodels;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "NK_Names")
public class NumberOf {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "name_id")
	private Integer nameId;

	@Column(name = "Number")
	private String number;

	@Column(name = "PickupId")
	private Integer pickupId;

	public NumberOf() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getNameId() {
		return nameId;
	}

	public void setNameId(Integer nameId) {
		this.nameId = nameId;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Integer getPickupId() {
		return pickupId;
	}

	public void setPickupId(Integer pickupId) {
		this.pickupId = pickupId;
	}
}
