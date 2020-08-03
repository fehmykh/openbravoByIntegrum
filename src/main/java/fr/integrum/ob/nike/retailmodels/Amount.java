package fr.integrum.ob.nike.retailmodels;

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

	@Column(name = "SaleId")
	private Integer saleId;

	@Column(name = "RetailPriceModifiersId")
	private Integer retailPriceModifiersId;

	@Column(name = "TaxeId")
	private Integer taxeId;

	@Column(name = "SaleForPickupId")
	private Integer saleForPickupId;

	@Column(name = "TenderID")
	private Integer tenderID;

	@Column(name = "TenderChangeID")
	private Integer tenderChangeID;

	@Column(name = "returnID")
	private Integer returnID;

	@Column(name = "SaleForDeliveryId")
	private Integer saleForDeliveryId;

	@Column(name = "InstrumentId")
	private Integer instrumentId;

	@Column(name = "StoredValueFundSaleId")
	private Integer storedValueFundSaleId;

	@Column(name = "VoucherID")
	private Integer voucherID;

	public Amount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getVoucherID() {
		return voucherID;
	}

	public void setVoucherID(Integer voucherID) {
		this.voucherID = voucherID;
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

	public Integer getTaxeId() {
		return taxeId;
	}

	public void setTaxeId(Integer taxeId) {
		this.taxeId = taxeId;
	}

	public Integer getSaleForPickupId() {
		return saleForPickupId;
	}

	public void setSaleForPickupId(Integer saleForPickupId) {
		this.saleForPickupId = saleForPickupId;
	}

	public Integer getTenderID() {
		return tenderID;
	}

	public void setTenderID(Integer tenderID) {
		this.tenderID = tenderID;
	}

	public Integer getTenderChangeID() {
		return tenderChangeID;
	}

	public void setTenderChangeID(Integer tenderChangeID) {
		this.tenderChangeID = tenderChangeID;
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

	public Integer getInstrumentId() {
		return instrumentId;
	}

	public void setInstrumentId(Integer instrumentId) {
		this.instrumentId = instrumentId;
	}

	public Integer getStoredValueFundSaleId() {
		return storedValueFundSaleId;
	}

	public void setStoredValueFundSaleId(Integer storedValueFundSaleId) {
		this.storedValueFundSaleId = storedValueFundSaleId;
	}

}
