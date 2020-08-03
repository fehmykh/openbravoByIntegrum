package fr.integrum.ob.models;

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
import javax.persistence.Table;

@Entity
@Table(name = "ob_orders")
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "order_id")
	private Integer orderId;
	@Column
	private String posTerminal$_identifier;
	@Column
	private String documentType;
	@Column
	private Boolean priceIncludesTax;
	@Column
	private String currency$_identifier;
	@Column
	private String bp;
	@Column
	private String documentTypeReturnId;
	@Column
	private String priceList;
	@Column
	private Date loaded;
	@Column
	private String documentNo;
	@Column
	private String organization$_identifier;
	@Column
	private Boolean iscancelled;
	@Column
	private Boolean isModified;
	@Column
	private String client;
	@Column
	private String currency;
	@Column
	private Boolean cashVAT;
	@Column
	private String updatedBy;
	@Column
	private Double totalNetAmount;
	@Column
	private String posTerminal;
	@Column
	private Boolean isLayaway;
	@Column
	private Boolean rtpRespsuccess;
	@Column
	private String bpLocId;
	@Column
	private Date creationDate;
	@Column
	private String warehouse;
	@Column
	private Boolean isQuotation;
	@Column
	private Boolean rtpResponse;
	@Column
	private String invoiceTerms;
	@Column
	private Double totalamount;
	@Column
	private String createdBy;
	@Column
	private String organization;
	@Column
	private String bpBillLocId;
	@Column
	private Date orderDate;
	@Column
	private String businessPartner$_identifier;
	@Column
	private String trxOrganization;
	@Column
	private Boolean invoiceCreated;
	@Column
	private Boolean generateInvoice;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "order_id", referencedColumnName = "order_id")
	private List<Line> lines;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "order_id", referencedColumnName = "order_id")
	private List<Payment> payments;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "order_id", referencedColumnName = "order_id")
	private List<TaxHeaderIdentifier> taxes;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "order_id", referencedColumnName = "order_id")
	private List<Approval> approvals;
	@Column
	private Boolean recordInImportEntry;
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public String getPosTerminal$_identifier() {
		return posTerminal$_identifier;
	}
	public void setPosTerminal$_identifier(String posTerminal$_identifier) {
		this.posTerminal$_identifier = posTerminal$_identifier;
	}
	public String getDocumentType() {
		return documentType;
	}
	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}
	public Boolean getPriceIncludesTax() {
		return priceIncludesTax;
	}
	public void setPriceIncludesTax(Boolean priceIncludesTax) {
		this.priceIncludesTax = priceIncludesTax;
	}
	public String getCurrency$_identifier() {
		return currency$_identifier;
	}
	public void setCurrency$_identifier(String currency$_identifier) {
		this.currency$_identifier = currency$_identifier;
	}
	public String getBp() {
		return bp;
	}
	public void setBp(String bp) {
		this.bp = bp;
	}
	public String getDocumentTypeReturnId() {
		return documentTypeReturnId;
	}
	public void setDocumentTypeReturnId(String documentTypeReturnId) {
		this.documentTypeReturnId = documentTypeReturnId;
	}
	public String getPriceList() {
		return priceList;
	}
	public void setPriceList(String priceList) {
		this.priceList = priceList;
	}
	public Date getLoaded() {
		return loaded;
	}
	public void setLoaded(Date loaded) {
		this.loaded = loaded;
	}
	public String getDocumentNo() {
		return documentNo;
	}
	public void setDocumentNo(String documentNo) {
		this.documentNo = documentNo;
	}
	public String getOrganization$_identifier() {
		return organization$_identifier;
	}
	public void setOrganization$_identifier(String organization$_identifier) {
		this.organization$_identifier = organization$_identifier;
	}
	public Boolean getIscancelled() {
		return iscancelled;
	}
	public void setIscancelled(Boolean iscancelled) {
		this.iscancelled = iscancelled;
	}
	public Boolean getIsModified() {
		return isModified;
	}
	public void setIsModified(Boolean isModified) {
		this.isModified = isModified;
	}
	public String getClient() {
		return client;
	}
	public void setClient(String client) {
		this.client = client;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public Boolean getCashVAT() {
		return cashVAT;
	}
	public void setCashVAT(Boolean cashVAT) {
		this.cashVAT = cashVAT;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	public Double getTotalNetAmount() {
		return totalNetAmount;
	}
	public void setTotalNetAmount(Double totalNetAmount) {
		this.totalNetAmount = totalNetAmount;
	}
	public String getPosTerminal() {
		return posTerminal;
	}
	public void setPosTerminal(String posTerminal) {
		this.posTerminal = posTerminal;
	}
	public Boolean getIsLayaway() {
		return isLayaway;
	}
	public void setIsLayaway(Boolean isLayaway) {
		this.isLayaway = isLayaway;
	}
	public Boolean getRtpRespsuccess() {
		return rtpRespsuccess;
	}
	public void setRtpRespsuccess(Boolean rtpRespsuccess) {
		this.rtpRespsuccess = rtpRespsuccess;
	}
	public String getBpLocId() {
		return bpLocId;
	}
	public void setBpLocId(String bpLocId) {
		this.bpLocId = bpLocId;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public String getWarehouse() {
		return warehouse;
	}
	public void setWarehouse(String warehouse) {
		this.warehouse = warehouse;
	}
	public Boolean getIsQuotation() {
		return isQuotation;
	}
	public void setIsQuotation(Boolean isQuotation) {
		this.isQuotation = isQuotation;
	}
	public Boolean getRtpResponse() {
		return rtpResponse;
	}
	public void setRtpResponse(Boolean rtpResponse) {
		this.rtpResponse = rtpResponse;
	}
	public String getInvoiceTerms() {
		return invoiceTerms;
	}
	public void setInvoiceTerms(String invoiceTerms) {
		this.invoiceTerms = invoiceTerms;
	}
	public Double getTotalamount() {
		return totalamount;
	}
	public void setTotalamount(Double totalamount) {
		this.totalamount = totalamount;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getOrganization() {
		return organization;
	}
	public void setOrganization(String organization) {
		this.organization = organization;
	}
	public String getBpBillLocId() {
		return bpBillLocId;
	}
	public void setBpBillLocId(String bpBillLocId) {
		this.bpBillLocId = bpBillLocId;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public String getBusinessPartner$_identifier() {
		return businessPartner$_identifier;
	}
	public void setBusinessPartner$_identifier(String businessPartner$_identifier) {
		this.businessPartner$_identifier = businessPartner$_identifier;
	}
	public String getTrxOrganization() {
		return trxOrganization;
	}
	public void setTrxOrganization(String trxOrganization) {
		this.trxOrganization = trxOrganization;
	}
	public Boolean getInvoiceCreated() {
		return invoiceCreated;
	}
	public void setInvoiceCreated(Boolean invoiceCreated) {
		this.invoiceCreated = invoiceCreated;
	}
	public Boolean getGenerateInvoice() {
		return generateInvoice;
	}
	public void setGenerateInvoice(Boolean generateInvoice) {
		this.generateInvoice = generateInvoice;
	}
	public List<Line> getLines() {
		return lines;
	}
	public void setLines(List<Line> lines) {
		this.lines = lines;
	}
	public List<Payment> getPayments() {
		return payments;
	}
	public void setPayments(List<Payment> payments) {
		this.payments = payments;
	}
	public List<TaxHeaderIdentifier> getTaxes() {
		return taxes;
	}
	public void setTaxes(List<TaxHeaderIdentifier> taxes) {
		this.taxes = taxes;
	}
	public List<Approval> getApprovals() {
		return approvals;
	}
	public void setApprovals(List<Approval> approvals) {
		this.approvals = approvals;
	}
	public Boolean getRecordInImportEntry() {
		return recordInImportEntry;
	}
	public void setRecordInImportEntry(Boolean recordInImportEntry) {
		this.recordInImportEntry = recordInImportEntry;
	}
	
}
