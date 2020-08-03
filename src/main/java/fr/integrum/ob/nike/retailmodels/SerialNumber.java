package fr.integrum.ob.nike.retailmodels;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "NK_SerialNumbers")
public class SerialNumber {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private Integer serialNumberId;

	@Column(name = "SaleId")
	private Integer saleId;

	@Column(name = "returnID")
	private Integer returnID;

	public SerialNumber() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getSerialNumberId() {
		return serialNumberId;
	}

	public void setSerialNumberId(Integer serialNumberId) {
		this.serialNumberId = serialNumberId;
	}

	public Integer getSaleId() {
		return saleId;
	}

	public void setSaleId(Integer saleId) {
		this.saleId = saleId;
	}

	public Integer getReturnID() {
		return returnID;
	}

	public void setReturnID(Integer returnID) {
		this.returnID = returnID;
	}

}
