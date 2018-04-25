package com.biznomy.microservice;

import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="test")
public class ControllerExample {
	
	@GetMapping(value="")	
	public String getSessionId(HttpSession httpSession){
		return httpSession.getId();		
	} 

}
