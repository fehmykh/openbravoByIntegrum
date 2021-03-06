package fr.integrum.ob.nike.retailmodels;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "NK_OrderTransactions")
public class OrderTransaction {

	@Id
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid")
	@Column(name = "orderTransactionId")
	private String orderTransactionId;

	@Column(name = "TransactionStatus")
	private String transactionStatus;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "orderTransactionId", referencedColumnName = "orderTransactionId")
	private List<LineItem> lineItems;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Customer", referencedColumnName = "orderTransactionId")
	private Customer cutomer;

	public OrderTransaction() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getTransactionStatus() {
		return transactionStatus;
	}

	public void setTransactionStatus(String transactionStatus) {
		this.transactionStatus = transactionStatus;
	}

	public List<LineItem> getLineItems() {
		return lineItems;
	}

	public void setLineItems(List<LineItem> lineItems) {
		this.lineItems = lineItems;
	}

	public Customer getCutomer() {
		return cutomer;
	}

	public void setCutomer(Customer cutomer) {
		this.cutomer = cutomer;
	}

}
