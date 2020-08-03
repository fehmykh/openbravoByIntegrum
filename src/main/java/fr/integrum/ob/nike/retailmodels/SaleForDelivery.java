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
@Table(name = "NK_SalesForDelivery")
public class SaleForDelivery {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "SaleForDeliveryId")
	private Integer saleForDeliveryId;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "Associates", referencedColumnName = "SaleForDeliveryId")
	private List<Associate> associates;

	@Column(name = "eCommerceID")
	private String eCommerceID;

	@Column(name = "GiftReceiptFlag")
	private Boolean giftReceiptFlag;

	@Column(name = "ItemNotOnFileFlag")
	private Boolean itemNotOnFileFlag;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ItemType", referencedColumnName = "SaleForDeliveryId")
	private ItemType itemType;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Item", referencedColumnName = "SaleForDeliveryId")
	private Item item;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "Descriptions", referencedColumnName = "SaleForDeliveryId")
	private List<Description> descriptions;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "RegularSalesUnitPrice", referencedColumnName = "SaleForDeliveryId")
	private Amount regularSalesUnitPrice;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ActualSalesUnitPrice", referencedColumnName = "SaleForDeliveryId")
	private Amount actualSalesUnitPrice;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ExtendedAmount", referencedColumnName = "SaleForDeliveryId")
	private Amount extendedAmount;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Quantity", referencedColumnName = "SaleForDeliveryId")
	private Quantity quantity;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "Taxes", referencedColumnName = "SaleForDeliveryId")
	private List<Taxe> taxes;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "Delivery", referencedColumnName = "SaleForDeliveryId")
	private List<Delivery> delivery;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "RetailPriceModifiers", referencedColumnName = "SaleForDeliveryId")
	private List<RetailPriceModifier> retailPriceModifiers;

	@Column(name = "LineItemId")
	private Integer lineItemId;

	public SaleForDelivery() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getSaleForDeliveryId() {
		return saleForDeliveryId;
	}

	public void setSaleForDeliveryId(Integer saleForDeliveryId) {
		this.saleForDeliveryId = saleForDeliveryId;
	}

	public List<Associate> getAssociates() {
		return associates;
	}

	public void setAssociates(List<Associate> associates) {
		this.associates = associates;
	}

	public String geteCommerceID() {
		return eCommerceID;
	}

	public void seteCommerceID(String eCommerceID) {
		this.eCommerceID = eCommerceID;
	}

	public Boolean getGiftReceiptFlag() {
		return giftReceiptFlag;
	}

	public void setGiftReceiptFlag(Boolean giftReceiptFlag) {
		this.giftReceiptFlag = giftReceiptFlag;
	}

	public Boolean getItemNotOnFileFlag() {
		return itemNotOnFileFlag;
	}

	public void setItemNotOnFileFlag(Boolean itemNotOnFileFlag) {
		this.itemNotOnFileFlag = itemNotOnFileFlag;
	}

	public ItemType getItemType() {
		return itemType;
	}

	public void setItemType(ItemType itemType) {
		this.itemType = itemType;
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

	public List<Delivery> getDelivery() {
		return delivery;
	}

	public void setDelivery(List<Delivery> delivery) {
		this.delivery = delivery;
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
