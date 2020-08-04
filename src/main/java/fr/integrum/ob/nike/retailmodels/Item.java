package fr.integrum.ob.nike.retailmodels;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "NK_Items")
public class Item {

	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	@Column(name = "ID")
	private String itemId;

	@Column(name = "type")
	private String type;

	@Column(name = "SaleId")
	private String saleId;

	@Column(name = "SaleForPickupId")
	private String saleForPickupId;
	
	@Column(name = "returnID")
	private String returnID;
	
	@Column(name = "SaleForDeliveryId")
	private String saleForDeliveryId;
	
	@Column(name = "StoredValueFundSaleId")
	private String storedValueFundSaleId;
	
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getStoredValueFundSaleId() {
		return storedValueFundSaleId;
	}

	public void setStoredValueFundSaleId(String storedValueFundSaleId) {
		this.storedValueFundSaleId = storedValueFundSaleId;
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSaleId() {
		return saleId;
	}

	public void setSaleId(String saleId) {
		this.saleId = saleId;
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

}
