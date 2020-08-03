package fr.integrum.nike.retailModels;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "NK_Totals")
public class Total {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "TotalID")
	private Integer totalId;
	
	@Column(name = "Amount")
	private Double amount;
	
	@Column(name = "TotalType")
	private String totalType;
}
