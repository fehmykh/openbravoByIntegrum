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
@Table(name = "ob_tax_header_identifiers")
public class TaxHeaderIdentifier {
	@Id
	@Column(name = "tax_header_identifier_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer taxHeaderIdentifierId;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "tax_header_identifier_id", referencedColumnName = "tax_header_identifier_id")
	private TaxHeader taxName;
	@Column(name = "order_id")
	private Integer orderId;

	public TaxHeaderIdentifier() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getTaxHeaderIdentifierId() {
		return taxHeaderIdentifierId;
	}

	public void setTaxHeaderIdentifierId(Integer taxHeaderIdentifierId) {
		this.taxHeaderIdentifierId = taxHeaderIdentifierId;
	}

	public TaxHeader getTaxName() {
		return taxName;
	}

	public void setTaxName(TaxHeader taxName) {
		this.taxName = taxName;
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

}
