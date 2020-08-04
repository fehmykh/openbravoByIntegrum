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
@Table(name = "NK_StoredValueFundSales")
public class StoredValueFundSale {

	@Id
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid")
	@Column(name = "storedValueFundSaleId")
	private String storedValueFundSaleId;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ItemType", referencedColumnName = "storedValueFundSaleId")
	private ItemType itemType;

	@Column(name = "Action")
	private String action;

	@Column(name = "TypeCode")
	private String typeCode;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "UnitListPrice", referencedColumnName = "storedValueFundSaleId")
	private Amount unitListPrice;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Item", referencedColumnName = "storedValueFundSaleId")
	private Item item;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "descriptions", referencedColumnName = "storedValueFundSaleId")
	private Description descriptions;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "regularSalesUnitPrice", referencedColumnName = "storedValueFundSaleId")
	private Amount regularSalesUnitPrice;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "actualSalesUnitPrice", referencedColumnName = "storedValueFundSaleId")
	private Amount actualSalesUnitPrice;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "extendedAmount", referencedColumnName = "storedValueFundSaleId")
	private Amount extendedAmount;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "quantity", referencedColumnName = "storedValueFundSaleId")
	private Quantity quantity;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "storedValueFundSaleId", referencedColumnName = "storedValueFundSaleId")
	private List<Instrument> instruments;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "storedValueFundSaleId", referencedColumnName = "storedValueFundSaleId")
	private List<Taxe> taxes;

	@Column(name = "giftReceiptFlag")
	private Boolean giftReceiptFlag;

	@Column(name = "LineItemId")
	private String lineItemId;

	public StoredValueFundSale() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ItemType getItemType() {
		return itemType;
	}

	public void setItemType(ItemType itemType) {
		this.itemType = itemType;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getTypeCode() {
		return typeCode;
	}

	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}

	public Amount getUnitListPrice() {
		return unitListPrice;
	}

	public void setUnitListPrice(Amount unitListPrice) {
		this.unitListPrice = unitListPrice;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public Description getDescriptions() {
		return descriptions;
	}

	public void setDescriptions(Description descriptions) {
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

	public List<Instrument> getInstruments() {
		return instruments;
	}

	public void setInstruments(List<Instrument> instruments) {
		this.instruments = instruments;
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

	public String getLineItemId() {
		return lineItemId;
	}

}
