package com.sfsi.app.helper;

import java.io.IOException;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sfsi.app.request.Request;

@Component
public class ServiceHelper {
	
	public Request getRequest(String jsonString) {
		try {
			return new ObjectMapper().readValue(jsonString, Request.class);
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
}
