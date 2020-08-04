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

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "NK_Pickups")
public class Pickup {

	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	@Column(name = "PickupId")
	private String pickupId;

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
	private String saleForPickupId;

	public Pickup() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getPickupId() {
		return pickupId;
	}

	public void setPickupId(String pickupId) {
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

	public String getSaleForPickupId() {
		return saleForPickupId;
	}

	public void setSaleForPickupId(String saleForPickupId) {
		this.saleForPickupId = saleForPickupId;
	}
}
