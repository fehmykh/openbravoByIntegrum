package fr.integrum.nike.retailModels;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "NK_Receipts")
public class Receipt {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ReceiptID")
	private Integer receiptId;
	
	@Column(name = "Print")
	private Boolean Print;
	
}
