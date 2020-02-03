package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorService {	
	@GetMapping("/add/{num1}/{num2}")
	public int addition(@PathVariable("num1") int num1,
			            @PathVariable("num2") int num2) {
		
		return (num1 + num2);
	}
//http://localhost:8080/add/10/20
}
