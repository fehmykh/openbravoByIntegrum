package fr.integrum.ob.nike.retailmodels;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "NK_Taxes")
public class Taxe {

	@Id
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid")
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

}
