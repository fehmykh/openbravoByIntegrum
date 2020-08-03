package fr.integrum.ob.nike.retailmodels;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "NK_Coupons")
public class Coupon {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "coupon_id")
	private Integer couponId;

	@Column(name = "ScanCode")
	private String scanCode;
	
	@Column(name = "RetailPriceModifiersId")
	private Integer retailPriceModifiersId;
	
	@Column(name = "LineItemId")
	private Integer lineItemId;
	
	public Coupon() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getCouponId() {
		return couponId;
	}

	public void setCouponId(Integer couponId) {
		this.couponId = couponId;
	}

	public String getScanCode() {
		return scanCode;
	}

	public void setScanCode(String scanCode) {
		this.scanCode = scanCode;
	}

	public Integer getRetailPriceModifiersId() {
		return retailPriceModifiersId;
	}

	public void setRetailPriceModifiersId(Integer retailPriceModifiersId) {
		this.retailPriceModifiersId = retailPriceModifiersId;
	}

	public Integer getLineItemId() {
		return lineItemId;
	}

	public void setLineItemId(Integer lineItemId) {
		this.lineItemId = lineItemId;
	}


}
