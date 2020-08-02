package fr.integrum.ob.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "shipment_lines")
public class ShipmentLine {
	@Id
	@Column(name = "shipment_line_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer shipmentLineId;
	@Column
	private Double shipmentlineNo;
	@Column
	private String shipment;
	@Column
	private Double remainingQty;
	@Column
	private Double qty;
	@Column(name = "line_id")
	private Integer lineId;

	public ShipmentLine() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getShipmentLineId() {
		return shipmentLineId;
	}

	public void setShipmentLineId(Integer shipmentLineId) {
		this.shipmentLineId = shipmentLineId;
	}

	public Double getShipmentlineNo() {
		return shipmentlineNo;
	}

	public void setShipmentlineNo(Double shipmentlineNo) {
		this.shipmentlineNo = shipmentlineNo;
	}

	public String getShipment() {
		return shipment;
	}

	public void setShipment(String shipment) {
		this.shipment = shipment;
	}

	public Double getRemainingQty() {
		return remainingQty;
	}

	public void setRemainingQty(Double remainingQty) {
		this.remainingQty = remainingQty;
	}

	public Double getQty() {
		return qty;
	}

	public void setQty(Double qty) {
		this.qty = qty;
	}

	public Integer getLineId() {
		return lineId;
	}

	public void setLineId(Integer lineId) {
		this.lineId = lineId;
	}

}
