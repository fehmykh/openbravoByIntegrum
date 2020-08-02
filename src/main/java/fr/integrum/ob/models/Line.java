package fr.integrum.ob.models;

import java.util.Date;
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
@Table(name="lines")
public class Line {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "line_id")
	private Integer lineId;
	@Column
	private Double grossUnitPrice;
	@Column
	private Double obresmsQtysenttokitchen;
	@Column
	private Date loaded;
	@Column
	private String uOM;
	@Column
	private Double deliveredQuantity;
	@Column
	private Boolean obposIspaid;
	@Column
	private Double grossListPrice;
	@Column
	private String quotationDocumentTypeId;
	@Column
	private String productId;
	@Column
	private Double baseNetUnitPrice;
	@Column
	private Double unitPrice;
	@Column
	private Double pricePrecision;
	@Column
	private Boolean taxExempt;
	@Column
	private Boolean obposCanbedelivered;
	@Column
	private String tax;
	@Column
	private String warehouse;
	@Column
	private String taxCategory;
	@Column
	private Double obwplQtyinpicking;
	@Column
	private Boolean returnable;
	@Column
	private Double overdueReturnDays;
	@Column
	private String product;
	@Column
	private Boolean obtaxexIstaxexempt;
	@Column
	private Double remainingQuantity;
	@Column
	private Double grossAmount;
	@Column
	private String documentTypeId;
	@Column
	private Double discountPercentage;
	@Column
	private Double shippedQuantity;
	@Column
	private String productType;
	@Column
	private Double qty;
	@Column
	private Double netAmount;
	@Column
	private Double invoicedQuantity;
	@Column
	private Double listPrice;
	@Column
	private String warehousename;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "line_id", referencedColumnName = "line_id")
	private Organization organization;
	@Column
	private Boolean priceIncludesTax;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "line_id", referencedColumnName = "line_id")
	private List<ShipmentLine> shipmentLines;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "line_id", referencedColumnName = "line_id")
	private TaxLineIdentifier taxLines;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "line_id", referencedColumnName = "line_id")
	private List<Promotion> promotions;
	@Column(name="order_id")
	private Integer orderId;
	public Line() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getLineId() {
		return lineId;
	}
	public void setLineId(Integer lineId) {
		this.lineId = lineId;
	}
	public Double getGrossUnitPrice() {
		return grossUnitPrice;
	}
	public void setGrossUnitPrice(Double grossUnitPrice) {
		this.grossUnitPrice = grossUnitPrice;
	}
	public Double getObresmsQtysenttokitchen() {
		return obresmsQtysenttokitchen;
	}
	public void setObresmsQtysenttokitchen(Double obresmsQtysenttokitchen) {
		this.obresmsQtysenttokitchen = obresmsQtysenttokitchen;
	}
	public Date getLoaded() {
		return loaded;
	}
	public void setLoaded(Date loaded) {
		this.loaded = loaded;
	}
	public String getuOM() {
		return uOM;
	}
	public void setuOM(String uOM) {
		this.uOM = uOM;
	}
	public Double getDeliveredQuantity() {
		return deliveredQuantity;
	}
	public void setDeliveredQuantity(Double deliveredQuantity) {
		this.deliveredQuantity = deliveredQuantity;
	}
	public Boolean getObposIspaid() {
		return obposIspaid;
	}
	public void setObposIspaid(Boolean obposIspaid) {
		this.obposIspaid = obposIspaid;
	}
	public Double getGrossListPrice() {
		return grossListPrice;
	}
	public void setGrossListPrice(Double grossListPrice) {
		this.grossListPrice = grossListPrice;
	}
	public String getQuotationDocumentTypeId() {
		return quotationDocumentTypeId;
	}
	public void setQuotationDocumentTypeId(String quotationDocumentTypeId) {
		this.quotationDocumentTypeId = quotationDocumentTypeId;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public Double getBaseNetUnitPrice() {
		return baseNetUnitPrice;
	}
	public void setBaseNetUnitPrice(Double baseNetUnitPrice) {
		this.baseNetUnitPrice = baseNetUnitPrice;
	}
	public Double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public Double getPricePrecision() {
		return pricePrecision;
	}
	public void setPricePrecision(Double pricePrecision) {
		this.pricePrecision = pricePrecision;
	}
	public Boolean getTaxExempt() {
		return taxExempt;
	}
	public void setTaxExempt(Boolean taxExempt) {
		this.taxExempt = taxExempt;
	}
	public Boolean getObposCanbedelivered() {
		return obposCanbedelivered;
	}
	public void setObposCanbedelivered(Boolean obposCanbedelivered) {
		this.obposCanbedelivered = obposCanbedelivered;
	}
	public String getTax() {
		return tax;
	}
	public void setTax(String tax) {
		this.tax = tax;
	}
	public String getWarehouse() {
		return warehouse;
	}
	public void setWarehouse(String warehouse) {
		this.warehouse = warehouse;
	}
	public String getTaxCategory() {
		return taxCategory;
	}
	public void setTaxCategory(String taxCategory) {
		this.taxCategory = taxCategory;
	}
	public Double getObwplQtyinpicking() {
		return obwplQtyinpicking;
	}
	public void setObwplQtyinpicking(Double obwplQtyinpicking) {
		this.obwplQtyinpicking = obwplQtyinpicking;
	}
	public Boolean getReturnable() {
		return returnable;
	}
	public void setReturnable(Boolean returnable) {
		this.returnable = returnable;
	}
	public Double getOverdueReturnDays() {
		return overdueReturnDays;
	}
	public void setOverdueReturnDays(Double overdueReturnDays) {
		this.overdueReturnDays = overdueReturnDays;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public Boolean getObtaxexIstaxexempt() {
		return obtaxexIstaxexempt;
	}
	public void setObtaxexIstaxexempt(Boolean obtaxexIstaxexempt) {
		this.obtaxexIstaxexempt = obtaxexIstaxexempt;
	}
	public Double getRemainingQuantity() {
		return remainingQuantity;
	}
	public void setRemainingQuantity(Double remainingQuantity) {
		this.remainingQuantity = remainingQuantity;
	}
	public Double getGrossAmount() {
		return grossAmount;
	}
	public void setGrossAmount(Double grossAmount) {
		this.grossAmount = grossAmount;
	}
	public String getDocumentTypeId() {
		return documentTypeId;
	}
	public void setDocumentTypeId(String documentTypeId) {
		this.documentTypeId = documentTypeId;
	}
	public Double getDiscountPercentage() {
		return discountPercentage;
	}
	public void setDiscountPercentage(Double discountPercentage) {
		this.discountPercentage = discountPercentage;
	}
	public Double getShippedQuantity() {
		return shippedQuantity;
	}
	public void setShippedQuantity(Double shippedQuantity) {
		this.shippedQuantity = shippedQuantity;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public Double getQty() {
		return qty;
	}
	public void setQty(Double qty) {
		this.qty = qty;
	}
	public Double getNetAmount() {
		return netAmount;
	}
	public void setNetAmount(Double netAmount) {
		this.netAmount = netAmount;
	}
	public Double getInvoicedQuantity() {
		return invoicedQuantity;
	}
	public void setInvoicedQuantity(Double invoicedQuantity) {
		this.invoicedQuantity = invoicedQuantity;
	}
	public Double getListPrice() {
		return listPrice;
	}
	public void setListPrice(Double listPrice) {
		this.listPrice = listPrice;
	}
	public String getWarehousename() {
		return warehousename;
	}
	public void setWarehousename(String warehousename) {
		this.warehousename = warehousename;
	}
	public Organization getOrganization() {
		return organization;
	}
	public void setOrganization(Organization organization) {
		this.organization = organization;
	}
	public Boolean getPriceIncludesTax() {
		return priceIncludesTax;
	}
	public void setPriceIncludesTax(Boolean priceIncludesTax) {
		this.priceIncludesTax = priceIncludesTax;
	}
	public List<ShipmentLine> getShipmentLines() {
		return shipmentLines;
	}
	public void setShipmentLines(List<ShipmentLine> shipmentLines) {
		this.shipmentLines = shipmentLines;
	}
	public TaxLineIdentifier getTaxLines() {
		return taxLines;
	}
	public void setTaxLines(TaxLineIdentifier taxLines) {
		this.taxLines = taxLines;
	}
	public List<Promotion> getPromotions() {
		return promotions;
	}
	public void setPromotions(List<Promotion> promotions) {
		this.promotions = promotions;
	}
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	
}
