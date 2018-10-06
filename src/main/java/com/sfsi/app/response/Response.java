package com.sfsi.app.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Response {

	@JsonProperty("response_header")
	private ResponseHeader responseHeader;
	
	@JsonProperty("response_body")
	private ResponseBody responseBody;
	
	@JsonProperty("error")
	private Error error;

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

	public Error getError() {
		return error;
	}

	public void setError(Error error) {
		this.error = error;
	}
	
}
