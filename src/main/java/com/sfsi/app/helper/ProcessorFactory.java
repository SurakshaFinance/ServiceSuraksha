package com.sfsi.app.helper;

import org.springframework.stereotype.Component;

import com.sfsi.app.constants.ServiceConstants;
import com.sfsi.app.constants.ServiceErrorCode;
import com.sfsi.app.exception.ServiceNonFatelException;
import com.sfsi.app.processor.AbstractProcessor;
import com.sfsi.app.processor.CreateCustomerProcessor;
import com.sfsi.app.processor.CustomerBalanceEnqueryProcessor;
import com.sfsi.app.request.Request;

@Component
public class ProcessorFactory {
	
	public AbstractProcessor getProcessor(Request request) {
		AbstractProcessor processor = null;
		String transactionCode = request.getRequestBody().getBasicDetails().getTransactionCode();
		if(ServiceConstants.FINANCIAL_CODE.equals(transactionCode) || ServiceConstants.NON_FINANCIAL_CODE.equals(transactionCode)) {
			String transactionSubCode = request.getRequestBody().getBasicDetails().getTransactionCode();
			if(ServiceConstants.CREATE_CUSTOMER.equals(transactionSubCode))
				processor = new CreateCustomerProcessor();
			if(ServiceConstants.BALANCE_ENQUERY.equals(transactionSubCode))
				processor = new CustomerBalanceEnqueryProcessor();
			else 
				throw new ServiceNonFatelException(ServiceErrorCode.UNDEFINED_TXN_SUB_CODE);
		}else {
			throw new ServiceNonFatelException(ServiceErrorCode.UNDEFINED_TXN_CODE);
		}
		return processor;
	}
}
