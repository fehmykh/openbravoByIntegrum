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

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "NK_Sales")
public class Sale {

	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	@Column(name = "SaleId")
	private String saleId;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "SaleId", referencedColumnName = "SaleId")
	private List<SerialNumber> serialNumbers;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "SaleId", referencedColumnName = "SaleId")
	private List<Associate> associates;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ItemType", referencedColumnName = "SaleId")
	private ItemType itemType;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Item", referencedColumnName = "SaleId")
	private Item item;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "SaleId", referencedColumnName = "SaleId")
	private List<Description> descriptions;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "RegularSalesUnitPrice", referencedColumnName = "SaleId")
	private Amount regularSalesUnitPrice;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ActualSalesUnitPrice", referencedColumnName = "SaleId")
	private Amount actualSalesUnitPrice;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ExtendedAmount", referencedColumnName = "SaleId")
	private Amount extendedAmount;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Quantity", referencedColumnName = "SaleId")
	private Quantity quantity;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "SaleId", referencedColumnName = "SaleId")
	private List<Taxe> taxes;

	@Column(name = "eCommerceID")
	private String eCommerceID;

	@Column(name = "GiftReceiptFlag")
	private Boolean giftReceiptFlag;

	@Column(name = "ItemNotOnFileFlag")
	private Boolean itemNotOnFileFlag;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "SaleId", referencedColumnName = "SaleId")
	private List<RetailPriceModifier> retailPriceModifiers;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "SaleId", referencedColumnName = "SaleId")
	private List<Ticket> tickets;

	@Column(name = "LineItemId")
	private String lineItemId;

	public Sale() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getSaleId() {
		return saleId;
	}

	public void setSaleId(String saleId) {
		this.saleId = saleId;
	}

	public List<SerialNumber> getSerialNumbers() {
		return serialNumbers;
	}

	public void setSerialNumbers(List<SerialNumber> serialNumbers) {
		this.serialNumbers = serialNumbers;
	}

	public List<Associate> getAssociates() {
		return associates;
	}

	public void setAssociates(List<Associate> associates) {
		this.associates = associates;
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

	public List<RetailPriceModifier> getRetailPriceModifiers() {
		return retailPriceModifiers;
	}

	public void setRetailPriceModifiers(List<RetailPriceModifier> retailPriceModifiers) {
		this.retailPriceModifiers = retailPriceModifiers;
	}

	public List<Ticket> getTickets() {
		return tickets;
	}

	public void setTickets(List<Ticket> tickets) {
		this.tickets = tickets;
	}

	public String getLineItemId() {
		return lineItemId;
	}

	public void setLineItemId(String lineItemId) {
		this.lineItemId = lineItemId;
	}

}
