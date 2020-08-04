package fr.integrum.ob.nike.retailmodels;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "NK_RetailPriceModifiers")
public class RetailPriceModifier {

	@Id
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid")
	@Column(name = "RetailPriceModifiersId")
	private String retailPriceModifiersId;

	@Column(name = "VoidFlag")
	private Boolean voidFlag;

	@Column(name = "MethodCode")
	private String methodCode;

	@Column(name = "SequenceNumber")
	private Integer sequenceNumber;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Amount", referencedColumnName = "RetailPriceModifiersId")
	private Amount amount;

	@Column(name = "PromotionID")
	private String promotionID;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Coupon", referencedColumnName = "RetailPriceModifiersId")
	private Coupon Coupon;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "PreviousPrice", referencedColumnName = "RetailPriceModifiersId")
	private Amount previousPrice;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "NewPrice", referencedColumnName = "RetailPriceModifiersId")
	private Amount newPrice;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Reason", referencedColumnName = "RetailPriceModifiersId")
	private Reason reason;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "RetailPriceModifiersId", referencedColumnName = "RetailPriceModifiersId")
	private List<Description> descriptions;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Employee", referencedColumnName = "RetailPriceModifiersId")
	private Employee employee;

	@Column(name = "SaleId")
	private String saleId;

	@Column(name = "SaleForPickupId")
	private String saleForPickupId;

	@Column(name = "returnID")
	private String returnID;

	@Column(name = "SaleForDeliveryId")
	private String saleForDeliveryId;

	public RetailPriceModifier() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Boolean getVoidFlag() {
		return voidFlag;
	}

	public void setVoidFlag(Boolean voidFlag) {
		this.voidFlag = voidFlag;
	}

	public String getMethodCode() {
		return methodCode;
	}

	public void setMethodCode(String methodCode) {
		this.methodCode = methodCode;
	}

	public Integer getSequenceNumber() {
		return sequenceNumber;
	}

	public void setSequenceNumber(Integer sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
	}

	public Amount getAmount() {
		return amount;
	}

	public void setAmount(Amount amount) {
		this.amount = amount;
	}

	public String getPromotionID() {
		return promotionID;
	}

	public void setPromotionID(String promotionID) {
		this.promotionID = promotionID;
	}

	public Coupon getCoupon() {
		return Coupon;
	}

	public void setCoupon(Coupon coupon) {
		Coupon = coupon;
	}

	public Amount getPreviousPrice() {
		return previousPrice;
	}

	public void setPreviousPrice(Amount previousPrice) {
		this.previousPrice = previousPrice;
	}

	public Amount getNewPrice() {
		return newPrice;
	}

	public void setNewPrice(Amount newPrice) {
		this.newPrice = newPrice;
	}

	public Reason getReason() {
		return reason;
	}

	public void setReason(Reason reason) {
		this.reason = reason;
	}

	public List<Description> getDescriptions() {
		return descriptions;
	}

	public void setDescriptions(List<Description> descriptions) {
		this.descriptions = descriptions;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

}
