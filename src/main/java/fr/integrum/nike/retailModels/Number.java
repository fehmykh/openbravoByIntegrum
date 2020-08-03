package fr.integrum.nike.retailModels;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "NK_Names")
public class Number {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "name_id")
	private Integer nameId;
	@Column(name = "Number")
	private String number;
}
