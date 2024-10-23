package com.ust.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/service")
public class HelloController {

	@Autowired
	Environment environment;
	
	@GetMapping
	public String message() {
		return "from port # " +environment.getProperty("local.server.port"); 
	}

	@GetMapping("/test")
	public String sayHello() {
		return "hellooo";
	}
	
	@GetMapping("/time")
	public String getTime() {
		return "TIME";
	}
}