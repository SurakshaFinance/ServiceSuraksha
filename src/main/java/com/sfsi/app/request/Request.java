package com.sfsi.app.request;

import com.fasterxml.jackson.annotation.JsonProperty;


public class Request {
	
	@JsonProperty("request_header")
	private RequestHeader requestHeader;
	
	@JsonProperty("request_body")
	private RequestBody requestBody;

}
