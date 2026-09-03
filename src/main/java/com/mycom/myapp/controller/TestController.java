package com.mycom.myapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class TestController {

	@GetMapping("/Hello")
	public String hello() {
		return "Hello,Aws! SSH! CI/CD!!! LoCAL SSH" ;
			}
}
