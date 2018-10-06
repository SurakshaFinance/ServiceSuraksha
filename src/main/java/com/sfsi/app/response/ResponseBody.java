package com.sfsi.app.response;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sfsi.app.request.AgentDetails;
import com.sfsi.app.request.BasicDetails;
import com.sfsi.app.request.CustomerDetails;

public class ResponseBody {
	
	@JsonProperty("basic_details")
	private BasicDetails basicDetails;
	
	@JsonProperty("customer_details")
	private CustomerDetails customerDetails;
	
	@JsonProperty("agent_details")
	private AgentDetails agentDetails;
	
	@JsonProperty("response_specific_details")
	private Map<String, String> responseSpecificDetails;
	
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
	public Map<String, String> getResponseSpecificDetails() {
		return responseSpecificDetails;
	}
	public void setResponseSpecificDetails(Map<String, String> responseSpecificDetails) {
		this.responseSpecificDetails = responseSpecificDetails;
	}

}
