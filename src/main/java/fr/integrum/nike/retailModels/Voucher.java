package fr.integrum.nike.retailModels;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "NK_Vouchers")
public class Voucher {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "VoucherID")
	private Integer voucherId;

	@Column(name = "TypeCode")
	private String typeCode;

	@Column(name = "SerialNumber")
	private String serialNumber;

	@Column(name = "ExpirationDate")
	private Date expirationDate;

	@Column(name = "Descriptions")
	private Description descriptions;

	@Column(name = "FaceValueAmount")
	private Amount faceValueAmount;

}
