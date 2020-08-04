package fr.integrum.ob.nike.retailmodels;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "NK_Receipts")
public class Receipt {

	@Id
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid")
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

	public Boolean getPrint() {
		return Print;
	}

	public void setPrint(Boolean print) {
		Print = print;
	}

}
