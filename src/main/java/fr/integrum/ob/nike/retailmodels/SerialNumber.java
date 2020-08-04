package fr.integrum.ob.nike.retailmodels;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "NK_SerialNumbers")
public class SerialNumber {

	@Id
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid")
	@Column(name = "ID")
	private String id;

	@Column(name = "SaleId")
	private String saleId;

	@Column(name = "returnID")
	private String returnID;

	public SerialNumber() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getSerialNumberId() {
		return id;
	}

	public void setSerialNumberId(String id) {
		this.id = id;
	}

}
