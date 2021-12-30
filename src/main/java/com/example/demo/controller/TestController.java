package com.example.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController

public class TestController {
	
	@RequestMapping("/")
	public String hello() {
		return "hello";
	}
	
	@RequestMapping("/contact")
	public String contact() {
	return "contact";	
	}
	
	@GetMapping("/student")
	public String getAllData() {
		return "Welcome";
	}

}
