package com.sfsi.app.request;

public class CustomerDetails {
	
	private String customerIdType;
	private String customerIdValue;
	private String productCode;
	private String custometCheckCode;
	
	public String getCustomerIdType() {
		return customerIdType;
	}
	public void setCustomerIdType(String customerIdType) {
		this.customerIdType = customerIdType;
	}
	public String getCustomerIdValue() {
		return customerIdValue;
	}
	public void setCustomerIdValue(String customerIdValue) {
		this.customerIdValue = customerIdValue;
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getCustometCheckCode() {
		return custometCheckCode;
	}
	public void setCustometCheckCode(String custometCheckCode) {
		this.custometCheckCode = custometCheckCode;
	}

}
