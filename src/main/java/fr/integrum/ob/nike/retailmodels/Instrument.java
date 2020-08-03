package fr.integrum.ob.nike.retailmodels;

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
@Table(name = "NK_Instruments")
public class Instrument {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "InstrumentId")
	private Integer instrumentId;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "FaceValueAmount", referencedColumnName = "InstrumentId")
	private Amount faceValueAmount;
	
	@Column(name="SerialNumber")
	private String serialNumber;
	
	@Column(name = "StoredValueFundSaleId")
	private Integer storedValueFundSaleId;
	
	public Integer getStoredValueFundSaleId() {
		return storedValueFundSaleId;
	}

	public void setStoredValueFundSaleId(Integer storedValueFundSaleId) {
		this.storedValueFundSaleId = storedValueFundSaleId;
	}

	public Instrument() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getInstrumentId() {
		return instrumentId;
	}

	public void setInstrumentId(Integer instrumentId) {
		this.instrumentId = instrumentId;
	}

	public Amount getFaceValueAmount() {
		return faceValueAmount;
	}

	public void setFaceValueAmount(Amount faceValueAmount) {
		this.faceValueAmount = faceValueAmount;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	
	
}
