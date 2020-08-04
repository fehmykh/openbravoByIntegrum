package fr.integrum.ob.nike.retailmodels;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "NK_Associates")
public class Associate {

	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	@Column(name = "ID")
	private String id;

	@Column(name = "SaleId")
	private String saleId;

	@Column(name = "returnID")
	private String returnID;
	
	@Column(name = "SaleForDeliveryId")
	private String saleForDeliveryId;
	
	public Associate() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getAssociateId() {
		return id;
	}

	public void setAssociateId(String associateId) {
		this.id = associateId;
	}

}
