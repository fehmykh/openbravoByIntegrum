package fr.integrum.ob.nike.retailmodels;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "NK_Workstations")
public class Workstation {

	@Id
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid")
	@Column(name = "ID")
	private String id;

	@Column(name = "TransactionLinkId")
	private String transactionLinkId;

	public Workstation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getWorkstationId() {
		return id;
	}

	public void setWorkstationId(String id) {
		this.id = id;
	}

}
