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
@Table(name = "NK_Customers")
public class Customer {

	@Id
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid")
	@Column(name = "CustomerID")
	private String customerId;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Name", referencedColumnName = "CustomerID")
	private Name name;

	@Column(name = "Version")
	private String version;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "TransactionLink", referencedColumnName = "CustomerID")
	private TransactionLink transactionLink;

	@Column(name = "orderTransactionId")
	private String orderTransactionId;

	@Column(name = "retailTransactionId")
	private String retailTransactionId;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
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

}
