package fr.integrum.ob.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tax_lines")
public class TaxLine {
	@Id
	@Column(name = "tax_line_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer taxLineId;
	@Column
	private String shipment;
	@Column
	private Double taxAmount;
	@Column
	private Double taxableAmount;
	@Column
	private Double taxRate;
	@Column
	private String docTaxAmount;
	@Column
	private Double lineNo;
	@Column
	private Boolean cascade;
	@Column(name = "tax_line_identifier_id")
	private Integer taxLineIdentifierId;

	public TaxLine() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getTaxLineId() {
		return taxLineId;
	}

	public void setTaxLineId(Integer taxLineId) {
		this.taxLineId = taxLineId;
	}

	public String getShipment() {
		return shipment;
	}

	public void setShipment(String shipment) {
		this.shipment = shipment;
	}

	public Double getTaxAmount() {
		return taxAmount;
	}

	public void setTaxAmount(Double taxAmount) {
		this.taxAmount = taxAmount;
	}

	public Double getTaxableAmount() {
		return taxableAmount;
	}

	public void setTaxableAmount(Double taxableAmount) {
		this.taxableAmount = taxableAmount;
	}

	public Double getTaxRate() {
		return taxRate;
	}

	public void setTaxRate(Double taxRate) {
		this.taxRate = taxRate;
	}

	public String getDocTaxAmount() {
		return docTaxAmount;
	}

	public void setDocTaxAmount(String docTaxAmount) {
		this.docTaxAmount = docTaxAmount;
	}

	public Double getLineNo() {
		return lineNo;
	}

	public void setLineNo(Double lineNo) {
		this.lineNo = lineNo;
	}

	public Boolean getCascade() {
		return cascade;
	}

	public void setCascade(Boolean cascade) {
		this.cascade = cascade;
	}

	public Integer getTaxLineIdentifierId() {
		return taxLineIdentifierId;
	}

	public void setTaxLineIdentifierId(Integer taxLineIdentifierId) {
		this.taxLineIdentifierId = taxLineIdentifierId;
	}

}
