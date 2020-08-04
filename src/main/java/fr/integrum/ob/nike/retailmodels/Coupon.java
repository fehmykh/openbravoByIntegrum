package fr.integrum.ob.nike.retailmodels;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "NK_Coupons")
public class Coupon {

	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	@Column(name = "CouponId")
	private String couponId;

	@Column(name = "ScanCode")
	private String scanCode;
	
	@Column(name = "RetailPriceModifiersId")
	private String retailPriceModifiersId;
	
	@Column(name = "LineItemId")
	private String lineItemId;
	
	public Coupon() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getCouponId() {
		return couponId;
	}

	public void setCouponId(String couponId) {
		this.couponId = couponId;
	}

	public String getScanCode() {
		return scanCode;
	}

	public void setScanCode(String scanCode) {
		this.scanCode = scanCode;
	}

	public String getRetailPriceModifiersId() {
		return retailPriceModifiersId;
	}

	public void setRetailPriceModifiersId(String retailPriceModifiersId) {
		this.retailPriceModifiersId = retailPriceModifiersId;
	}

	public String getLineItemId() {
		return lineItemId;
	}

	public void setLineItemId(String lineItemId) {
		this.lineItemId = lineItemId;
	}


}
