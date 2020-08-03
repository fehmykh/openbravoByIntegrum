package fr.integrum.nike.retailModels;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "NK_Amounts")
public class Amount {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "AmountID")
	private Integer amountId;

	@Column(name = "Amount")
	private Double amount;

	@Column(name = "Currency")
	private String currency;

	public Amount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getAmountId() {
		return amountId;
	}

	public void setAmountId(Integer amountId) {
		this.amountId = amountId;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

}
