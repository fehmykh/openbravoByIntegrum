package fr.integrum.nike.retailModels;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "NK_Returns")
public class Return {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "returnID")
	private Integer returnId;
	
	@Column(name = "Associates")
	private List<Associate> associates;
	
	@Column(name = "SerialNumbers")
	private List<SerialNumber> serialNumbers;
	
	@Column(name = "ItemType")
	private ItemType itemType;
	
	@Column(name = "Item")
	private Item item;
	
	@Column(name = "Type")
	private String type;
	
	@Column(name = "Descriptions")
	private List<Description> descriptions;
	
	@Column(name = "RegularSalesUnitPrice")
	private Amount regularSalesUnitPrice;

	@Column(name = "ActualSalesUnitPrice")
	private Amount actualSalesUnitPrice;
	
	@Column(name = "ExtendedAmount")
	private Amount extendedAmount;
	
	@Column(name = "Quantity")
	private Quantity quantity;
	
	@Column(name = "Taxes")
	private List<Taxe> taxes;
	
	@Column(name = "RetailPriceModifiers")
	private List<RetailPriceModifier> retailPriceModifiers;
	
	
	@Column(name = "eCommerceID")
	private String eCommerceID;
	
	@Column(name = "TransactionLink")
	private TransactionLink transactionLink;
	
}
