package com.sfsi.app.constants;

public enum ServiceErrorCode {
	
	INVALID_REQUEST("ER0091", "Invalid Request"),
	BAD_REQUEST("ER0092", "Bad Request"),
	BAD_RESPONSE("ER0093", "Bad Response"),
	UNDEFINED_TXN_CODE("ER0094","Undefined Transaction Code"),
	UNDEFINED_TXN_SUB_CODE("ER0094","Undefined Transaction Sub Code"),
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
