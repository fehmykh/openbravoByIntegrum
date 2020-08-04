package fr.integrum.ob.nike.retailmodels;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "NK_Quantities")
public class Quantity {

	@Id
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid")
	@Column(name = "QuantityId")
	private String quantityId;

	@Column(name = "Quantity")
	private Double quantity;

	@Column(name = "SaleId")
	private String saleId;

	@Column(name = "SaleForPickupId")
	private String saleForPickupId;

	@Column(name = "returnID")
	private String returnID;

	@Column(name = "SaleForDeliveryId")
	private String saleForDeliveryId;

	@Column(name = "StoredValueFundSaleId")
	private String storedValueFundSaleId;

	public Quantity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Double getQuantity() {
		return quantity;
	}

	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}

}
