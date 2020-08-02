package fr.integrum.nike.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "NK_Descriptions")
public class Description {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "description_id")
	private Integer descriptionId;
	@Column(name="Text")
	private String text;
	

}
