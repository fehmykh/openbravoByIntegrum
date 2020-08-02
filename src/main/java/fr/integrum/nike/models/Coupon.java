package fr.integrum.nike.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "NK_Coupons")
public class Coupon {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "coupon_id")
	private Integer couponId;
	@Column
	private String ScanCode;

}
