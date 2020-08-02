package fr.integrum.ob.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "products")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "product_id")
	private Integer productId;
	@Column
	private String client;
	@Column
	private String organization;
	@Column
	private String searchKey;
	@Column
	private String name;
	@Column
	private String description;
	@Column
	private String upcEAN;
	@Column
	private String uom;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "product_id", referencedColumnName = "product_id")
	private ProductCategory productCategory;
	@Column
	private String taxCategory;
	@Column
	private Boolean active;
	@Column
	private String productType;
	@Column
	private Boolean genericProduct;
	@Column
	private String versionNo;
	@Column
	private Boolean generic;
	@Column
	private Boolean stocked;
	@Column
	private Boolean purchased;
	@Column
	private Boolean sold;
	@Column
	private Boolean showCharactDesc;
	@Column
	private Boolean scale;
	@Column
	private Boolean showStock;
	@Column
	private Boolean allowAnonymousSale;
	@Column
	private Boolean multiSelectable;
	@Column
	private Boolean groupedProduct;
	@Column
	private Boolean printServices;
	@Column
	private Boolean deliveryModeInLayaway;
	@Column
	private Boolean deliveryMode;
	@Column
	private Boolean allowDeferredSell;
	@Column
	private Boolean linkedToProduct;
	@Column
	private Boolean uniquePerDocument;
	@Column
	private Boolean priceRuleBased;
	@Column
	private Boolean printDescription;
	@Column
	private Boolean returnable;
	@Column
	private String summaryLevel;
	@Column
	private Boolean billOfMaterials;
	@Column
	private Boolean printDetailsOnInvoice;
	@Column
	private Boolean printDetailsOnPickList;
	@Column
	private Boolean verified;
	@Column
	private String calculated;
	@Column
	private String production;
	@Column
	private String quantityVariable;
	@Column
	private Boolean discontinued;
	@Column
	private String quantityType;
	@Column
	private Boolean printPrice;
	@Column
	private Integer volume;
	@Column
	private Integer weight;
	@Column
	private String proposalType;
	@Column
	private Integer deferredSellMaxDays;
	@Column
	private String quantityRule;
	@Column
	private String attributeSet;
	@Column
	private String sku;
	@Column
	private Integer shelfWidth;
	@Column
	private Integer shelfHeight;
	@Column
	private Integer shelfDepth;
	@Column
	private Integer unitsPerPallet;
	@Column
	private Boolean discontinuedBy;
	@Column
	private String example;
	@Column
	private String documentNote;
	@OneToMany(cascade = CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name = "product_id", referencedColumnName = "product_id")
	private List<ProductCharacteristic> characteristicValues;

	public Product() {
		super();
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getClient() {
		return client;
	}

	public void setClient(String client) {
		this.client = client;
	}

	public String getOrganization() {
		return organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}

	public String getSearchKey() {
		return searchKey;
	}

	public void setSearchKey(String searchKey) {
		this.searchKey = searchKey;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUpcEAN() {
		return upcEAN;
	}

	public void setUpcEAN(String upcEAN) {
		this.upcEAN = upcEAN;
	}

	public String getUom() {
		return uom;
	}

	public void setUom(String uom) {
		this.uom = uom;
	}

	public ProductCategory getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(ProductCategory productCategory) {
		this.productCategory = productCategory;
	}

	public String getTaxCategory() {
		return taxCategory;
	}

	public void setTaxCategory(String taxCategory) {
		this.taxCategory = taxCategory;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public Boolean getGenericProduct() {
		return genericProduct;
	}

	public void setGenericProduct(Boolean genericProduct) {
		this.genericProduct = genericProduct;
	}

	public String getVersionNo() {
		return versionNo;
	}

	public void setVersionNo(String versionNo) {
		this.versionNo = versionNo;
	}

	public Boolean getGeneric() {
		return generic;
	}

	public void setGeneric(Boolean generic) {
		this.generic = generic;
	}

	public Boolean getStocked() {
		return stocked;
	}

	public void setStocked(Boolean stocked) {
		this.stocked = stocked;
	}

	public Boolean getPurchased() {
		return purchased;
	}

	public void setPurchased(Boolean purchased) {
		this.purchased = purchased;
	}

	public Boolean getSold() {
		return sold;
	}

	public void setSold(Boolean sold) {
		this.sold = sold;
	}

	public Boolean getShowCharactDesc() {
		return showCharactDesc;
	}

	public void setShowCharactDesc(Boolean showCharactDesc) {
		this.showCharactDesc = showCharactDesc;
	}

	public Boolean getScale() {
		return scale;
	}

	public void setScale(Boolean scale) {
		this.scale = scale;
	}

	public Boolean getShowStock() {
		return showStock;
	}

	public void setShowStock(Boolean showStock) {
		this.showStock = showStock;
	}

	public Boolean getAllowAnonymousSale() {
		return allowAnonymousSale;
	}

	public void setAllowAnonymousSale(Boolean allowAnonymousSale) {
		this.allowAnonymousSale = allowAnonymousSale;
	}

	public Boolean getMultiSelectable() {
		return multiSelectable;
	}

	public void setMultiSelectable(Boolean multiSelectable) {
		this.multiSelectable = multiSelectable;
	}

	public Boolean getGroupedProduct() {
		return groupedProduct;
	}

	public void setGroupedProduct(Boolean groupedProduct) {
		this.groupedProduct = groupedProduct;
	}

	public Boolean getPrintServices() {
		return printServices;
	}

	public void setPrintServices(Boolean printServices) {
		this.printServices = printServices;
	}

	public Boolean getDeliveryModeInLayaway() {
		return deliveryModeInLayaway;
	}

	public void setDeliveryModeInLayaway(Boolean deliveryModeInLayaway) {
		this.deliveryModeInLayaway = deliveryModeInLayaway;
	}

	public Boolean getDeliveryMode() {
		return deliveryMode;
	}

	public void setDeliveryMode(Boolean deliveryMode) {
		this.deliveryMode = deliveryMode;
	}

	public Boolean getAllowDeferredSell() {
		return allowDeferredSell;
	}

	public void setAllowDeferredSell(Boolean allowDeferredSell) {
		this.allowDeferredSell = allowDeferredSell;
	}

	public Boolean getLinkedToProduct() {
		return linkedToProduct;
	}

	public void setLinkedToProduct(Boolean linkedToProduct) {
		this.linkedToProduct = linkedToProduct;
	}

	public Boolean getUniquePerDocument() {
		return uniquePerDocument;
	}

	public void setUniquePerDocument(Boolean uniquePerDocument) {
		this.uniquePerDocument = uniquePerDocument;
	}

	public Boolean getPriceRuleBased() {
		return priceRuleBased;
	}

	public void setPriceRuleBased(Boolean priceRuleBased) {
		this.priceRuleBased = priceRuleBased;
	}

	public Boolean getPrintDescription() {
		return printDescription;
	}

	public void setPrintDescription(Boolean printDescription) {
		this.printDescription = printDescription;
	}

	public Boolean getReturnable() {
		return returnable;
	}

	public void setReturnable(Boolean returnable) {
		this.returnable = returnable;
	}

	public String getSummaryLevel() {
		return summaryLevel;
	}

	public void setSummaryLevel(String summaryLevel) {
		this.summaryLevel = summaryLevel;
	}

	public Boolean getBillOfMaterials() {
		return billOfMaterials;
	}

	public void setBillOfMaterials(Boolean billOfMaterials) {
		this.billOfMaterials = billOfMaterials;
	}

	public Boolean getPrintDetailsOnInvoice() {
		return printDetailsOnInvoice;
	}

	public void setPrintDetailsOnInvoice(Boolean printDetailsOnInvoice) {
		this.printDetailsOnInvoice = printDetailsOnInvoice;
	}

	public Boolean getPrintDetailsOnPickList() {
		return printDetailsOnPickList;
	}

	public void setPrintDetailsOnPickList(Boolean printDetailsOnPickList) {
		this.printDetailsOnPickList = printDetailsOnPickList;
	}

	public Boolean getVerified() {
		return verified;
	}

	public void setVerified(Boolean verified) {
		this.verified = verified;
	}

	public String getCalculated() {
		return calculated;
	}

	public void setCalculated(String calculated) {
		this.calculated = calculated;
	}

	public String getProduction() {
		return production;
	}

	public void setProduction(String production) {
		this.production = production;
	}

	public String getQuantityVariable() {
		return quantityVariable;
	}

	public void setQuantityVariable(String quantityVariable) {
		this.quantityVariable = quantityVariable;
	}

	public Boolean getDiscontinued() {
		return discontinued;
	}

	public void setDiscontinued(Boolean discontinued) {
		this.discontinued = discontinued;
	}

	public String getQuantityType() {
		return quantityType;
	}

	public void setQuantityType(String quantityType) {
		this.quantityType = quantityType;
	}

	public Boolean getPrintPrice() {
		return printPrice;
	}

	public void setPrintPrice(Boolean printPrice) {
		this.printPrice = printPrice;
	}

	public Integer getVolume() {
		return volume;
	}

	public void setVolume(Integer volume) {
		this.volume = volume;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	public String getProposalType() {
		return proposalType;
	}

	public void setProposalType(String proposalType) {
		this.proposalType = proposalType;
	}

	public Integer getDeferredSellMaxDays() {
		return deferredSellMaxDays;
	}

	public void setDeferredSellMaxDays(Integer deferredSellMaxDays) {
		this.deferredSellMaxDays = deferredSellMaxDays;
	}

	public String getQuantityRule() {
		return quantityRule;
	}

	public void setQuantityRule(String quantityRule) {
		this.quantityRule = quantityRule;
	}

	public String getAttributeSet() {
		return attributeSet;
	}

	public void setAttributeSet(String attributeSet) {
		this.attributeSet = attributeSet;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public Integer getShelfWidth() {
		return shelfWidth;
	}

	public void setShelfWidth(Integer shelfWidth) {
		this.shelfWidth = shelfWidth;
	}

	public Integer getShelfHeight() {
		return shelfHeight;
	}

	public void setShelfHeight(Integer shelfHeight) {
		this.shelfHeight = shelfHeight;
	}

	public Integer getShelfDepth() {
		return shelfDepth;
	}

	public void setShelfDepth(Integer shelfDepth) {
		this.shelfDepth = shelfDepth;
	}

	public Integer getUnitsPerPallet() {
		return unitsPerPallet;
	}

	public void setUnitsPerPallet(Integer unitsPerPallet) {
		this.unitsPerPallet = unitsPerPallet;
	}

	public Boolean getDiscontinuedBy() {
		return discontinuedBy;
	}

	public void setDiscontinuedBy(Boolean discontinuedBy) {
		this.discontinuedBy = discontinuedBy;
	}

	public String getExample() {
		return example;
	}

	public void setExample(String example) {
		this.example = example;
	}

	public String getDocumentNote() {
		return documentNote;
	}

	public void setDocumentNote(String documentNote) {
		this.documentNote = documentNote;
	}

	public List<ProductCharacteristic> getCharacteristicValues() {
		return characteristicValues;
	}

	public void setCharacteristicValues(List<ProductCharacteristic> characteristicValues) {
		this.characteristicValues = characteristicValues;
	}

}
