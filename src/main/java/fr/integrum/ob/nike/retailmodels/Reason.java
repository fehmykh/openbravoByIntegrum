package fr.integrum.ob.nike.retailmodels;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "NK_Reasons")
public class Reason {

	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	@Column(name = "reason_id")
	private String reasonId;

	@Column(name = "Code")
	private String code;

	@Column(name = "Description")
	private String description;

	@Column(name = "Name")
	private String name;

	@Column(name = "RetailPriceModifiersId")
	private String retailPriceModifiersId;
	
	@Column(name = "TransactionLinkId")
	private String transactionLinkId;
	
	public Reason() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getReasonId() {
		return reasonId;
	}

	public void setReasonId(String reasonId) {
		this.reasonId = reasonId;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRetailPriceModifiersId() {
		return retailPriceModifiersId;
	}

	public void setRetailPriceModifiersId(String retailPriceModifiersId) {
		this.retailPriceModifiersId = retailPriceModifiersId;
	}

	public String getTransactionLinkId() {
		return transactionLinkId;
	}

	public void setTransactionLinkId(String transactionLinkId) {
		this.transactionLinkId = transactionLinkId;
	}

}
