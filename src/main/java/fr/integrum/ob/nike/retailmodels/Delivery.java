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

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "NK_Deliveries")
public class Delivery {

	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	@Column(name = "DeliveryID")
	private String deliveryId;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Name", referencedColumnName = "DeliveryID")
	private Name name;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "DeliveryID", referencedColumnName = "DeliveryID")
	private List<Addresse> addresses;

	@Column(name = "SaleForDeliveryId")
	private String saleForDeliveryId;

	public Delivery() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getDeliveryId() {
		return deliveryId;
	}

	public void setDeliveryId(String deliveryId) {
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

	public String getSaleForDeliveryId() {
		return saleForDeliveryId;
	}

	public void setSaleForDeliveryId(String saleForDeliveryId) {
		this.saleForDeliveryId = saleForDeliveryId;
	}
}
