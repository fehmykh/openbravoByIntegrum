package fr.integrum.ob.nike.retailmodels;

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

	@Column(name = "retailTransactionId")
	private Integer retailTransactionId;

	public Receipt() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getReceiptId() {
		return receiptId;
	}

	public void setReceiptId(Integer receiptId) {
		this.receiptId = receiptId;
	}

	public Boolean getPrint() {
		return Print;
	}

	public void setPrint(Boolean print) {
		Print = print;
	}

	public Integer getRetailTransactionId() {
		return retailTransactionId;
	}

	public void setRetailTransactionId(Integer retailTransactionId) {
		this.retailTransactionId = retailTransactionId;
	}

}
