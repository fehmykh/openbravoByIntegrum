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
@Table(name = "NK_RetailTransactions")
public class RetailTransaction {

	@Id
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid")
	@Column(name = "retailTransactionId")
	private String retailTransactionId;

	@Column(name = "transactionStatus")
	private String transactionStatus;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "retailTransactionId", referencedColumnName = "retailTransactionId")
	private List<LineItem> lineItems;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "retailTransactionId", referencedColumnName = "retailTransactionId")
	private List<Customer> customers;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "retailTransactionId", referencedColumnName = "retailTransactionId")
	private Total totals;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "retailTransactionId", referencedColumnName = "retailTransactionId")
	private Receipt receipts;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "retailTransactionId", referencedColumnName = "retailTransactionId")
	private SourcePos sourcePos;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "retailTransactionId", referencedColumnName = "retailTransactionId")
	private Survey survey;

	@Column(name = "transactionId")
	private String transactionId;

	public RetailTransaction() {
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

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

	public Total getTotals() {
		return totals;
	}

	public void setTotals(Total totals) {
		this.totals = totals;
	}

	public Receipt getReceipts() {
		return receipts;
	}

	public void setReceipts(Receipt receipts) {
		this.receipts = receipts;
	}

	public SourcePos getSourcePos() {
		return sourcePos;
	}

	public void setSourcePos(SourcePos sourcePos) {
		this.sourcePos = sourcePos;
	}

	public Survey getSurvey() {
		return survey;
	}

	public void setSurvey(Survey survey) {
		this.survey = survey;
	}

}
