package fr.integrum.ob.nike.retailmodels;

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
	
	@Column(name = "retailTransactionId")
	private Integer retailTransactionId;

	public SourcePos() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getSourcePosId() {
		return sourcePosId;
	}

	public void setSourcePosId(Integer sourcePosId) {
		this.sourcePosId = sourcePosId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public Integer getRetailTransactionId() {
		return retailTransactionId;
	}

	public void setRetailTransactionId(Integer retailTransactionId) {
		this.retailTransactionId = retailTransactionId;
	}
	
	
}
