package com.ust.docker_demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerMain {

	@GetMapping("/hello")
	public String printHello() {
		return "Hello";
	}
	
}
