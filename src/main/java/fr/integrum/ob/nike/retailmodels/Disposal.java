package fr.integrum.ob.nike.retailmodels;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "NK_Disposals")
public class Disposal {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "disposal_id")
	private Integer disposalId;

	@Column(name = "Method")
	private String method;

	@Column(name = "TransactionLinkId")
	private Integer transactionLinkId;

	public Disposal() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getDisposalId() {
		return disposalId;
	}

	public void setDisposalId(Integer disposalId) {
		this.disposalId = disposalId;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public Integer getTransactionLinkId() {
		return transactionLinkId;
	}

	public void setTransactionLinkId(Integer transactionLinkId) {
		this.transactionLinkId = transactionLinkId;
	}

}
