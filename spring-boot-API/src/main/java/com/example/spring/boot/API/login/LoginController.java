package com.example.spring.boot.API.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

	@RequestMapping("/login")
	public String loginjsp()   
	{
		return "login";
	}
	
	@RequestMapping("login-html")
	@ResponseBody
	public String loginHtml()
	{
		StringBuffer sb = new StringBuffer();
		sb.append("<html>");
		sb.append("<head>");
		sb.append("Login Page");
		sb.append("</head>");
		sb.append("<body>");
		sb.append("Welcome to the login page");
		sb.append("</body>");
		sb.append("</html>");
		
		return sb.toString();
		
		
	}
	
}
