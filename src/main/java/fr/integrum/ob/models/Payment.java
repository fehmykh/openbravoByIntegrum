package fr.integrum.ob.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ob_payments")
public class Payment {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "payment_id")
	private Integer paymentId;
	@Column
	private Double amount;
	@Column
	private Double paidAmount;
	@Column
	private Date paymentDate;
	@Column
	private String name;
	@Column
	private String kind;
	@Column
	private String rate;
	@Column
	private String mulrate;
	@Column
	private Boolean openDrawer;
	@Column
	private Boolean isPrePayment;
	@Column
	private String oBPOSPOSTerminal;
	@Column
	private String oBPOSPOSTerminalSearchKey;
	@Column(name = "order_id")
	private Integer orderId;

	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(Integer paymentId) {
		this.paymentId = paymentId;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Double getPaidAmount() {
		return paidAmount;
	}

	public void setPaidAmount(Double paidAmount) {
		this.paidAmount = paidAmount;
	}

	public Date getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getRate() {
		return rate;
	}

	public void setRate(String rate) {
		this.rate = rate;
	}

	public String getMulrate() {
		return mulrate;
	}

	public void setMulrate(String mulrate) {
		this.mulrate = mulrate;
	}

	public Boolean getOpenDrawer() {
		return openDrawer;
	}

	public void setOpenDrawer(Boolean openDrawer) {
		this.openDrawer = openDrawer;
	}

	public Boolean getIsPrePayment() {
		return isPrePayment;
	}

	public void setIsPrePayment(Boolean isPrePayment) {
		this.isPrePayment = isPrePayment;
	}

	public String getoBPOSPOSTerminal() {
		return oBPOSPOSTerminal;
	}

	public void setoBPOSPOSTerminal(String oBPOSPOSTerminal) {
		this.oBPOSPOSTerminal = oBPOSPOSTerminal;
	}

	public String getoBPOSPOSTerminalSearchKey() {
		return oBPOSPOSTerminalSearchKey;
	}

	public void setoBPOSPOSTerminalSearchKey(String oBPOSPOSTerminalSearchKey) {
		this.oBPOSPOSTerminalSearchKey = oBPOSPOSTerminalSearchKey;
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

}
