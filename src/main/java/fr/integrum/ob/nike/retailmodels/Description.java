package fr.integrum.ob.nike.retailmodels;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "NK_Descriptions")
public class Description {

	@Id
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid")
	@Column(name = "description_id")
	private String descriptionId;

	@Column(name = "Text")
	private String text;

	@Column(name = "SaleId")
	private String saleId;

	@Column(name = "RetailPriceModifiersId")
	private String retailPriceModifiersId;

	@Column(name = "SaleForPickupId")
	private String saleForPickupId;

	@Column(name = "returnID")
	private String returnID;

	@Column(name = "SaleForDeliveryId")
	private String saleForDeliveryId;

	@Column(name = "StoredValueFundSaleId")
	private String storedValueFundSaleId;

	@Column(name = "VoucherID")
	private String voucherID;

	public Description() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}
