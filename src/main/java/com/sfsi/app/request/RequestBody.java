package com.sfsi.app.request;

import java.util.Map;

public class RequestBody {
	
	private BasicDetails basicDetails;
	private CustomerDetails customerDetails;
	private AgentDetails agentDetails;
	private Map<String, String> requestSpecificDetails;
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
	public Map<String, String> getRequestSpecificDetails() {
		return requestSpecificDetails;
	}
	public void setRequestSpecificDetails(Map<String, String> requestSpecificDetails) {
		this.requestSpecificDetails = requestSpecificDetails;
	}

}
