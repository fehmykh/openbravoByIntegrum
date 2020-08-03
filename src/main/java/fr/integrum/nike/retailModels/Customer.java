package fr.integrum.nike.retailModels;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "NK_Customers")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "CustomerID")
	private Integer customerId;

	@Column(name = "Name")
	private Name name;

	@Column(name = "Version")
	private String version;

	@Column(name = "TransactionLink")
	private TransactionLink transactionLink;

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

}
