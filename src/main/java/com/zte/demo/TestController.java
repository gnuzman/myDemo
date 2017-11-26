package com.zte.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;

@Api("TestController")
@RestController
public class TestController {

	@PostMapping("/post")
	public String testPost() {
		return "post";
	}
	
	@GetMapping("test")
	public String test() {
		return "test";
	}
}
