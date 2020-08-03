package fr.integrum.ob.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ob_organizations")
public class Organization {
	@Id
	@Column(name = "org_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer orgId;
	@Column
	private String name;
	@Column(name = "line_id")
	private Integer lineId;

	public Organization() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getOrgId() {
		return orgId;
	}

	public void setOrgId(Integer orgId) {
		this.orgId = orgId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getLineId() {
		return lineId;
	}

	public void setLineId(Integer lineId) {
		this.lineId = lineId;
	}

}
