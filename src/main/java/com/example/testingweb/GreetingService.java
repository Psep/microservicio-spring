package com.example.testingweb;

import java.security.NoSuchAlgorithmException;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
	
	public String greet() throws NoSuchAlgorithmException, NoSuchPaddingException {
		Cipher.getInstance("DES");
		return Constantes.MENSAJE;
	}

}
