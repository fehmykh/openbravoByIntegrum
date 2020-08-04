package fr.integrum.ob.nike.retailmodels;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "NK_Workstations")
public class Workstation {

	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	@Column(name = "ID")
	private String workstationId;

	@Column(name = "TransactionLinkId")
	private String transactionLinkId;

	public Workstation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getWorkstationId() {
		return workstationId;
	}

	public void setWorkstationId(String workstationId) {
		this.workstationId = workstationId;
	}

	public String getTransactionLinkId() {
		return transactionLinkId;
	}

	public void setTransactionLinkId(String transactionLinkId) {
		this.transactionLinkId = transactionLinkId;
	}

}
