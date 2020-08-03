package fr.integrum.nike.retailModels;

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

}
