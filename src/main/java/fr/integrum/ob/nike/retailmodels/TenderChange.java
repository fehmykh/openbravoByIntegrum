package fr.integrum.ob.nike.retailmodels;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "NK_TenderChanges")
public class TenderChange {

	@Id
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid")
	@Column(name = "TenderChangeID")
	private String tenderChangeId;

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
	private String lineItemId;

	public TenderChange() {
		super();
		// TODO Auto-generated constructor stub
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

}
