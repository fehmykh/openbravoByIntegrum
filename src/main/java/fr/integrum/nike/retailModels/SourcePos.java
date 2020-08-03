package fr.integrum.nike.retailModels;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "NK_SourcesPos")
public class SourcePos {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "SourcePosID")
	private Integer sourcePosId;
	
	@Column(name = "Type")
	private String type;
	
	@Column(name = "Version")
	private String version;
}
