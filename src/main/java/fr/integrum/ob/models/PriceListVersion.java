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
@Table(name = "ob_price_list_versions")
public class PriceListVersion {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "price_list_version_id")
	private Integer priceListVersionId;
	@Column
	private String name;
	@Column
	private String validFromDate;
	@Column(name = "price_list_id")
	private Integer priceListId;
	@OneToMany(cascade = CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name = "price_list_version_id", referencedColumnName = "price_list_version_id")
	private List<ProductPrice> productPrices;
	public PriceListVersion() {
		super();
	}

	public Integer getPriceListVersionId() {
		return priceListVersionId;
	}

	public void setPriceListVersionId(Integer priceListVersionId) {
		this.priceListVersionId = priceListVersionId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValidFromDate() {
		return validFromDate;
	}

	public void setValidFromDate(String validFromDate) {
		this.validFromDate = validFromDate;
	}

	public Integer getPriceListId() {
		return priceListId;
	}

	public void setPriceListId(Integer priceListId) {
		this.priceListId = priceListId;
	}

	public List<ProductPrice> getProductPrices() {
		return productPrices;
	}

	public void setProductPrices(List<ProductPrice> productPrices) {
		this.productPrices = productPrices;
	}
	

}
