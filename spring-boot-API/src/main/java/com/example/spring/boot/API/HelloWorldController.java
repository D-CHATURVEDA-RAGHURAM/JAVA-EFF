package com.example.spring.boot.API;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController   
{
	@RequestMapping("/")
	public String hello()   
	{
		return "Hello Chaturved";
	}
}