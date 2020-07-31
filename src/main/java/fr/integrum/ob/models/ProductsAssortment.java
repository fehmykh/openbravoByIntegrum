package fr.integrum.ob.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "product_assortment")
public class ProductsAssortment {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "prod_assortment_id")
	private Integer prodAssortmentId;
	@Column
	private String product;
	@Column
	private boolean bestseller;
	
	@Column(name="assortment_id")
	private Integer assortmentId;

	public ProductsAssortment() {
		super();
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public boolean isBestseller() {
		return bestseller;
	}

	public void setBestseller(boolean bestseller) {
		this.bestseller = bestseller;
	}

	public Integer getAssortmentId() {
		return assortmentId;
	}

	public void setAssortment(Integer assortmentId) {
		this.assortmentId = assortmentId;
	}

	public ProductsAssortment(String product, boolean bestseller) {
		super();
		this.product = product;
		this.bestseller = bestseller;
	}

}
