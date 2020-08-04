package fr.integrum.ob.nike.retailmodels;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name = "NK_SourcesPos")
public class SourcePos {

	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	@Column(name = "SourcePosID")
	private String sourcePosId;
	
	@Column(name = "Type")
	private String type;
	
	@Column(name = "Version")
	private String version;
	
	@Column(name = "retailTransactionId")
	private String retailTransactionId;

	public SourcePos() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getSourcePosId() {
		return sourcePosId;
	}

	public void setSourcePosId(String sourcePosId) {
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

	public String getRetailTransactionId() {
		return retailTransactionId;
	}

	public void setRetailTransactionId(String retailTransactionId) {
		this.retailTransactionId = retailTransactionId;
	}
	
	
}
