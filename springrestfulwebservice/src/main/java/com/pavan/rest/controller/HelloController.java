package com.pavan.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	
	@GetMapping("/hello")
	public String helloWorld()
	{
		return "Hello World";
	}
	
	@GetMapping("/hellobean")
	public HelloWorldBean helloBean()
	{
		return new HelloWorldBean("Hello World");
	}
	
	@GetMapping("/hello/pathvariable/{name}")
	public HelloWorldBean helloPathVariable(@PathVariable String name)
	{
		return new HelloWorldBean(String.format("Hello World,"+name));
	}
	
	
}
