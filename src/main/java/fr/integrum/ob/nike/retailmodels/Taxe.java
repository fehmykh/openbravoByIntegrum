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

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "NK_Taxes")
public class Taxe {

	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	@Column(name = "TaxeId")
	private String taxeId;

	@Column
	private String TaxeType;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "TaxableAmount", referencedColumnName = "TaxeId")
	private Amount taxableAmount;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Amount", referencedColumnName = "TaxeId")
	private Amount amount;

	@Column(name = "Percent")
	private Float percent;

	@Column(name = "TaxGroupId")
	private String taxGroupId;

	@Column(name = "TaxJurisdictionId")
	private String taxJurisdictionId;

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

	public Taxe() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getTaxeId() {
		return taxeId;
	}

	public String getStoredValueFundSaleId() {
		return storedValueFundSaleId;
	}

	public void setStoredValueFundSaleId(String storedValueFundSaleId) {
		this.storedValueFundSaleId = storedValueFundSaleId;
	}

	public void setTaxeId(String taxeId) {
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
