package fr.integrum.ob.nike.retailmodels;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "NK_Descriptions")
public class Description {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "description_id")
	private Integer descriptionId;

	@Column(name = "Text")
	private String text;

	@Column(name = "SaleId")
	private Integer saleId;

	@Column(name = "RetailPriceModifiersId")
	private Integer retailPriceModifiersId;

	@Column(name = "SaleForPickupId")
	private Integer saleForPickupId;
	
	@Column(name = "returnID")
	private Integer returnID;

	@Column(name = "SaleForDeliveryId")
	private Integer saleForDeliveryId;
	
	@Column(name = "StoredValueFundSaleId")
	private Integer storedValueFundSaleId;
	
	@Column(name = "VoucherID")
	private Integer voucherID;
	
	public Integer getVoucherID() {
		return voucherID;
	}

	public void setVoucherID(Integer voucherID) {
		this.voucherID = voucherID;
	}

	public Description() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getDescriptionId() {
		return descriptionId;
	}

	public void setDescriptionId(Integer descriptionId) {
		this.descriptionId = descriptionId;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Integer getSaleId() {
		return saleId;
	}

	public void setSaleId(Integer saleId) {
		this.saleId = saleId;
	}

	public Integer getRetailPriceModifiersId() {
		return retailPriceModifiersId;
	}

	public void setRetailPriceModifiersId(Integer retailPriceModifiersId) {
		this.retailPriceModifiersId = retailPriceModifiersId;
	}

	public Integer getSaleForPickupId() {
		return saleForPickupId;
	}

	public void setSaleForPickupId(Integer saleForPickupId) {
		this.saleForPickupId = saleForPickupId;
	}

	public Integer getReturnID() {
		return returnID;
	}

	public void setReturnID(Integer returnID) {
		this.returnID = returnID;
	}

	public Integer getSaleForDeliveryId() {
		return saleForDeliveryId;
	}

	public void setSaleForDeliveryId(Integer saleForDeliveryId) {
		this.saleForDeliveryId = saleForDeliveryId;
	}

	public Integer getStoredValueFundSaleId() {
		return storedValueFundSaleId;
	}

	public void setStoredValueFundSaleId(Integer storedValueFundSaleId) {
		this.storedValueFundSaleId = storedValueFundSaleId;
	}

}
