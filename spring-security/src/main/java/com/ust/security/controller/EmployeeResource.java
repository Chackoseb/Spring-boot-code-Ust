package com.ust.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeResource {

	@GetMapping("/")
	public String greet() {
		return "Hello";
	}
	
	@GetMapping("/admin")
	public String greetAdmin() {
		return "Hello Admin";
	}
	
	@GetMapping("/user")
	public String greetUser() {
		return "Hello User";
	}
}
