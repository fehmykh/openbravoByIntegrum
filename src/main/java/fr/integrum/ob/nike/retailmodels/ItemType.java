package fr.integrum.ob.nike.retailmodels;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "NK_ItemTypes")
public class ItemType {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "item_type_id")
	private Integer itemTypeId;

	@Column(name = "type")
	private String type;

	@Column(name = "SaleId")
	private Integer saleId;

	@Column(name = "SaleForPickupId")
	private Integer saleForPickupId;
	
	@Column(name = "returnID")
	private Integer returnID;
	
	@Column(name = "SaleForDeliveryId")
	private Integer saleForDeliveryId;
	
	@Column(name = "StoredValueFundSaleId")
	private Integer storedValueFundSaleId;
	
	public Integer getStoredValueFundSaleId() {
		return storedValueFundSaleId;
	}

	public void setStoredValueFundSaleId(Integer storedValueFundSaleId) {
		this.storedValueFundSaleId = storedValueFundSaleId;
	}

	public ItemType() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getItemTypeId() {
		return itemTypeId;
	}

	public void setItemTypeId(Integer itemTypeId) {
		this.itemTypeId = itemTypeId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getSaleId() {
		return saleId;
	}

	public void setSaleId(Integer saleId) {
		this.saleId = saleId;
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

}
