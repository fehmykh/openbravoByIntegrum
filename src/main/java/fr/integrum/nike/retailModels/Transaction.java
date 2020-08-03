package fr.integrum.nike.retailModels;

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
	@JoinColumn(name = "TransactionId", referencedColumnName = "TransactionId")
	@Column(name = "RetailTransaction")
	private RetailTransaction retailTransaction;

	

}
