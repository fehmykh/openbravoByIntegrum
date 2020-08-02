package fr.integrum.nike.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "NK_retail_price_modifiers")
public class RetailPriceModifiers {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "retail_price_modifiers_id")
	private Integer retailPriceModifiersId;
	
	@Column(name="VoidFlag")
	private Boolean voidFlag; 
	@Column(name="MethodCode")
	 private String methodCode;
	@Column(name="SequenceNumber")
	 private Integer sequenceNumber; 
	@Column(name="Amount")
	 private Amount amount; 
	@Column(name="PromotionID")
	 private String promotionID;
	@Column(name="Coupon")
	 private Coupon Coupon;

	@Column(name="PreviousPrice")
	 private Amount previousPrice; 
	 
	@Column(name="NewPrice")
	 private Amount newPrice; 
	@Column(name="Reason")
	 private Reason reason; 

	@Column(name="Descriptions")
	 private List<Description> descriptions;
	                                                    
	@Column(name="Employee")
	 private Employee employee; 
}
