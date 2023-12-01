package model;

public class Payment_details {
	private int paymentdetailsId;
	private int customerId;
	private String cardnumber;
	private String cardtype;
	private String expirydate;
	private String cardholdername;
	private String upiId;
	
	public int getPaymentdetailsId() {
		return paymentdetailsId;
	}
	public void setPaymentdetailsId(int paymentdetailsId) {
		this.paymentdetailsId = paymentdetailsId;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCardnumber() {
		return cardnumber;
	}
	public void setCardnumber(String cardnumber) {
		this.cardnumber = cardnumber;
	}
	public String getCardtype() {
		return cardtype;
	}
	public void setCardtype(String cardtype) {
		this.cardtype = cardtype;
	}
	public String getExpirydate() {
		return expirydate;
	}
	public void setExpirydate(String expirydate) {
		this.expirydate = expirydate;
	}
	public String getCardholdername() {
		return cardholdername;
	}
	public void setCardholdername(String cardholdername) {
		this.cardholdername = cardholdername;
	}
	public String getUpiId() {
		return upiId;
	}
	public void setUpiId(String upiId) {
		this.upiId = upiId;
	}
}
