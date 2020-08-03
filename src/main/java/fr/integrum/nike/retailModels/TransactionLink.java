package fr.integrum.nike.retailModels;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "NK_TransactionLinks")
public class TransactionLink {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "transaction_link_id")
	private Integer transactionLinkId;
	
	@Column(name = "ReasonCode")
	private Reason reasonCode;
	
	@Column(name = "BusinessDayDate")
	private Date businessDayDate;
	
	@Column(name = "BusinessUnit")
	private BusinessUnit businessUnit;

	@Column(name = "Workstation")
	private Workstation workstation;

	@Column(name = "SequenceNumber")
	private Integer sequenceNumber;

	@Column(name = "LineItemSequenceNumber")
	private Integer lineItemSequenceNumber;

	@Column(name = "VerificationType")
	private String verificationType;

	@Column(name = "Disposal")
	private Disposal disposal;

	@Column(name = "Reason")
	private Reason reason;

	@Column(name = "HasReceipt")
	private Boolean hasReceipt;

	@Column(name = "ItemNotOnFileFlag")
	private Boolean itemNotOnFileFlag;

}
