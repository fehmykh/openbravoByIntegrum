package fr.integrum.ob.nike.retailmodels;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "NK_Receipts")
public class Receipt {

	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	@Column(name = "ReceiptID")
	private String receiptId;

	@Column(name = "Print")
	private Boolean Print;

	@Column(name = "retailTransactionId")
	private String retailTransactionId;

	public Receipt() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getReceiptId() {
		return receiptId;
	}

	public void setReceiptId(String receiptId) {
		this.receiptId = receiptId;
	}

	public Boolean getPrint() {
		return Print;
	}

	public void setPrint(Boolean print) {
		Print = print;
	}

	public String getRetailTransactionId() {
		return retailTransactionId;
	}

	public void setRetailTransactionId(String retailTransactionId) {
		this.retailTransactionId = retailTransactionId;
	}

}
