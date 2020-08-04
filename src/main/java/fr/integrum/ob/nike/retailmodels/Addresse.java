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
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "nk_addresses")
public class Addresse {

	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	@Column(name = "AddresseID")
	private String addresseId;

	@Column(name = "TypeCode")
	private String typeCode;

	@Column(name = "City")
	private String city;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "AddresseID", referencedColumnName = "AddresseID")
	private List<AddresseLine> addressLines;

	@Column(name = "DeliveryID")
	private Integer deliveryID;

	public Addresse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getAddresseId() {
		return addresseId;
	}

	public void setAddresseId(String addresseId) {
		this.addresseId = addresseId;
	}

	public String getTypeCode() {
		return typeCode;
	}

	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public List<AddresseLine> getAddressLines() {
		return addressLines;
	}

	public void setAddressLines(List<AddresseLine> addressLines) {
		this.addressLines = addressLines;
	}

	public Integer getDeliveryID() {
		return deliveryID;
	}

	public void setDeliveryID(Integer deliveryID) {
		this.deliveryID = deliveryID;
	}

}
