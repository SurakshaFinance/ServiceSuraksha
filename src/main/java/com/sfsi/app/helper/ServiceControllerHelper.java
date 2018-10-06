package com.sfsi.app.helper;

import org.springframework.beans.factory.annotation.Autowired;

import com.sfsi.app.controller.ExecutionContext;
import com.sfsi.app.response.Error;
import com.sfsi.app.response.Response;

public class ServiceControllerHelper {
	
	@Autowired
	ServiceHelper serviceHelper;
	
	public void populateErrorResponse(ExecutionContext context, Exception e){
		Response response = new Response();
		serviceHelper.setCommonHedderData(context);
		response.setError(new Error("123","abc"));
		context.setServceResponse(response);
	}

}
