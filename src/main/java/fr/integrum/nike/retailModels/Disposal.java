package fr.integrum.nike.retailModels;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "NK_Disposals")
public class Disposal {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "disposal_id")
	private Integer disposalId;
	@Column(name="Method")
	private String method;
}
