package com.ust.cloudgateway_client.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/gatewayclient")
public class GatewayClientController {

	@Autowired
	RestTemplate template;
	
	@GetMapping("/getTime")
	public String fetchTime(){
		String url = "http://localhost:8072/rest/service/time";
		String time= template.getForObject(url, String.class);
		return time;			
	}
	
	@GetMapping("/getTest")
	public String fetchTest(){
		String url = "http://localhost:8072/rest/service/test";
		String test= template.getForObject(url, String.class);
		return test;			
	}
	
}
