package fr.integrum.nike.retailModels;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "NK_Sales")
public class Instrument {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "instrument_id")
	private Integer instrumentId;
	@Column(name="FaceValueAmount")
	private Amount faceValueAmount;
	@Column(name="SerialNumber")
	private String serialNumber;
}
