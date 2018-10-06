package com.sfsi.app.helper;

import java.io.IOException;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sfsi.app.constants.ServiceErrorCode;
import com.sfsi.app.exception.ServiceNonFatelException;
import com.sfsi.app.request.Request;

@Component
public class ServiceHelper {
	
	public Request getRequest(String jsonString) {
		try {
			return new ObjectMapper().readValue(jsonString, Request.class);
		} catch (IOException e) {
			throw new ServiceNonFatelException(ServiceErrorCode.INVALID_REQUEST);
		}
	}

	public void validateRequest(String request) throws ServiceNonFatelException {
		try{
			new ObjectMapper().readTree(request);
		}catch (Exception e) {
			throw new ServiceNonFatelException(ServiceErrorCode.BAD_REQUEST);
		}
	}
}
