package com.ust.factorialservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/factorial")
public class FactorialController {

	@GetMapping("/{num}")
	public String findFactorial(@PathVariable int num) {
		if(num<=1) {
			return "You stupid or what?";
		}
		long fact = 1;
		for(int i = 2; i <= num; i++) {
			fact *= i;
		}
		return fact+" ";
	}
}
