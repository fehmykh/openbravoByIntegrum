package fr.integrum.nike.retailModels;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "NK_OrderTransactions")
public class OrderTransaction {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "orderTransactionId")
	private Integer orderTransactionId;
	
	@Column(name = "TransactionStatus")
	private String transactionStatus;
}
