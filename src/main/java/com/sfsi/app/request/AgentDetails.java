package com.sfsi.app.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AgentDetails {
	
	@JsonProperty("agent_id_type")
	private String agentIdType;
	
	@JsonProperty("agent_id_value")
	private String agentIdValue;
	
	@JsonProperty("product_code")
	private String productCode;
	
	public String getAgentIdType() {
		return agentIdType;
	}
	public void setAgentIdType(String agentIdType) {
		this.agentIdType = agentIdType;
	}
	public String getAgentIdValue() {
		return agentIdValue;
	}
	public void setAgentIdValue(String agentIdValue) {
		this.agentIdValue = agentIdValue;
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	
}
