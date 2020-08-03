package fr.integrum.ob.nike.retailmodels;

import java.util.Date;
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
@Table(name = "NK_LineItems")
public class LineItem {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "LineItemId")
	private Integer lineItemId;

	@Column(name = "EntryMethod")
	private String entryMethod;

	@Column(name = "VoidFlag")
	private Boolean voidFlag;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Coupon", referencedColumnName = "LineItemId")
	private Coupon coupon;

	@Column(name = "SequenceNumber")
	private Integer sequenceNumber;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "ScanData", referencedColumnName = "LineItemId")
	private List<ScanData> scanData;

	@Column(name = "BeginDateTime")
	private Date beginDateTime;

	@Column(name = "EndDateTime")
	private Date endDateTime;

	@Column(name = "RepairID")
	private String repairID;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "Sale", referencedColumnName = "LineItemId")
	private List<Sale> sale;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "SaleForPickup", referencedColumnName = "LineItemId")
	private SaleForPickup saleForPickup;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "StoredValueFundSale", referencedColumnName = "LineItemId")
	private StoredValueFundSale storedValueFundSale;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "Return", referencedColumnName = "LineItemId")
	private List<Return> returns;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "Tenders", referencedColumnName = "LineItemId")
	private List<Tender> tenders;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "TenderChange", referencedColumnName = "LineItemId")
	private List<TenderChange> tenderChange;

	@Column(name = "retailTransactionId")
	private Integer retailTransactionId;

	@Column(name = "orderTransactionId")
	private Integer orderTransactionId;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "SaleForDelivery", referencedColumnName = "LineItemId")
	private List<SaleForDelivery> salesForDelivery;

	public LineItem() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getLineItemId() {
		return lineItemId;
	}

	public void setLineItemId(Integer lineItemId) {
		this.lineItemId = lineItemId;
	}

	public String getEntryMethod() {
		return entryMethod;
	}

	public void setEntryMethod(String entryMethod) {
		this.entryMethod = entryMethod;
	}

	public Boolean getVoidFlag() {
		return voidFlag;
	}

	public void setVoidFlag(Boolean voidFlag) {
		this.voidFlag = voidFlag;
	}

	public Coupon getCoupon() {
		return coupon;
	}

	public void setCoupon(Coupon coupon) {
		this.coupon = coupon;
	}

	public Integer getSequenceNumber() {
		return sequenceNumber;
	}

	public void setSequenceNumber(Integer sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
	}

	public List<ScanData> getScanData() {
		return scanData;
	}

	public void setScanData(List<ScanData> scanData) {
		this.scanData = scanData;
	}

	public Date getBeginDateTime() {
		return beginDateTime;
	}

	public void setBeginDateTime(Date beginDateTime) {
		this.beginDateTime = beginDateTime;
	}

	public Date getEndDateTime() {
		return endDateTime;
	}

	public void setEndDateTime(Date endDateTime) {
		this.endDateTime = endDateTime;
	}

	public String getRepairID() {
		return repairID;
	}

	public void setRepairID(String repairID) {
		this.repairID = repairID;
	}

	public List<Sale> getSale() {
		return sale;
	}

	public void setSale(List<Sale> sale) {
		this.sale = sale;
	}

	public SaleForPickup getSaleForPickup() {
		return saleForPickup;
	}

	public void setSaleForPickup(SaleForPickup saleForPickup) {
		this.saleForPickup = saleForPickup;
	}

	public StoredValueFundSale getStoredValueFundSale() {
		return storedValueFundSale;
	}

	public void setStoredValueFundSale(StoredValueFundSale storedValueFundSale) {
		this.storedValueFundSale = storedValueFundSale;
	}

	public List<Return> getReturns() {
		return returns;
	}

	public void setReturns(List<Return> returns) {
		this.returns = returns;
	}

	public List<Tender> getTenders() {
		return tenders;
	}

	public void setTenders(List<Tender> tenders) {
		this.tenders = tenders;
	}

	public List<TenderChange> getTenderChange() {
		return tenderChange;
	}

	public void setTenderChange(List<TenderChange> tenderChange) {
		this.tenderChange = tenderChange;
	}

	public Integer getRetailTransactionId() {
		return retailTransactionId;
	}

	public void setRetailTransactionId(Integer retailTransactionId) {
		this.retailTransactionId = retailTransactionId;
	}

	public Integer getOrderTransactionId() {
		return orderTransactionId;
	}

	public void setOrderTransactionId(Integer orderTransactionId) {
		this.orderTransactionId = orderTransactionId;
	}

	public List<SaleForDelivery> getSalesForDelivery() {
		return salesForDelivery;
	}

	public void setSalesForDelivery(List<SaleForDelivery> salesForDelivery) {
		this.salesForDelivery = salesForDelivery;
	}

}
