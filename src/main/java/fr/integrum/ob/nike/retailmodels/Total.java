package fr.integrum.ob.nike.retailmodels;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "NK_Totals")
public class Total {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "TotalID")
	private Integer totalId;

	@Column(name = "Amount")
	private Double amount;

	@Column(name = "TotalType")
	private String totalType;

	@Column(name = "retailTransactionId")
	private Integer retailTransactionId;

	public Total() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getTotalId() {
		return totalId;
	}

	public void setTotalId(Integer totalId) {
		this.totalId = totalId;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getTotalType() {
		return totalType;
	}

	public void setTotalType(String totalType) {
		this.totalType = totalType;
	}

	public Integer getRetailTransactionId() {
		return retailTransactionId;
	}

	public void setRetailTransactionId(Integer retailTransactionId) {
		this.retailTransactionId = retailTransactionId;
	}

}
