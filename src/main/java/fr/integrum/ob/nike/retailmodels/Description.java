package fr.integrum.ob.nike.retailmodels;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "NK_Descriptions")
public class Description {

	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	@Column(name = "description_id")
	private String descriptionId;

	@Column(name = "Text")
	private String text;

	@Column(name = "SaleId")
	private String saleId;

	@Column(name = "RetailPriceModifiersId")
	private String retailPriceModifiersId;

	@Column(name = "SaleForPickupId")
	private String saleForPickupId;
	
	@Column(name = "returnID")
	private String returnID;

	@Column(name = "SaleForDeliveryId")
	private String saleForDeliveryId;
	
	@Column(name = "StoredValueFundSaleId")
	private String storedValueFundSaleId;
	
	@Column(name = "VoucherID")
	private String voucherID;
	
	public String getVoucherID() {
		return voucherID;
	}

	public void setVoucherID(String voucherID) {
		this.voucherID = voucherID;
	}

	public Description() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getDescriptionId() {
		return descriptionId;
	}

	public void setDescriptionId(String descriptionId) {
		this.descriptionId = descriptionId;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getSaleId() {
		return saleId;
	}

	public void setSaleId(String saleId) {
		this.saleId = saleId;
	}

	public String getRetailPriceModifiersId() {
		return retailPriceModifiersId;
	}

	public void setRetailPriceModifiersId(String retailPriceModifiersId) {
		this.retailPriceModifiersId = retailPriceModifiersId;
	}

	public String getSaleForPickupId() {
		return saleForPickupId;
	}

	public void setSaleForPickupId(String saleForPickupId) {
		this.saleForPickupId = saleForPickupId;
	}

	public String getReturnID() {
		return returnID;
	}

	public void setReturnID(String returnID) {
		this.returnID = returnID;
	}

	public String getSaleForDeliveryId() {
		return saleForDeliveryId;
	}

	public void setSaleForDeliveryId(String saleForDeliveryId) {
		this.saleForDeliveryId = saleForDeliveryId;
	}

	public String getStoredValueFundSaleId() {
		return storedValueFundSaleId;
	}

	public void setStoredValueFundSaleId(String storedValueFundSaleId) {
		this.storedValueFundSaleId = storedValueFundSaleId;
	}

}
