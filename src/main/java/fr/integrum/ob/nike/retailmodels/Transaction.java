package fr.integrum.ob.nike.retailmodels;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "NK_Transactions")
public class Transaction {

	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	@Column(name = "transactionId")
	private String transactionId;

	@Column(name = "transactionStatus")
	private String transactionStatus;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "retailTransaction", referencedColumnName = "TransactionId")
	private RetailTransaction retailTransaction;

	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
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
