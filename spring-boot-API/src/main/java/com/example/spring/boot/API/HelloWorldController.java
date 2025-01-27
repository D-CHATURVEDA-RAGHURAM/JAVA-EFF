package com.example.spring.boot.API;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController   
{
	@RequestMapping("/")
	@ResponseBody
	public String hello()   
	{
		return "Hello Chaturved";
	}
	
	@RequestMapping("hello-html")
	@ResponseBody
	public String helloHtml()
	{
		StringBuffer sb = new StringBuffer();
		sb.append("<html>");
		sb.append("<head>");
		sb.append("<title>Login Page</title>");
		sb.append("</head>");
		sb.append("<body>");
		sb.append("Welcome to the login page");
		sb.append("</body>");
		sb.append("</html>");
		
		return sb.toString();
		
		
	}
	
}