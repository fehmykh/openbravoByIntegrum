package fr.integrum.nike.retailModels;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "NK_TenderChanges")
public class TenderChange {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "TenderChangeID")
	private Integer tenderChangeId;

	@Column(name = "TenderType")
	private String tenderType;

	@Column(name = "TypeCode")
	private String typeCode;

	@Column(name = "Amount")
	private Amount amount;

	@Column(name = "Voucher")
	private Voucher voucher;

}
