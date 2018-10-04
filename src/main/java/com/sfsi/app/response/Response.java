package com.sfsi.app.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Response {

	@JsonProperty("response_header")
	private ResponseHeader responseHeader;
	
	@JsonProperty("response_body")
	private ResponseBody responseBody;

	public ResponseHeader getResponseHeader() {
		return responseHeader;
	}

	public void setResponseHeader(ResponseHeader responseHeader) {
		this.responseHeader = responseHeader;
	}

	public ResponseBody getResponseBody() {
		return responseBody;
	}

	public void setResponseBody(ResponseBody responseBody) {
		this.responseBody = responseBody;
	}
	
}
