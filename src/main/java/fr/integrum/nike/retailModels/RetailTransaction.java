package fr.integrum.nike.retailModels;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "NK_RetailTransactions")
public class RetailTransaction {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "retailTransactionId")
	private Integer retailTransactionId;
	
	@Column(name = "TransactionStatus")
	private String transactionStatus;
	
	@Column(name = "LineItems")
	private List<LineItem> lineItems;
	
	@Column(name = "Totals")
	private Total totals;
	
	@Column(name = "Receipts")
	private Receipt receipts;
	
	@Column(name="TransactionId")
	private Integer transactionId;
}
