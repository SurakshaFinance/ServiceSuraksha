package com.sfsi.app.request;

public class BasicDetails {
	
	private String amount;
	private String requestReferenceNumber;
	private String transactionCode;
	private String transactionSubCode;
	
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getRequestReferenceNumber() {
		return requestReferenceNumber;
	}
	public void setRequestReferenceNumber(String requestReferenceNumber) {
		this.requestReferenceNumber = requestReferenceNumber;
	}
	public String getTransactionCode() {
		return transactionCode;
	}
	public void setTransactionCode(String transactionCode) {
		this.transactionCode = transactionCode;
	}
	public String getTransactionSubCode() {
		return transactionSubCode;
	}
	public void setTransactionSubCode(String transactionSubCode) {
		this.transactionSubCode = transactionSubCode;
	}

}
