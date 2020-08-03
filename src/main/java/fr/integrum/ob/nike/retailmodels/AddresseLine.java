package fr.integrum.ob.nike.retailmodels;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "NK_AddresseLines")
public class AddresseLine {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "AddresseLineID")
	private Integer addresseLineId;

	@Column(name = "RelativeOrder")
	private Integer relativeOrder;

	@Column(name = "Line")
	private String line;

	@Column(name = "StateOrProvince")
	private String stateOrProvince;

	@Column(name = "PostalCode")
	private String postalCode;

	@Column(name = "Country")
	private String country;

	@Column(name = "TelephoneNumber")
	private String telephoneNumber;
	
	@Column(name = "AddresseID")
	private Integer addresseID;
	
	public AddresseLine() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getAddresseLineId() {
		return addresseLineId;
	}

	public void setAddresseLineId(Integer addresseLineId) {
		this.addresseLineId = addresseLineId;
	}

	public Integer getRelativeOrder() {
		return relativeOrder;
	}

	public void setRelativeOrder(Integer relativeOrder) {
		this.relativeOrder = relativeOrder;
	}

	public String getLine() {
		return line;
	}

	public void setLine(String line) {
		this.line = line;
	}

	public String getStateOrProvince() {
		return stateOrProvince;
	}

	public void setStateOrProvince(String stateOrProvince) {
		this.stateOrProvince = stateOrProvince;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getTelephoneNumber() {
		return telephoneNumber;
	}

	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}

}
