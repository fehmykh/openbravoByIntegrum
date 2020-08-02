package fr.integrum.nike.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "NK_Taxes")
public class Taxe {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "taxe_id")
	private Integer taxeId;
	@Column
	private String TaxeType;
	@Column
	private Amount TaxableAmount;
	@Column
	private Amount amount;
	@Column
	private Float percent;
	@Column
	private String taxGroupId;
	@Column
	private String taxJurisdictionId;

}
