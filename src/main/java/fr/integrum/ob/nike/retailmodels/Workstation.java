package fr.integrum.ob.nike.retailmodels;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "NK_Workstations")
public class Workstation {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private Integer workstationId;

	@Column(name = "TransactionLinkId")
	private Integer transactionLinkId;

	public Workstation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getWorkstationId() {
		return workstationId;
	}

	public void setWorkstationId(Integer workstationId) {
		this.workstationId = workstationId;
	}

	public Integer getTransactionLinkId() {
		return transactionLinkId;
	}

	public void setTransactionLinkId(Integer transactionLinkId) {
		this.transactionLinkId = transactionLinkId;
	}

}
