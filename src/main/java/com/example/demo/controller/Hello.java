package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
	
	@GetMapping(value = "/v1/hello")
	public String helloJi() {
		return "Hello Sarthak";
	}

}
