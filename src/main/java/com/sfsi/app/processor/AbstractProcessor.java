package com.sfsi.app.processor;

import com.sfsi.app.request.Request;
import com.sfsi.app.response.Response;

public abstract class AbstractProcessor {
	
	public abstract Response process(Request request);
	
}
