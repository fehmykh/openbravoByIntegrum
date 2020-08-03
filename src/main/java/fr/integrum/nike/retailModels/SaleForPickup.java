package fr.integrum.nike.retailModels;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "NK_SalesForPickup")
public class SaleForPickup {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "sale_for_pickup_id")
	private Integer SaleForPickupId;
	@Column(name = "ItemType")
	private ItemType itemType;
	@Column(name = "ItemNotOnFileFlag")
	private Boolean itemNotOnFileFlag;
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
	@Column(name = "GiftReceiptFlag")
	private Boolean giftReceiptFlag;
	@Column(name = "Pickup")
	private Pickup pickup;
	@Column(name = "RetailPriceModifiers")
	private List<RetailPriceModifier> retailPriceModifiers;
}
