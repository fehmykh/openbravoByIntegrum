package fr.integrum.ob.nike.retailmodels;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "NK_Quantities")
public class Quantity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "QuantityId")
	private Integer quantityId;

	@Column(name = "Quantity")
	private Double quantity;

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
	
	public Quantity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getStoredValueFundSaleId() {
		return storedValueFundSaleId;
	}

	public void setStoredValueFundSaleId(Integer storedValueFundSaleId) {
		this.storedValueFundSaleId = storedValueFundSaleId;
	}

	public Integer getQuantityId() {
		return quantityId;
	}

	public void setQuantityId(Integer quantityId) {
		this.quantityId = quantityId;
	}

	public Double getQuantity() {
		return quantity;
	}

	public void setQuantity(Double quantity) {
		this.quantity = quantity;
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
