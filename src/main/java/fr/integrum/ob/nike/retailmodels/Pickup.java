package fr.integrum.ob.nike.retailmodels;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "NK_Pickups")
public class Pickup {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "PickupId")
	private Integer pickupId;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Name", referencedColumnName = "PickupId")
	private Name name;

	@Column(name = "Note")
	private String note;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "TelephoneNumber", referencedColumnName = "PickupId")
	private NumberOf telephoneNumber;

	@Column(name = "PreferredDateTime")
	private Date PreferredDateTime;

	@Column(name = "SaleForPickupId")
	private Integer saleForPickupId;

	public Pickup() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getPickupId() {
		return pickupId;
	}

	public void setPickupId(Integer pickupId) {
		this.pickupId = pickupId;
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public NumberOf getTelephoneNumber() {
		return telephoneNumber;
	}

	public void setTelephoneNumber(NumberOf telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}

	public Date getPreferredDateTime() {
		return PreferredDateTime;
	}

	public void setPreferredDateTime(Date preferredDateTime) {
		PreferredDateTime = preferredDateTime;
	}

	public Integer getSaleForPickupId() {
		return saleForPickupId;
	}

	public void setSaleForPickupId(Integer saleForPickupId) {
		this.saleForPickupId = saleForPickupId;
	}
}
