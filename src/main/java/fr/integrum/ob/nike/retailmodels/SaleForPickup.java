package fr.integrum.ob.nike.retailmodels;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "NK_SalesForPickup")
public class SaleForPickup {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "SaleForPickupId")
	private Integer saleForPickupId;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ItemType", referencedColumnName = "SaleForPickupId")
	private ItemType itemType;

	@Column(name = "ItemNotOnFileFlag")
	private Boolean itemNotOnFileFlag;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Item", referencedColumnName = "SaleForPickupId")
	private Item item;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "Descriptions", referencedColumnName = "SaleForPickupId")
	private List<Description> descriptions;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "RegularSalesUnitPrice", referencedColumnName = "SaleForPickupId")
	private Amount regularSalesUnitPrice;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ActualSalesUnitPrice", referencedColumnName = "SaleForPickupId")
	private Amount actualSalesUnitPrice;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ExtendedAmount", referencedColumnName = "SaleForPickupId")
	private Amount extendedAmount;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Quantity", referencedColumnName = "SaleForPickupId")
	private Quantity quantity;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "Taxes", referencedColumnName = "SaleForPickupId")
	private List<Taxe> taxes;

	@Column(name = "GiftReceiptFlag")
	private Boolean giftReceiptFlag;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Pickup", referencedColumnName = "SaleForPickupId")
	private Pickup pickup;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "RetailPriceModifiers", referencedColumnName = "SaleForPickupId")
	private List<RetailPriceModifier> retailPriceModifiers;

	@Column(name = "LineItemId")
	private Integer lineItemId;

	public SaleForPickup() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getSaleForPickupId() {
		return saleForPickupId;
	}

	public void setSaleForPickupId(Integer saleForPickupId) {
		this.saleForPickupId = saleForPickupId;
	}

	public ItemType getItemType() {
		return itemType;
	}

	public void setItemType(ItemType itemType) {
		this.itemType = itemType;
	}

	public Boolean getItemNotOnFileFlag() {
		return itemNotOnFileFlag;
	}

	public void setItemNotOnFileFlag(Boolean itemNotOnFileFlag) {
		this.itemNotOnFileFlag = itemNotOnFileFlag;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public List<Description> getDescriptions() {
		return descriptions;
	}

	public void setDescriptions(List<Description> descriptions) {
		this.descriptions = descriptions;
	}

	public Amount getRegularSalesUnitPrice() {
		return regularSalesUnitPrice;
	}

	public void setRegularSalesUnitPrice(Amount regularSalesUnitPrice) {
		this.regularSalesUnitPrice = regularSalesUnitPrice;
	}

	public Amount getActualSalesUnitPrice() {
		return actualSalesUnitPrice;
	}

	public void setActualSalesUnitPrice(Amount actualSalesUnitPrice) {
		this.actualSalesUnitPrice = actualSalesUnitPrice;
	}

	public Amount getExtendedAmount() {
		return extendedAmount;
	}

	public void setExtendedAmount(Amount extendedAmount) {
		this.extendedAmount = extendedAmount;
	}

	public Quantity getQuantity() {
		return quantity;
	}

	public void setQuantity(Quantity quantity) {
		this.quantity = quantity;
	}

	public List<Taxe> getTaxes() {
		return taxes;
	}

	public void setTaxes(List<Taxe> taxes) {
		this.taxes = taxes;
	}

	public Boolean getGiftReceiptFlag() {
		return giftReceiptFlag;
	}

	public void setGiftReceiptFlag(Boolean giftReceiptFlag) {
		this.giftReceiptFlag = giftReceiptFlag;
	}

	public Pickup getPickup() {
		return pickup;
	}

	public void setPickup(Pickup pickup) {
		this.pickup = pickup;
	}

	public List<RetailPriceModifier> getRetailPriceModifiers() {
		return retailPriceModifiers;
	}

	public void setRetailPriceModifiers(List<RetailPriceModifier> retailPriceModifiers) {
		this.retailPriceModifiers = retailPriceModifiers;
	}

	public Integer getLineItemId() {
		return lineItemId;
	}

	public void setLineItemId(Integer lineItemId) {
		this.lineItemId = lineItemId;
	}

}
