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

}
