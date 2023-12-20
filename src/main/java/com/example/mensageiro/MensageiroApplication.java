package com.example.mensageiro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class MensageiroApplication {

	public static void main(String[] args) {
		SpringApplication.run(MensageiroApplication.class, args);
	}
	
	@GetMapping("/")
	public String RootOn() {
		return "RestApi 1.0.0 ok!";
	}
	

}
