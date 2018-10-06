package com.sfsi.app.constants;

public enum ServiceConstants {

	FINANCIAL_CODE						("FIN001"),
	NON_FINANCIAL_CODE					("NFIN02"),
	
	CREATE_CUSTOMER						("TSC001"),
	CREATE_AGENT						("TSC002"),
	EDIT_CUSTOMER_POFILE				("TSC003"),
	EDIT_AGENT_PROFILE					("TSC004"),
	BALANCE_ENQUERY						("TSC005");
	
	private String code;
	
	private ServiceConstants(String code){
		this.code = code;
	}

	public String getCode() {
		return code;
	}

}