package com.sfsi.app.helper;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.sfsi.app.constants.ServiceResult;
import com.sfsi.app.exception.ServiceFatelException;
import com.sfsi.app.exception.ServiceNonFatelException;
import com.sfsi.app.response.Result;
import com.sfsi.app.response.Response;

@Component
public class ServiceControllerHelper {

	public String populateSuccessResponse(Response response) {
		String responseString = null;
		try {
			ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
			responseString = ow.writeValueAsString(response);
		} catch (JsonProcessingException e) {
			throw new ServiceNonFatelException(ServiceResult.BAD_RESPONSE); 
		}
		return responseString;
	}

	public String populateErrorResponse(ServiceFatelException error) {
		String responseString = null;
		try {
			Response response = new Response();
			Result result = new Result(error.getErrorCode(),error.getErrorMessage());
			response.setResult(result);
			ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
			responseString = ow.writeValueAsString(response);
		} catch (JsonProcessingException e) {
			throw new ServiceNonFatelException(ServiceResult.BAD_REQUEST); 
		}
		return responseString;
	}
	
	public String populateErrorResponse(ServiceNonFatelException error) {
		String responseString = null;
		try {
			Response response = new Response();
			Result result = new Result(error.getErrorCode(),error.getErrorMessage());
			response.setResult(result);
			ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
			responseString = ow.writeValueAsString(response);
		} catch (JsonProcessingException e) {
			throw new ServiceNonFatelException(ServiceResult.BAD_REQUEST); 
		}
		return responseString;
	}

}
