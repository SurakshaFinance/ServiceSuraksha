package com.sfsi.app.helper;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.sfsi.app.constants.ServiceErrorCode;
import com.sfsi.app.exception.ServiceFatelException;
import com.sfsi.app.exception.ServiceNonFatelException;
import com.sfsi.app.response.Error;
import com.sfsi.app.response.Response;

@Component
public class ServiceControllerHelper {

	public String populateSuccessResponse(Response response) {
		String responseString = null;
		try {
			ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
			responseString = ow.writeValueAsString(response);
		} catch (JsonProcessingException e) {
			throw new ServiceNonFatelException(ServiceErrorCode.BAD_RESPONSE); 
		}
		return responseString;
	}

	public String populateErrorResponse(ServiceFatelException error) {
		String responseString = null;
		try {
			Response response = new Response();
			Error err = new Error(error.getErrorCode(),error.getErrorMessage());
			response.setError(err);
			ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
			responseString = ow.writeValueAsString(response);
		} catch (JsonProcessingException e) {
			throw new ServiceNonFatelException(ServiceErrorCode.BAD_REQUEST); 
		}
		return responseString;
	}
	
	public String populateErrorResponse(ServiceNonFatelException error) {
		String responseString = null;
		try {
			Response response = new Response();
			Error err = new Error(error.getErrorCode(),error.getErrorMessage());
			response.setError(err);
			ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
			responseString = ow.writeValueAsString(response);
		} catch (JsonProcessingException e) {
			throw new ServiceNonFatelException(ServiceErrorCode.BAD_REQUEST); 
		}
		return responseString;
	}

}
