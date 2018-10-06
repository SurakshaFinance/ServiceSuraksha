package com.sfsi.app.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BasicDetails {
	
	@JsonProperty("amount")
	private String amount;
	
	@JsonProperty("request_reference_number")
	private String requestReferenceNumber;
	
	@JsonProperty("transaction_code")
	private String transactionCode;
	
	@JsonProperty("transaction_sub_code")
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
