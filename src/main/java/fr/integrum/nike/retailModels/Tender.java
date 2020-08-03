package fr.integrum.nike.retailModels;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "NK_Tenders")
public class Tender {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "TenderID")
	private Integer tenderId;

	@Column(name = "TenderType")
	private String tenderType;

	@Column(name = "TypeCode")
	private String typeCode;

	@Column(name = "SubTenderType")
	private String subTenderType;
	
	@Column(name = "CreditDebit")
	private CreditDebit creditDebit;
	
	@Column(name = "Amount")
	private Amount amount;
	
	@Column(name = "Voucher")
	private Voucher voucher;

	@Column(name = "ComplimentaryTender")
	private ComplimentaryTender complimentaryTender;
	
	@Column(name = "StoreAccount")
	private StoreAccount storeAccount;
}
