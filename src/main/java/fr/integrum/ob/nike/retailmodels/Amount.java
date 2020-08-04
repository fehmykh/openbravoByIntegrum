package fr.integrum.ob.nike.retailmodels;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "NK_Amounts")
public class Amount {

	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	@Column(name = "AmountID")
	private String amountId;

	@Column(name = "Amount")
	private Double amount;

	@Column(name = "Currency")
	private String currency;

	@Column(name = "SaleId")
	private String saleId;

	@Column(name = "RetailPriceModifiersId")
	private String retailPriceModifiersId;

	@Column(name = "TaxeId")
	private String taxeId;

	@Column(name = "SaleForPickupId")
	private String saleForPickupId;

	@Column(name = "TenderID")
	private String tenderID;

	@Column(name = "TenderChangeID")
	private String tenderChangeID;

	@Column(name = "returnID")
	private String returnID;

	@Column(name = "SaleForDeliveryId")
	private String saleForDeliveryId;

	@Column(name = "InstrumentId")
	private String instrumentId;

	@Column(name = "StoredValueFundSaleId")
	private String storedValueFundSaleId;

	@Column(name = "VoucherID")
	private String voucherID;

	public Amount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getVoucherID() {
		return voucherID;
	}

	public void setVoucherID(String voucherID) {
		this.voucherID = voucherID;
	}

	public String getAmountId() {
		return amountId;
	}

	public void setAmountId(String amountId) {
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

	public String getTaxeId() {
		return taxeId;
	}

	public void setTaxeId(String taxeId) {
		this.taxeId = taxeId;
	}

	public String getSaleForPickupId() {
		return saleForPickupId;
	}

	public void setSaleForPickupId(String saleForPickupId) {
		this.saleForPickupId = saleForPickupId;
	}

	public String getTenderID() {
		return tenderID;
	}

	public void setTenderID(String tenderID) {
		this.tenderID = tenderID;
	}

	public String getTenderChangeID() {
		return tenderChangeID;
	}

	public void setTenderChangeID(String tenderChangeID) {
		this.tenderChangeID = tenderChangeID;
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

	public String getInstrumentId() {
		return instrumentId;
	}

	public void setInstrumentId(String instrumentId) {
		this.instrumentId = instrumentId;
	}

	public String getStoredValueFundSaleId() {
		return storedValueFundSaleId;
	}

	public void setStoredValueFundSaleId(String storedValueFundSaleId) {
		this.storedValueFundSaleId = storedValueFundSaleId;
	}

}
