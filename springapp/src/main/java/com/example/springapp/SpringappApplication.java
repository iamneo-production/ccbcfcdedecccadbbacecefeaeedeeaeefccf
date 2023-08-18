package com.example.springapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringappApplication {
	@GetMapping("/Welcome")
	public String Welcome(){
		return "Welcome";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringappApplication.class, args);
	}

}
