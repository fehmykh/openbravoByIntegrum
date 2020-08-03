package fr.integrum.ob.nike.retailmodels;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "NK_Reasons")
public class Reason {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "reason_id")
	private Integer reasonId;

	@Column(name = "Code")
	private String code;

	@Column(name = "Description")
	private String description;

	@Column(name = "Name")
	private String name;

	@Column(name = "RetailPriceModifiersId")
	private Integer retailPriceModifiersId;
	
	@Column(name = "TransactionLinkId")
	private Integer transactionLinkId;
	
	public Reason() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getReasonId() {
		return reasonId;
	}

	public void setReasonId(Integer reasonId) {
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

	public Integer getRetailPriceModifiersId() {
		return retailPriceModifiersId;
	}

	public void setRetailPriceModifiersId(Integer retailPriceModifiersId) {
		this.retailPriceModifiersId = retailPriceModifiersId;
	}

	public Integer getTransactionLinkId() {
		return transactionLinkId;
	}

	public void setTransactionLinkId(Integer transactionLinkId) {
		this.transactionLinkId = transactionLinkId;
	}

}
