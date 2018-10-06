package com.sfsi.app.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RequestBody {
	
	@JsonProperty("basic_details")
	private BasicDetails basicDetails;
	
	@JsonProperty("customer_details")
	private CustomerDetails customerDetails;
	
	@JsonProperty("agent_details")
	private AgentDetails agentDetails;

	public BasicDetails getBasicDetails() {
		return basicDetails;
	}
	public void setBasicDetails(BasicDetails basicDetails) {
		this.basicDetails = basicDetails;
	}
	public CustomerDetails getCustomerDetails() {
		return customerDetails;
	}
	public void setCustomerDetails(CustomerDetails customerDetails) {
		this.customerDetails = customerDetails;
	}
	public AgentDetails getAgentDetails() {
		return agentDetails;
	}
	public void setAgentDetails(AgentDetails agentDetails) {
		this.agentDetails = agentDetails;
	}

}
