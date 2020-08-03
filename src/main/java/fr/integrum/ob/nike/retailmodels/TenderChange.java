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

@Entity
@Table(name = "NK_TenderChanges")
public class TenderChange {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "TenderChangeID")
	private Integer tenderChangeId;

	@Column(name = "TenderType")
	private String tenderType;

	@Column(name = "TypeCode")
	private String typeCode;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Amount", referencedColumnName = "TenderChangeID")
	private Amount amount;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Voucher", referencedColumnName = "TenderChangeID")
	private Voucher voucher;

	@Column(name = "LineItemId")
	private Integer lineItemId;

	public TenderChange() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getTenderChangeId() {
		return tenderChangeId;
	}

	public void setTenderChangeId(Integer tenderChangeId) {
		this.tenderChangeId = tenderChangeId;
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

	public Integer getLineItemId() {
		return lineItemId;
	}

	public void setLineItemId(Integer lineItemId) {
		this.lineItemId = lineItemId;
	}

}
