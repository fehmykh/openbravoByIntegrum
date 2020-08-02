package fr.integrum.ob.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "promotions")
public class Promotion {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "promotion_id")
	private Integer promotionId;
	@Column
	private String discountRule;
	@Column
	private String discountType;
	@Column
	private String name;
	@Column
	private Double amount;
	@Column
	private Double actualAmt;
	@Column
	private Boolean hidden;
	@Column
	private Double displayedTotalAmount;
	@Column
	private Double quantity;
	@Column
	private Double obdiscQtyoffer;
	@Column(name = "line_id")
	private Integer lineId;

	public Promotion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getPromotionId() {
		return promotionId;
	}

	public void setPromotionId(Integer promotionId) {
		this.promotionId = promotionId;
	}

	public String getDiscountRule() {
		return discountRule;
	}

	public void setDiscountRule(String discountRule) {
		this.discountRule = discountRule;
	}

	public String getDiscountType() {
		return discountType;
	}

	public void setDiscountType(String discountType) {
		this.discountType = discountType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Double getActualAmt() {
		return actualAmt;
	}

	public void setActualAmt(Double actualAmt) {
		this.actualAmt = actualAmt;
	}

	public Boolean getHidden() {
		return hidden;
	}

	public void setHidden(Boolean hidden) {
		this.hidden = hidden;
	}

	public Double getDisplayedTotalAmount() {
		return displayedTotalAmount;
	}

	public void setDisplayedTotalAmount(Double displayedTotalAmount) {
		this.displayedTotalAmount = displayedTotalAmount;
	}

	public Double getQuantity() {
		return quantity;
	}

	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}

	public Double getObdiscQtyoffer() {
		return obdiscQtyoffer;
	}

	public void setObdiscQtyoffer(Double obdiscQtyoffer) {
		this.obdiscQtyoffer = obdiscQtyoffer;
	}

	public Integer getLineId() {
		return lineId;
	}

	public void setLineId(Integer lineId) {
		this.lineId = lineId;
	}

}
