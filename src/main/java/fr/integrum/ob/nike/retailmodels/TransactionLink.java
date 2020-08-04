package fr.integrum.ob.nike.retailmodels;

import java.util.Date;

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
@Table(name = "NK_TransactionLinks")
public class TransactionLink {

	@Id
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid")
	@Column(name = "TransactionLinkId")
	private String transactionLinkId;

	@Column(name = "ReasonCode")
	private String reasonCode;

	@Column(name = "BusinessDayDate")
	private Date businessDayDate;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "BusinessUnit", referencedColumnName = "TransactionLinkId")
	private BusinessUnit businessUnit;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Workstation", referencedColumnName = "TransactionLinkId")
	private Workstation workstation;

	@Column(name = "SequenceNumber")
	private Integer sequenceNumber;

	@Column(name = "LineItemSequenceNumber")
	private Integer lineItemSequenceNumber;

	@Column(name = "VerificationType")
	private String verificationType;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Disposal", referencedColumnName = "TransactionLinkId")
	private Disposal disposal;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Reason", referencedColumnName = "TransactionLinkId")
	private Reason reason;

	@Column(name = "HasReceipt")
	private Boolean hasReceipt;

	@Column(name = "ItemNotOnFileFlag")
	private Boolean itemNotOnFileFlag;

	@Column(name = "returnID")
	private String returnID;

	@Column(name = "CustomerID")
	private String customerID;

	public TransactionLink() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getReasonCode() {
		return reasonCode;
	}

	public void setReasonCode(String reasonCode) {
		this.reasonCode = reasonCode;
	}

	public Date getBusinessDayDate() {
		return businessDayDate;
	}

	public void setBusinessDayDate(Date businessDayDate) {
		this.businessDayDate = businessDayDate;
	}

	public BusinessUnit getBusinessUnit() {
		return businessUnit;
	}

	public void setBusinessUnit(BusinessUnit businessUnit) {
		this.businessUnit = businessUnit;
	}

	public Workstation getWorkstation() {
		return workstation;
	}

	public void setWorkstation(Workstation workstation) {
		this.workstation = workstation;
	}

	public Integer getSequenceNumber() {
		return sequenceNumber;
	}

	public void setSequenceNumber(Integer sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
	}

	public Integer getLineItemSequenceNumber() {
		return lineItemSequenceNumber;
	}

	public void setLineItemSequenceNumber(Integer lineItemSequenceNumber) {
		this.lineItemSequenceNumber = lineItemSequenceNumber;
	}

	public String getVerificationType() {
		return verificationType;
	}

	public void setVerificationType(String verificationType) {
		this.verificationType = verificationType;
	}

	public Disposal getDisposal() {
		return disposal;
	}

	public void setDisposal(Disposal disposal) {
		this.disposal = disposal;
	}

	public Reason getReason() {
		return reason;
	}

	public void setReason(Reason reason) {
		this.reason = reason;
	}

	public Boolean getHasReceipt() {
		return hasReceipt;
	}

	public void setHasReceipt(Boolean hasReceipt) {
		this.hasReceipt = hasReceipt;
	}

	public Boolean getItemNotOnFileFlag() {
		return itemNotOnFileFlag;
	}

	public void setItemNotOnFileFlag(Boolean itemNotOnFileFlag) {
		this.itemNotOnFileFlag = itemNotOnFileFlag;
	}

}
