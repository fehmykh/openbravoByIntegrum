package fr.integrum.nike.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "NK_Reasons")
public class Reason {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "reason_id")
	private Integer reasonId;
	@Column(name = "Code")
	private String code;
	@Column(name = "Description")
	private String description;

	@Column(name = "Name")
	private String name;

}
