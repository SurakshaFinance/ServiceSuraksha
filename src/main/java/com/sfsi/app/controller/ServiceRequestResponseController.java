package com.sfsi.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sfsi.app.exception.ServiceFatelException;
import com.sfsi.app.exception.ServiceNonFatelException;
import com.sfsi.app.helper.ProcessorFactory;
import com.sfsi.app.helper.ServiceControllerHelper;
import com.sfsi.app.helper.ServiceHelper;
import com.sfsi.app.processor.AbstractProcessor;
import com.sfsi.app.request.Request;
import com.sfsi.app.response.Response;

@RestController
@RequestMapping("/api/v1")
public class ServiceRequestResponseController {
	
	@Autowired
	private ServiceHelper serviceHelper;
	
	@Autowired
	private ServiceControllerHelper serviceControllerHelper;
	
	@Autowired
	private ProcessorFactory processorFactory;
	@RequestMapping(method=RequestMethod.GET,value="/get_service")
	public String getRequest(String requestString)
	{
		String responseString = null;
		Response response = null;
		try {
			serviceHelper.validateRequest(requestString);
			Request request = serviceHelper.getRequest(requestString);
			AbstractProcessor processor = processorFactory.getProcessor(request);
			response = processor.process(request);
			responseString = serviceControllerHelper.populateSuccessResponse(response);
		}catch(ServiceFatelException error) {
			responseString = serviceControllerHelper.populateErrorResponse(error);
		}catch(ServiceNonFatelException error) {
			responseString = serviceControllerHelper.populateErrorResponse(error);
		}catch (Exception e) {
			return "BadRequest";
		}
		return responseString;
	}

	@RequestMapping(method=RequestMethod.POST,value="/get_service")
	public String postRequest(String requestString)
	{
		String responseString = null;
		Response response = null;
		try {
			serviceHelper.validateRequest(requestString);
			Request request = serviceHelper.getRequest(requestString);
			AbstractProcessor processor = processorFactory.getProcessor(request);
			response = processor.process(request);
			responseString = serviceControllerHelper.populateSuccessResponse(response);
		}catch(ServiceFatelException error) {
			responseString = serviceControllerHelper.populateErrorResponse(error);
		}catch(ServiceNonFatelException error) {
			responseString = serviceControllerHelper.populateErrorResponse(error);
		}catch (Exception e) {
			return "BadRequest";
		}
		return responseString;
	}

}
