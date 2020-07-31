package fr.integrum.ob.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product_categories")
public class ProductCategory {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "product_category_id")
	private Integer productCategoryId;
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
	private String summaryLevel;
	@Column
	private Boolean active;
	@Column
	private Boolean isDefault;
	@Column
	private Boolean plannedMargin;

	@Column(name = "product_id")
	private Integer productId;

	public ProductCategory() {
		super();
	}

	public Integer getProductCategoryId() {
		return productCategoryId;
	}

	public void setProductCategoryId(Integer productCategoryId) {
		this.productCategoryId = productCategoryId;
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

	public String getSummaryLevel() {
		return summaryLevel;
	}

	public void setSummaryLevel(String summaryLevel) {
		this.summaryLevel = summaryLevel;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public Boolean getIsDefault() {
		return isDefault;
	}

	public void setIsDefault(Boolean isDefault) {
		this.isDefault = isDefault;
	}

	public Boolean getPlannedMargin() {
		return plannedMargin;
	}

	public void setPlannedMargin(Boolean plannedMargin) {
		this.plannedMargin = plannedMargin;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

}
