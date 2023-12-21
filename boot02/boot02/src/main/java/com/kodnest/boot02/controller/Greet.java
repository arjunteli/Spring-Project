package com.kodnest.boot02.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Greet {
	@GetMapping(value = "/greet")
	public String greet() {
		return "Hi Namaste!!!!";
	}
}
