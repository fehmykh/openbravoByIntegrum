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
@Table(name = "product_characteristics")
public class ProductCharacteristic {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "product_characteristic_id")
	private Integer productCharacteristicId;
	@Column
	private String name;
	@Column
	private String description;
	@Column
	private Boolean variant;
	@Column
	private Boolean explodeConfigurationTab;
	@Column
	private Boolean useOnWebPOS;
	@Column
	private Boolean filterOnWebPOS;
	@Column
	private Boolean active;

	@OneToMany(cascade = CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name = "product_characteristic_id", referencedColumnName = "product_characteristic_id")
	private List<ProductCharacteristicValue> characteristicValues;

	public ProductCharacteristic() {
		super();
	}

	public Integer getProductCharacteristicId() {
		return productCharacteristicId;
	}

	public void setProductCharacteristicId(Integer productCharacteristicId) {
		this.productCharacteristicId = productCharacteristicId;
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

	public Boolean getVariant() {
		return variant;
	}

	public void setVariant(Boolean variant) {
		this.variant = variant;
	}

	public Boolean getExplodeConfigurationTab() {
		return explodeConfigurationTab;
	}

	public void setExplodeConfigurationTab(Boolean explodeConfigurationTab) {
		this.explodeConfigurationTab = explodeConfigurationTab;
	}

	public Boolean getUseOnWebPOS() {
		return useOnWebPOS;
	}

	public void setUseOnWebPOS(Boolean useOnWebPOS) {
		this.useOnWebPOS = useOnWebPOS;
	}

	public Boolean getFilterOnWebPOS() {
		return filterOnWebPOS;
	}

	public void setFilterOnWebPOS(Boolean filterOnWebPOS) {
		this.filterOnWebPOS = filterOnWebPOS;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public List<ProductCharacteristicValue> getCharacteristicValues() {
		return characteristicValues;
	}

	public void setCharacteristicValues(List<ProductCharacteristicValue> characteristicValues) {
		this.characteristicValues = characteristicValues;
	}

}
