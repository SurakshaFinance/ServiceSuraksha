package com.sfsi.app.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CustomerDetails {
	
	@JsonProperty("customer_id_type")
	private String customerIdType;
	
	@JsonProperty("customer_id_value")
	private String customerIdValue;
	
	@JsonProperty("product_code")
	private String productCode;
	
	@JsonProperty("customer_check_code")
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
