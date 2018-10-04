package com.sfsi.app.constants;

public enum ServiceErrorCode {
	
	INVALID_REQUEST("ER0091", "Invalid Request"),
	BAD_REQUEST("ER0092", "Bad Request"),
	SUCCESS("00", "SUCCESS");
	
	private String code;
	private String message;
	
	private ServiceErrorCode(String code, String message){
		this.code = code;
		this.message = message;
	}

	public String getCode() {
		return code;
	}

	public String getMessage() {
		return message;
	}

}
