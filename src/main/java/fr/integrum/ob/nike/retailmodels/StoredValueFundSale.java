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
@Table(name = "NK_StoredValueFundSales")
public class StoredValueFundSale {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "StoredValueFundSaleId")
	private Integer storedValueFundSaleId;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ItemType", referencedColumnName = "StoredValueFundSaleId")
	private ItemType itemType;
	
	@Column(name = "Action")
	private String action;
	
	@Column(name = "TypeCode")
	private String typeCode;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "UnitListPrice", referencedColumnName = "StoredValueFundSaleId")
	private Amount unitListPrice;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Item", referencedColumnName = "StoredValueFundSaleId")
	private Item item;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Descriptions", referencedColumnName = "StoredValueFundSaleId")
	private Description descriptions;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "RegularSalesUnitPrice", referencedColumnName = "StoredValueFundSaleId")
	private Amount regularSalesUnitPrice;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ActualSalesUnitPrice", referencedColumnName = "StoredValueFundSaleId")
	private Amount actualSalesUnitPrice;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ExtendedAmount", referencedColumnName = "StoredValueFundSaleId")
	private Amount extendedAmount;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Quantity", referencedColumnName = "StoredValueFundSaleId")
	private Quantity quantity;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "Instruments", referencedColumnName = "StoredValueFundSaleId")
	private List<Instrument> Instruments;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "Taxes", referencedColumnName = "StoredValueFundSaleId")
	private List<Taxe> taxes;

	@Column(name = "GiftReceiptFlag")
	private Boolean giftReceiptFlag;
	
	@Column(name="LineItemId")
	private Integer lineItemId;

	public StoredValueFundSale() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getStoredValueFundSaleId() {
		return storedValueFundSaleId;
	}

	public void setStoredValueFundSaleId(Integer storedValueFundSaleId) {
		this.storedValueFundSaleId = storedValueFundSaleId;
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
		return Instruments;
	}

	public void setInstruments(List<Instrument> instruments) {
		Instruments = instruments;
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

	public Integer getLineItemId() {
		return lineItemId;
	}

	public void setLineItemId(Integer lineItemId) {
		this.lineItemId = lineItemId;
	}

}
