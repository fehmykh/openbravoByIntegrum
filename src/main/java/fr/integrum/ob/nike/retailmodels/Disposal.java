package fr.integrum.ob.nike.retailmodels;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "NK_Disposals")
public class Disposal {

	@Id
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid")
	@Column(name = "disposal_id")
	private String disposalId;

	@Column(name = "Method")
	private String method;

	@Column(name = "TransactionLinkId")
	private String transactionLinkId;

	public Disposal() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

}
