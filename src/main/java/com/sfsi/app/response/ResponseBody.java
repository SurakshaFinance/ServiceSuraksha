package com.sfsi.app.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseBody {
	
	@JsonProperty("response_header")
	private ResponseHeader responseHeader;
	
	@JsonProperty("response_body")
	private ResponseBody responseBody;

}
