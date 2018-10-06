package com.sfsi.app.exception;

import com.sfsi.app.constants.ServiceResult;

public class ServiceNonFatelException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	
	private String errorCode;
	private String errorMessage;
	
	public ServiceNonFatelException(ServiceResult errorCode){
		this.errorCode = errorCode.getCode();
		this.errorMessage = errorCode.getMessage();
	}
	
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
}
