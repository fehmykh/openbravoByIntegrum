package fr.integrum.ob.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tax_headers")
public class TaxHeader {
	@Id
	@Column(name = "tax_header_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer taxHeaderId;
	@Column
	private Double rate;
	@Column
	private Double net;
	@Column
	private Double amount;
	@Column
	private Double gross;
	@Column
	private Boolean cascade;
	@Column
	private String docTaxAmount;
	@Column
	private Double lineNo;
	@Column(name = "tax_header_identifier_id")
	private Integer taxHeaderIdentifierId;

	public TaxHeader() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getTaxHeaderId() {
		return taxHeaderId;
	}

	public void setTaxHeaderId(Integer taxHeaderId) {
		this.taxHeaderId = taxHeaderId;
	}

	public Double getRate() {
		return rate;
	}

	public void setRate(Double rate) {
		this.rate = rate;
	}

	public Double getNet() {
		return net;
	}

	public void setNet(Double net) {
		this.net = net;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Double getGross() {
		return gross;
	}

	public void setGross(Double gross) {
		this.gross = gross;
	}

	public Boolean getCascade() {
		return cascade;
	}

	public void setCascade(Boolean cascade) {
		this.cascade = cascade;
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

	public Integer getTaxHeaderIdentifierId() {
		return taxHeaderIdentifierId;
	}

	public void setTaxHeaderIdentifierId(Integer taxHeaderIdentifierId) {
		this.taxHeaderIdentifierId = taxHeaderIdentifierId;
	}

}
