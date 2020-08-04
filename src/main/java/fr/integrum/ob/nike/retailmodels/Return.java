package fr.integrum.ob.nike.retailmodels;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "NK_Returns")
public class Return {

	@Id
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid")
	@Column(name = "returnID")
	private String returnId;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "returnID", referencedColumnName = "returnID")
	private List<Associate> associates;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "returnID", referencedColumnName = "returnID")
	private List<SerialNumber> serialNumbers;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ItemType", referencedColumnName = "returnID")
	private ItemType itemType;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Item", referencedColumnName = "returnID")
	private Item item;

	@Column(name = "Type")
	private String type;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "returnID", referencedColumnName = "returnID")
	private List<Description> descriptions;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "RegularSalesUnitPrice", referencedColumnName = "returnID")
	private Amount regularSalesUnitPrice;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ActualSalesUnitPrice", referencedColumnName = "returnID")
	private Amount actualSalesUnitPrice;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ExtendedAmount", referencedColumnName = "returnID")
	private Amount extendedAmount;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Quantity", referencedColumnName = "returnID")
	private Quantity quantity;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "returnID", referencedColumnName = "returnID")
	private List<Taxe> taxes;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "returnID", referencedColumnName = "returnID")
	private List<RetailPriceModifier> retailPriceModifiers;

	@Column(name = "eCommerceID")
	private String eCommerceID;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "TransactionLink", referencedColumnName = "returnID")
	private TransactionLink transactionLink;

	@Column(name = "LineItemId")
	private String lineItemId;

	public Return() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<Associate> getAssociates() {
		return associates;
	}

	public void setAssociates(List<Associate> associates) {
		this.associates = associates;
	}

	public List<SerialNumber> getSerialNumbers() {
		return serialNumbers;
	}

	public void setSerialNumbers(List<SerialNumber> serialNumbers) {
		this.serialNumbers = serialNumbers;
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
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

	public List<RetailPriceModifier> getRetailPriceModifiers() {
		return retailPriceModifiers;
	}

	public void setRetailPriceModifiers(List<RetailPriceModifier> retailPriceModifiers) {
		this.retailPriceModifiers = retailPriceModifiers;
	}

	public String geteCommerceID() {
		return eCommerceID;
	}

	public void seteCommerceID(String eCommerceID) {
		this.eCommerceID = eCommerceID;
	}

}
