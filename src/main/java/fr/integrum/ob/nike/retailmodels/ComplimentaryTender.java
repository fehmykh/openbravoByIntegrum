package fr.integrum.ob.nike.retailmodels;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "NK_ComplimentaryTenders")
public class ComplimentaryTender {

	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	@Column(name = "ComplimentaryTenderID")
	private String complimentaryTenderId;

	@Column(name = "Account")
	private String account;

	@Column(name = "Purchaser")
	private String purchaser;

	@Column(name = "RequestedBy")
	private String requestedBy;

	@Column(name = "Department")
	private String department;

	@Column(name = "Reason")
	private String Reason;

	@Column(name = "EmployeeID")
	private String employeeID;
	
	@Column(name = "TenderID")
	private String tenderID;
	
	public ComplimentaryTender() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getComplimentaryTenderId() {
		return complimentaryTenderId;
	}

	public void setComplimentaryTenderId(String complimentaryTenderId) {
		this.complimentaryTenderId = complimentaryTenderId;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPurchaser() {
		return purchaser;
	}

	public void setPurchaser(String purchaser) {
		this.purchaser = purchaser;
	}

	public String getRequestedBy() {
		return requestedBy;
	}

	public void setRequestedBy(String requestedBy) {
		this.requestedBy = requestedBy;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getReason() {
		return Reason;
	}

	public void setReason(String reason) {
		Reason = reason;
	}

	public String getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}

	public String getTenderID() {
		return tenderID;
	}

	public void setTenderID(String tenderID) {
		this.tenderID = tenderID;
	}

}
