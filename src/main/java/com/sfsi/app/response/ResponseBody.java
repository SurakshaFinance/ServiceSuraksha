package com.sfsi.app.response;

import java.util.Map;

import com.sfsi.app.request.AgentDetails;
import com.sfsi.app.request.BasicDetails;
import com.sfsi.app.request.CustomerDetails;

public class ResponseBody {
	
	private BasicDetails basicDetails;
	private CustomerDetails customerDetails;
	private AgentDetails agentDetails;
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
