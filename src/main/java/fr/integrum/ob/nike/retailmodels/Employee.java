package fr.integrum.ob.nike.retailmodels;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "NK_Employees")
public class Employee {

	@Id
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid")
	@Column(name = "ID")
	private String id;

	@Column(name = "RetailPriceModifiersId")
	private String retailPriceModifiersId;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getEmployeeId() {
		return id;
	}

	public void setEmployeeId(String employeeId) {
		this.id = employeeId;
	}

}
