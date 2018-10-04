package com.sfsi.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class ServiceRequestResponseController {
	
	@RequestMapping(method=RequestMethod.GET,value="/get_service")
	public String getRequest(String request)
	{
		return "Welcome To Suraksha Service";
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/get_service")
	public String postRequest(String request)
	{
		return "Welcome To Suraksha Service";
	}

}
