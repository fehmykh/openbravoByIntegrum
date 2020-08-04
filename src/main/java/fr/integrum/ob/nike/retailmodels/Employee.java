package fr.integrum.ob.nike.retailmodels;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "NK_Employees")
public class Employee {

	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	@Column(name = "ID")
	private String employeeId;

	@Column(name = "RetailPriceModifiersId")
	private String retailPriceModifiersId;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getRetailPriceModifiersId() {
		return retailPriceModifiersId;
	}

	public void setRetailPriceModifiersId(String retailPriceModifiersId) {
		this.retailPriceModifiersId = retailPriceModifiersId;
	}

}
