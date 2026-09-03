package com.mycom.myapp.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class TestController {

	@GetMapping("/Hello")
	public String hello() {
		return "Hello,Aws!";
			}
}
