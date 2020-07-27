package fr.integrum.ob.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "products_assortment")
public class ProductsAssortment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long productsAssortmentId;
	@Column
	private String product;
	@Column
	private boolean bestseller;
	@ManyToOne
	private Assortment assortment;

	public ProductsAssortment() {
		super();
	}

	public ProductsAssortment(String product, boolean bestseller) {
		super();
		this.product = product;
		this.bestseller = bestseller;
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

}
