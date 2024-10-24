package com.ust.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
@RequestMapping("client/rest")
public class HelloController {
	
	@Autowired
	RestTemplate template;
	
	public final static String CLIENT_SERVICE = "clientService";
	
	@GetMapping
	@CircuitBreaker(name = CLIENT_SERVICE, fallbackMethod = "callOnFail")
	public String callServer(){
		String url = "http://localhost:8094/rest/service";
		String output= template.getForObject(url, String.class);
		return output;			
	}
	
	public String callOnFail(Exception e) {
		return "message from callOnFall()...";
	}

//	@Autowired
//	Environment environment;
//	
//	@GetMapping
//	public String message() {
//		return "from port # " +environment.getProperty("local.server.port"); 
//	}
//
//	@GetMapping("/test")
//	public String sayHello() {
//		return "hello";
//	}
//	
//	@GetMapping("/time")
//	public String getTime() {
//		return "TIME";
//	}
}
