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
import javax.persistence.Table;

@Entity
@Table(name = "ob_price_lists")
public class PriceList {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "price_list_id")
	private Integer priceListId;
	@Column
	private String client;
	@Column
	private String organization;
	@Column
	private String name;
	@Column
	private String currency;
	@Column
	private Boolean active;
	@Column
	private String enforcePriceLimit;
	@Column
	private String taxIncluded;
	@Column
	private boolean isDefault;
	@Column
	private String salesPriceList;
	@Column
	private String costBased;
	@Column
	private String description;
	@Column
	private String basePricelist;
	@OneToMany(cascade = CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name = "price_list_id", referencedColumnName = "price_list_id")
	private List<PriceListVersion> priceListVersions;
	public PriceList() {
		super();
	}
	public Integer getPriceListId() {
		return priceListId;
	}
	public void setPriceListId(Integer priceListId) {
		this.priceListId = priceListId;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public Boolean getActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}
	public String getEnforcePriceLimit() {
		return enforcePriceLimit;
	}
	public void setEnforcePriceLimit(String enforcePriceLimit) {
		this.enforcePriceLimit = enforcePriceLimit;
	}
	public String getTaxIncluded() {
		return taxIncluded;
	}
	public void setTaxIncluded(String taxIncluded) {
		this.taxIncluded = taxIncluded;
	}
	public boolean isDefault() {
		return isDefault;
	}
	public void setDefault(boolean isDefault) {
		this.isDefault = isDefault;
	}
	public String getSalesPriceList() {
		return salesPriceList;
	}
	public void setSalesPriceList(String salesPriceList) {
		this.salesPriceList = salesPriceList;
	}
	public String getCostBased() {
		return costBased;
	}
	public void setCostBased(String costBased) {
		this.costBased = costBased;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getBasePricelist() {
		return basePricelist;
	}
	public void setBasePricelist(String basePricelist) {
		this.basePricelist = basePricelist;
	}
	public List<PriceListVersion> getPriceListVersions() {
		return priceListVersions;
	}
	public void setPriceListVersions(List<PriceListVersion> priceListVersions) {
		this.priceListVersions = priceListVersions;
	}

	

}
