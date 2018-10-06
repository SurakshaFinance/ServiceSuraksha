package com.sfsi.app.constants;

public enum ServiceConstants {

	FINANCIAL_CODE						("FIN001"),
	NON_FINANCIAL_CODE					("NFIN02"),
	
	CREATE_CUSTOMER						("TSC001"),
	CREATE_AGENT						("TSC001"),
	EDIT_CUSTOMER_POFILE				("TSC001"),
	EDIT_AGENT_PROFILE					("TSC001"),
	BALANCE_ENQUERY						("TSC002");
	
	private String code;
	
	private ServiceConstants(String code){
		this.code = code;
	}

	public String getCode() {
		return code;
	}

}