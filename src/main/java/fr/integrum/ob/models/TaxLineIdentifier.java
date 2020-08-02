package fr.integrum.ob.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tax_line_identifiers")
public class TaxLineIdentifier {
	@Id
	@Column(name = "tax_line_identifier_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer taxLineIdentifierId;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "tax_line_id", referencedColumnName = "tax_line_id")
	private TaxLine taxName;
	@Column(name = "line_id")
	private Integer lineId;

	public TaxLineIdentifier() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getTaxLineIdentifierId() {
		return taxLineIdentifierId;
	}

	public void setTaxLineIdentifierId(Integer taxLineIdentifierId) {
		this.taxLineIdentifierId = taxLineIdentifierId;
	}

	public TaxLine getTaxName() {
		return taxName;
	}

	public void setTaxName(TaxLine taxName) {
		this.taxName = taxName;
	}

	public Integer getLineId() {
		return lineId;
	}

	public void setLineId(Integer lineId) {
		this.lineId = lineId;
	}

}
