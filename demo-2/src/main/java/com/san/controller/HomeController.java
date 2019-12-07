package com.san.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@RequestMapping("/hello")
	public String hello() {
		
		return "hello from demo2 application";
	}
	
	@RequestMapping("/test")
	public String test() {
		return "test message form demo2 application";
	}
}
