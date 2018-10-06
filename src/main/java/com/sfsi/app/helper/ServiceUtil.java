package com.sfsi.app.helper;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ServiceUtil {
	
	public boolean validateJsonString(String jsonString) {
		try {
			new ObjectMapper().readTree(jsonString);
			return true;
		}catch (Exception e) {
			return false;
		}
	}
}
