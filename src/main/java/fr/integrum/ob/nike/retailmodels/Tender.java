package fr.integrum.ob.nike.retailmodels;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "NK_Tenders")
public class Tender {

	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	@Column(name = "TenderID")
	private String tenderId;

	@Column(name = "TenderType")
	private String tenderType;

	@Column(name = "TypeCode")
	private String typeCode;

	@Column(name = "SubTenderType")
	private String subTenderType;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "CreditDebit", referencedColumnName = "TenderID")
	private CreditDebit creditDebit;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Amount", referencedColumnName = "TenderID")
	private Amount amount;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Voucher", referencedColumnName = "TenderID")
	private Voucher voucher;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ComplimentaryTender", referencedColumnName = "TenderID")
	private ComplimentaryTender complimentaryTender;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "StoreAccount", referencedColumnName = "TenderID")
	private StoreAccount storeAccount;

	@Column(name = "LineItemId")
	private String lineItemId;

	public Tender() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getTenderId() {
		return tenderId;
	}

	public void setTenderId(String tenderId) {
		this.tenderId = tenderId;
	}

	public String getTenderType() {
		return tenderType;
	}

	public void setTenderType(String tenderType) {
		this.tenderType = tenderType;
	}

	public String getTypeCode() {
		return typeCode;
	}

	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}

	public String getSubTenderType() {
		return subTenderType;
	}

	public void setSubTenderType(String subTenderType) {
		this.subTenderType = subTenderType;
	}

	public CreditDebit getCreditDebit() {
		return creditDebit;
	}

	public void setCreditDebit(CreditDebit creditDebit) {
		this.creditDebit = creditDebit;
	}

	public Amount getAmount() {
		return amount;
	}

	public void setAmount(Amount amount) {
		this.amount = amount;
	}

	public Voucher getVoucher() {
		return voucher;
	}

	public void setVoucher(Voucher voucher) {
		this.voucher = voucher;
	}

	public ComplimentaryTender getComplimentaryTender() {
		return complimentaryTender;
	}

	public void setComplimentaryTender(ComplimentaryTender complimentaryTender) {
		this.complimentaryTender = complimentaryTender;
	}

	public StoreAccount getStoreAccount() {
		return storeAccount;
	}

	public void setStoreAccount(StoreAccount storeAccount) {
		this.storeAccount = storeAccount;
	}

	public String getLineItemId() {
		return lineItemId;
	}

	public void setLineItemId(String lineItemId) {
		this.lineItemId = lineItemId;
	}

}
