package fr.integrum.ob.models;

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

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "assortment")
public class Assortment {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "assortment_id")
	private Integer assortmentId;
	@Column
	private String client;
	@Column
	private String organization;
	@Column
	private String name;
	@Column
	private String description;
	@Column
	private Boolean active;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "assortment_id", referencedColumnName = "assortment_id")
	private List<ProductsAssortment> products;

	public Assortment() {
		super();
	}

	public Assortment(String client, String organization, String name, String description, Boolean active) {
		super();
		this.client = client;
		this.organization = organization;
		this.name = name;
		this.description = description;
		this.active = active;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public List<ProductsAssortment> getProducts() {
		return products;
	}

	public void setProducts(List<ProductsAssortment> products) {
		this.products = products;
	}

}
