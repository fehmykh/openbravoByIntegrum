package fr.integrum.ob.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product_characteristic_values")
public class ProductCharacteristicValue {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="product_characteristic_value_id")
	private Integer productCharacteristicValueId;
	@Column
	private String name;
	@Column
	private String code;
	@Column
	private String summaryLevel;
	@Column
	private String description;
	@Column
	private Boolean active;
	@Column(name="product_characteristic_id")
	private Integer productCharacteristicId;
	public ProductCharacteristicValue() {
		super();
	}
	public Integer getProductCharacteristicValueId() {
		return productCharacteristicValueId;
	}
	public void setProductCharacteristicValueId(Integer productCharacteristicValueId) {
		this.productCharacteristicValueId = productCharacteristicValueId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getSummaryLevel() {
		return summaryLevel;
	}
	public void setSummaryLevel(String summaryLevel) {
		this.summaryLevel = summaryLevel;
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
	public Integer getProductCharacteristicId() {
		return productCharacteristicId;
	}
	public void setProductCharacteristicId(Integer productCharacteristicId) {
		this.productCharacteristicId = productCharacteristicId;
	}
	

}
