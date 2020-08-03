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
@Table(name = "NK_Customers")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "CustomerID")
	private Integer customerId;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Name", referencedColumnName = "CustomerID")
	private Name name;

	@Column(name = "Version")
	private String version;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "TransactionLink", referencedColumnName = "CustomerID")
	private TransactionLink transactionLink;

	@Column(name = "orderTransactionId")
	private Integer orderTransactionId;

	@Column(name = "retailTransactionId")
	private Integer retailTransactionId;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public TransactionLink getTransactionLink() {
		return transactionLink;
	}

	public void setTransactionLink(TransactionLink transactionLink) {
		this.transactionLink = transactionLink;
	}

	public Integer getOrderTransactionId() {
		return orderTransactionId;
	}

	public void setOrderTransactionId(Integer orderTransactionId) {
		this.orderTransactionId = orderTransactionId;
	}

	public Integer getRetailTransactionId() {
		return retailTransactionId;
	}

	public void setRetailTransactionId(Integer retailTransactionId) {
		this.retailTransactionId = retailTransactionId;
	}

}
