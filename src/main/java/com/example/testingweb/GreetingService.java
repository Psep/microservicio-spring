package com.example.testingweb;

import java.security.NoSuchAlgorithmException;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
	
	public String greet() {
		try {
			Cipher.getInstance("DES");
		} catch (Exception e) {
			e.printStackTrace();
		}

		return Constantes.MENSAJE;
	}

}
