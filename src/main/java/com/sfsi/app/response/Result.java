package com.sfsi.app.response;

public class Result {

	private String resultCode;
	private String resultMessage;
	
	public Result(String errorCode, String errorMessage){
		this.resultCode = errorCode;
		this.resultMessage = errorMessage;
	}
	
	public Result(){
		
	}
	public String getResultCode() {
		return resultCode;
	}
	public void setResultCode(String errorCode) {
		this.resultCode = errorCode;
	}
	public String getResultMessage() {
		return resultMessage;
	}
	public void setResultMessage(String errorMessage) {
		this.resultMessage = errorMessage;
	}
	
}
