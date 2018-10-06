package com.sfsi.app.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Response {

	@JsonProperty("response_header")
	private ResponseHeader responseHeader;
	
	@JsonProperty("response_body")
	private ResponseBody responseBody;
	
	@JsonProperty("result")
	private Result result;

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

	public Result getResult() {
		return result;
	}

	public void setResult(Result result) {
		this.result = result;
	}
	
}
