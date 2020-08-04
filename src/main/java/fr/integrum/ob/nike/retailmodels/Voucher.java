package fr.integrum.ob.nike.retailmodels;

import java.util.Date;

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
@Table(name = "NK_Vouchers")
public class Voucher {

	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	@Column(name = "VoucherID")
	private String voucherId;

	@Column(name = "TypeCode")
	private String typeCode;

	@Column(name = "SerialNumber")
	private String serialNumber;

	@Column(name = "ExpirationDate")
	private Date expirationDate;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Descriptions", referencedColumnName = "VoucherID")
	private Description descriptions;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "FaceValueAmount", referencedColumnName = "VoucherID")
	private Amount faceValueAmount;

	@Column(name = "TenderID")
	private String tenderID;
	
	@Column(name = "TenderChangeID")
	private String tenderChangeID;
	
	public Voucher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getVoucherId() {
		return voucherId;
	}

	public void setVoucherId(String voucherId) {
		this.voucherId = voucherId;
	}

	public String getTypeCode() {
		return typeCode;
	}

	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public Date getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}

	public Description getDescriptions() {
		return descriptions;
	}

	public void setDescriptions(Description descriptions) {
		this.descriptions = descriptions;
	}

	public Amount getFaceValueAmount() {
		return faceValueAmount;
	}

	public void setFaceValueAmount(Amount faceValueAmount) {
		this.faceValueAmount = faceValueAmount;
	}

	public String getTenderID() {
		return tenderID;
	}

	public void setTenderID(String tenderID) {
		this.tenderID = tenderID;
	}

	public String getTenderChangeID() {
		return tenderChangeID;
	}

	public void setTenderChangeID(String tenderChangeID) {
		this.tenderChangeID = tenderChangeID;
	}

}
