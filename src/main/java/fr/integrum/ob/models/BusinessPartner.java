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
@Table(name = "ob_business_partners")
public class BusinessPartner {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "business_partner_id")
	private Integer businessPartnerId;
	@Column
	private String client;
	@Column
	private String organization;
	@Column
	private String searchKey;
	@Column
	private String commercialName;
	@Column
	private String fiscalName;
	@Column
	private String description;
	@Column
	private String bpCategory;
	private String taxID;
	private String language;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "business_partner_id", referencedColumnName = "business_partner_id")
	private Greetings greeting;
	private String currency;
	private String birthDay;
	private String bpTaxCategory;
	private String paymentMethod;
	private String paymentTerms;
	private String priceList;
	private String customerConsent;
	private String creditLineLimit;
	private String currentBalance;
	private String invoiceTerms;
	@OneToMany(cascade = CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name = "business_partner_id", referencedColumnName = "business_partner_id")
	private List<UserLocation> locations;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "business_partner_id", referencedColumnName = "business_partner_id")
	private User contactInformation;

	public BusinessPartner() {
		super();
	}

	public Integer getBusinessPartnerId() {
		return businessPartnerId;
	}

	public void setBusinessPartnerId(Integer businessPartnerId) {
		this.businessPartnerId = businessPartnerId;
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

	public String getCommercialName() {
		return commercialName;
	}

	public void setCommercialName(String commercialName) {
		this.commercialName = commercialName;
	}

	public String getFiscalName() {
		return fiscalName;
	}

	public void setFiscalName(String fiscalName) {
		this.fiscalName = fiscalName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getBpCategory() {
		return bpCategory;
	}

	public void setBpCategory(String bpCategory) {
		this.bpCategory = bpCategory;
	}

	public String getTaxID() {
		return taxID;
	}

	public void setTaxID(String taxID) {
		this.taxID = taxID;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public Greetings getGreeting() {
		return greeting;
	}

	public void setGreeting(Greetings greeting) {
		this.greeting = greeting;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}

	public String getBpTaxCategory() {
		return bpTaxCategory;
	}

	public void setBpTaxCategory(String bpTaxCategory) {
		this.bpTaxCategory = bpTaxCategory;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public String getPaymentTerms() {
		return paymentTerms;
	}

	public void setPaymentTerms(String paymentTerms) {
		this.paymentTerms = paymentTerms;
	}

	public String getPriceList() {
		return priceList;
	}

	public void setPriceList(String priceList) {
		this.priceList = priceList;
	}

	public String getCustomerConsent() {
		return customerConsent;
	}

	public void setCustomerConsent(String customerConsent) {
		this.customerConsent = customerConsent;
	}

	public String getCreditLineLimit() {
		return creditLineLimit;
	}

	public void setCreditLineLimit(String creditLineLimit) {
		this.creditLineLimit = creditLineLimit;
	}

	public String getCurrentBalance() {
		return currentBalance;
	}

	public void setCurrentBalance(String currentBalance) {
		this.currentBalance = currentBalance;
	}

	public String getInvoiceTerms() {
		return invoiceTerms;
	}

	public void setInvoiceTerms(String invoiceTerms) {
		this.invoiceTerms = invoiceTerms;
	}

	public List<UserLocation> getLocations() {
		return locations;
	}

	public void setLocations(List<UserLocation> locations) {
		this.locations = locations;
	}

	public User getContactInformation() {
		return contactInformation;
	}

	public void setContactInformation(User contactInformation) {
		this.contactInformation = contactInformation;
	}

}
