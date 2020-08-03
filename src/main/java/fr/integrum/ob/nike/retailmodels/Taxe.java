package fr.integrum.ob.nike.retailmodels;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "NK_Taxes")
public class Taxe {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "TaxeId")
	private Integer taxeId;

	@Column
	private String TaxeType;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "TaxableAmount", referencedColumnName = "TaxeId")
	private Amount taxableAmount;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Amount", referencedColumnName = "TaxeId")
	private Amount amount;

	@Column
	private Float percent;

	@Column
	private String taxGroupId;

	@Column
	private String taxJurisdictionId;

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

	public Taxe() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getTaxeId() {
		return taxeId;
	}

	public Integer getStoredValueFundSaleId() {
		return storedValueFundSaleId;
	}

	public void setStoredValueFundSaleId(Integer storedValueFundSaleId) {
		this.storedValueFundSaleId = storedValueFundSaleId;
	}

	public void setTaxeId(Integer taxeId) {
		this.taxeId = taxeId;
	}

	public String getTaxeType() {
		return TaxeType;
	}

	public void setTaxeType(String taxeType) {
		TaxeType = taxeType;
	}

	public Amount getTaxableAmount() {
		return taxableAmount;
	}

	public void setTaxableAmount(Amount taxableAmount) {
		taxableAmount = taxableAmount;
	}

	public Amount getAmount() {
		return amount;
	}

	public void setAmount(Amount amount) {
		this.amount = amount;
	}

	public Float getPercent() {
		return percent;
	}

	public void setPercent(Float percent) {
		this.percent = percent;
	}

	public String getTaxGroupId() {
		return taxGroupId;
	}

	public void setTaxGroupId(String taxGroupId) {
		this.taxGroupId = taxGroupId;
	}

	public String getTaxJurisdictionId() {
		return taxJurisdictionId;
	}

	public void setTaxJurisdictionId(String taxJurisdictionId) {
		this.taxJurisdictionId = taxJurisdictionId;
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
