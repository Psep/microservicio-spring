package com.example.testingweb;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

	private static final String PASSWORD = "test";
	
	public String greet() {
		return Constantes.MENSAJE;
	}

	public Boolean validatePassword(String password) {
		return PASSWORD.equals(password);
	}
}
