package com.docker.kubernete.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@GetMapping("/hello")
	public String hello() {
		System.out.println("Hello developers");
		return "Hello Kubernetes";
		
	}

}
