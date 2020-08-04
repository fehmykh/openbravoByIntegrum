package fr.integrum.ob.nike.retailmodels;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "NK_CreditDebits")
public class CreditDebit {

	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	@Column(name = "CreditDebitID")
	private String creditDebitId;

	@Column(name = "CardType")
	private String cardType;

	@Column(name = "TenderID")
	private String tenderID;

	public CreditDebit() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getCreditDebitId() {
		return creditDebitId;
	}

	public void setCreditDebitId(String creditDebitId) {
		this.creditDebitId = creditDebitId;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getTenderID() {
		return tenderID;
	}

	public void setTenderID(String tenderID) {
		this.tenderID = tenderID;
	}

}
