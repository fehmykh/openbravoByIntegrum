package fr.integrum.ob.nike.retailmodels;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "NK_StoreAccounts")
public class StoreAccount {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "AccountID")
	private Integer accountID;

	@Column(name = "AccountName")
	private String accountName;

	@Column(name = "TenderID")
	private Integer tenderID;

	public StoreAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getAccountID() {
		return accountID;
	}

	public void setAccountID(Integer accountID) {
		this.accountID = accountID;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public Integer getTenderID() {
		return tenderID;
	}

	public void setTenderID(Integer tenderID) {
		this.tenderID = tenderID;
	}
	
}
