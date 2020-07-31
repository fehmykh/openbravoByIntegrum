package fr.integrum.ob.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "business_partners")
public class BusinessPartner {

	@Id
	@Column(name = "business_partner_id")
	private Integer businessPartnerId;
	@Column
	private String client;
	@Column
	private String organization;
	@Column
	private String searchKey;
	@Column
	private String commercialName;
	@Column
	private String fiscalName;
	@Column
	private String description;
	@Column
	private String bpCategory;
	private String taxID;
	private String language;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "business_partner_id", referencedColumnName = "business_partner_id")
	private Greetings greeting;
	private String currency;
	private String birthDay;
	private String bpTaxCategory;
	private String paymentMethod;
	private String paymentTerms;
	private String priceList;
	private String customerConsent;
	private String creditLineLimit;
	private String currentBalance;
	private String invoiceTerms;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "business_partner_id", referencedColumnName = "business_partner_id")
	private List<Location> locations;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "business_partner_id", referencedColumnName = "business_partner_id")
	private User contactInformation;

	public BusinessPartner() {
		super();
	}

}
