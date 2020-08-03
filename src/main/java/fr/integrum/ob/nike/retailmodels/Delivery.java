package fr.integrum.ob.nike.retailmodels;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "NK_Deliveries")
public class Delivery {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "DeliveryID")
	private Integer deliveryId;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Name", referencedColumnName = "DeliveryID")
	private Name name;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "Addresses", referencedColumnName = "DeliveryID")
	private List<Addresse> addresses;

	@Column(name = "SaleForDeliveryId")
	private Integer saleForDeliveryId;

	public Delivery() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getDeliveryId() {
		return deliveryId;
	}

	public void setDeliveryId(Integer deliveryId) {
		this.deliveryId = deliveryId;
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public List<Addresse> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Addresse> addresses) {
		this.addresses = addresses;
	}

	public Integer getSaleForDeliveryId() {
		return saleForDeliveryId;
	}

	public void setSaleForDeliveryId(Integer saleForDeliveryId) {
		this.saleForDeliveryId = saleForDeliveryId;
	}
}
