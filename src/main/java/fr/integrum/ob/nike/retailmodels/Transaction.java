package fr.integrum.ob.nike.retailmodels;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "NK_Transactions")
public class Transaction {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "TransactionId")
	private Integer transactionId;

	@Column(name = "TransactionStatus")
	private String transactionStatus;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "RetailTransaction", referencedColumnName = "TransactionId")
	private RetailTransaction retailTransaction;

	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(Integer transactionId) {
		this.transactionId = transactionId;
	}

	public String getTransactionStatus() {
		return transactionStatus;
	}

	public void setTransactionStatus(String transactionStatus) {
		this.transactionStatus = transactionStatus;
	}

	public RetailTransaction getRetailTransaction() {
		return retailTransaction;
	}

	public void setRetailTransaction(RetailTransaction retailTransaction) {
		this.retailTransaction = retailTransaction;
	}

}
