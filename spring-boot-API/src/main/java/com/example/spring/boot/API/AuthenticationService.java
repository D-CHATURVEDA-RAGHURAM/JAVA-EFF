package com.example.spring.boot.API;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
	
	public boolean authenticate(String Username, String Password)
	{
		boolean isValidUserName = Username.equalsIgnoreCase("Chatur");
		boolean isValidUserPassword = Password.equalsIgnoreCase("Chatur@123");
		
		return isValidUserName && isValidUserPassword;
	}
	
}
