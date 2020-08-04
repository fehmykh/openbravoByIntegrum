package fr.integrum.ob.nike.retailmodels;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "NK_Totals")
public class Total {

	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	@Column(name = "TotalID")
	private String totalId;

	@Column(name = "Amount")
	private Double amount;

	@Column(name = "TotalType")
	private String totalType;

	@Column(name = "retailTransactionId")
	private String retailTransactionId;

	public Total() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getTotalId() {
		return totalId;
	}

	public void setTotalId(String totalId) {
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

	public String getRetailTransactionId() {
		return retailTransactionId;
	}

	public void setRetailTransactionId(String retailTransactionId) {
		this.retailTransactionId = retailTransactionId;
	}

}
