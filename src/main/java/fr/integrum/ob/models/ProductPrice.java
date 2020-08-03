package fr.integrum.ob.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ob_product_prices")
public class ProductPrice {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "product_price_id")
	private Integer productPriceId;
	@Column
	private String product;
	@Column
	private Double unitPrice;
	@Column
	private String listPrice;
	@Column
	private Double priceLimit;
	@Column
	private Double cost;
	@Column(name = "price_list_version_id")
	private Integer priceListVersionId;

	public ProductPrice() {
		super();
	}

	public Integer getProductPriceId() {
		return productPriceId;
	}

	public void setProductPriceId(Integer productPriceId) {
		this.productPriceId = productPriceId;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public Double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getListPrice() {
		return listPrice;
	}

	public void setListPrice(String listPrice) {
		this.listPrice = listPrice;
	}

	public Double getPriceLimit() {
		return priceLimit;
	}

	public void setPriceLimit(Double priceLimit) {
		this.priceLimit = priceLimit;
	}

	public Double getCost() {
		return cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}

	public Integer getPriceListVersionId() {
		return priceListVersionId;
	}

	public void setPriceListVersionId(Integer priceListVersionId) {
		this.priceListVersionId = priceListVersionId;
	}

}
