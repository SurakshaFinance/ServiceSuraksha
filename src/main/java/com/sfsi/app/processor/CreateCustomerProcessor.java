package com.sfsi.app.processor;

import com.sfsi.app.constants.ServiceResult;
import com.sfsi.app.request.Request;
import com.sfsi.app.response.Response;
import com.sfsi.app.response.Result;

public class CreateCustomerProcessor extends AbstractProcessor{

	@Override
	public Response process(Request request) {
		Response response = new Response();
		response.setResult(new Result(ServiceResult.SUCCESS.getCode(), ServiceResult.SUCCESS.getMessage()));
		
		return response;
	}

}
