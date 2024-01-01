package com.manojnanjundaswamy.javatutorial;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JavaTutorialApplication {
	
	@Value("${user_name}")
	private String name;

	public static void main(String[] args) {
		SpringApplication.run(JavaTutorialApplication.class, args);
	}
	
	@GetMapping("/")
	public String greet() {
		return "Hello "+name+", Welcome to Java Tutorials.... Happy Learning!!!";
	}

}
