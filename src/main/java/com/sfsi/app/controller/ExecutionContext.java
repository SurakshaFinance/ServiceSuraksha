package com.sfsi.app.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.sfsi.app.request.Request;
import com.sfsi.app.response.Response;

@Scope(value = "singleton")
@Component("execution_context")
public class ExecutionContext {
	
	private Request servceRequest;
	private Response servceResponse;
	private Map<String, Object> dataMap = new HashMap<>();
	
	public Request getServceRequest() {
		return servceRequest;
	}
	public void setServceRequest(Request servceRequest) {
		this.servceRequest = servceRequest;
	}
	public Response getServceResponse() {
		return servceResponse;
	}
	public void setServceResponse(Response servceResponse) {
		this.servceResponse = servceResponse;
	}
	public Map<String, Object> getDataMap() {
		return dataMap;
	}
	public void setDataMap(Map<String, Object> dataMap) {
		this.dataMap = dataMap;
	}
	
}
