package fr.integrum.nike.retailModels;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "NK_StoredValueFundSales")
public class StoredValueFundSale {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "stored_value_fund_sale_id")
	private Integer storedValueFundSaleId;
	@Column(name = "ItemType")
	private ItemType itemType;
	@Column(name = "Action")
	private String action;
	@Column(name = "TypeCode")
	private String typeCode;
	@Column(name = "UnitListPrice")
	private Amount unitListPrice;

	@Column(name = "Item")
	private Item item;

	@Column(name = "Descriptions")
	private Description descriptions;

	@Column(name = "RegularSalesUnitPrice")
	private Amount regularSalesUnitPrice;

	@Column(name = "ActualSalesUnitPrice")
	private Amount actualSalesUnitPrice;


	@Column(name = "ExtendedAmount")
	private Amount extendedAmount;

	@Column(name = "Quantity")
	private Quantity quantity;

	@Column(name = "Instruments")
	private List<Instrument> Instruments;

	@Column(name = "Taxes")
	private List<Taxe> taxes;


	@Column(name = "GiftReceiptFlag")
	private Boolean giftReceiptFlag;

}
