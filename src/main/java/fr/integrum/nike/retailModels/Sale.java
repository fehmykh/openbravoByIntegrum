package fr.integrum.nike.retailModels;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "NK_Sales")
public class Sale {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "sale_id")
	private Integer saleId;
	
	@Column(name = "SerialNumbers")
	private List<SerialNumber> serialNumbers;
	
	@Column(name = "Associates")
	private List<Associate> associates;
	
	@Column(name = "ItemType")
	private ItemType itemType;
	
	@Column(name = "Item")
	private Item item;
	
	@Column(name = "Descriptions")
	private List<Description> descriptions;
	
	@Column(name = "RegularSalesUnitPrice")
	private Amount regularSalesUnitPrice;
	
	@Column(name = "ActualSalesUnitPrice")
	private Amount actualSalesUnitPrice;
	
	@Column(name = "ExtendedAmount")
	private Amount extendedAmount;
	
	@Column(name = "Quantity")
	private Quantity quantity;
	
	@Column(name = "Taxes")
	private List<Taxe> taxes;
	
	@Column(name = "eCommerceID")
	private String eCommerceID;
	
	@Column(name = "GiftReceiptFlag")
	private Boolean giftReceiptFlag;
	
	@Column(name = "ItemNotOnFileFlag")
	private Boolean itemNotOnFileFlag;
	
	@Column(name = "RetailPriceModifiers")
	private List<RetailPriceModifier> retailPriceModifiers;
	
}
