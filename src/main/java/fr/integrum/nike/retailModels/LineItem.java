package fr.integrum.nike.retailModels;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "NK_LineItems")
public class LineItem {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "line_item_id")
	private Integer lineItemId;

	@Column(name = "EntryMethod")
	private String entryMethod;

	@Column(name = "VoidFlag")
	private Boolean voidFlag;

	@Column(name = "Coupon")
	private Coupon coupon;

	@Column(name = "SequenceNumber")
	private Integer sequenceNumber;

	@Column(name = "ScanData")
	private List<ScanData> scanData;

	@Column(name = "BeginDateTime")
	private Date beginDateTime;

	@Column(name = "EndDateTime")
	private Date endDateTime;

	@Column(name = "RepairID")
	private String repairID;

	@Column(name = "Sale")
	private List<Sale> sale;
	
	@Column(name = "SaleForPickup")
	private SaleForPickup saleForPickup;
	
	@Column(name = "StoredValueFundSale")
	private StoredValueFundSale storedValueFundSale;
	
	@Column(name = "Return")
	private List<Return> returns;

	@Column(name = "Customers")
	private List<Customer> customers;
	
	@Column(name = "Tenders")
	private List<Tender> tenders;
	
	@Column(name = "TenderChange")
	private List<TenderChange> tenderChange;
}
