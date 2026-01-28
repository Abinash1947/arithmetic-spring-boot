package com.klu;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Hello {
	@GetMapping("/message")
	public String getMessage() {
		return "FSAD SEC-32";
	}
	@GetMapping("/secondyear")
	public String getMessage1() {
		return "Second Year";
	}
	@GetMapping("/fsad")
	public String getMessage2() {
		return "FSAD Spring Boot";
	}
	@GetMapping("/spring")
	public String getMessage3() {
		return "FSAD";
	}
}
