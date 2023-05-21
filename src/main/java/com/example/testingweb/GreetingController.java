package com.example.testingweb;

import java.security.NoSuchAlgorithmException;

import javax.crypto.NoSuchPaddingException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class GreetingController {

	private final GreetingService service;

	public GreetingController(GreetingService service) {
		this.service = service;
	}

	@RequestMapping("/greeting")
	public @ResponseBody String greeting() throws NoSuchAlgorithmException, NoSuchPaddingException {
		return service.greet();
	}

}
