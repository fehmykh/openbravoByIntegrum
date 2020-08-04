package fr.integrum.ob.nike.retailmodels;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "NK_SerialNumbers")
public class SerialNumber {

	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	@Column(name = "ID")
	private String serialNumberId;

	@Column(name = "SaleId")
	private String saleId;

	@Column(name = "returnID")
	private String returnID;

	public SerialNumber() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getSerialNumberId() {
		return serialNumberId;
	}

	public void setSerialNumberId(String serialNumberId) {
		this.serialNumberId = serialNumberId;
	}

	public String getSaleId() {
		return saleId;
	}

	public void setSaleId(String saleId) {
		this.saleId = saleId;
	}

	public String getReturnID() {
		return returnID;
	}

	public void setReturnID(String returnID) {
		this.returnID = returnID;
	}

}
