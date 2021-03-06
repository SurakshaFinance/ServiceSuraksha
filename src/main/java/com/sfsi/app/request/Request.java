package com.sfsi.app.request;

import com.fasterxml.jackson.annotation.JsonProperty;


public class Request {
	
	@JsonProperty("request_header")
	private RequestHeader requestHeader;
	
	@JsonProperty("request_body")
	private RequestBody requestBody;

	public RequestHeader getRequestHeader() {
		return requestHeader;
	}

	public void setRequestHeader(RequestHeader requestHeader) {
		this.requestHeader = requestHeader;
	}

	public RequestBody getRequestBody() {
		return requestBody;
	}

	public void setRequestBody(RequestBody requestBody) {
		this.requestBody = requestBody;
	}

}
