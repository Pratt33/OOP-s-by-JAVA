package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	@GetMapping("/")
	public String home() {
		return "Welcome to My Portfolio!";
	}

	@GetMapping("/about")
	public String about() {
		return "I am a Java developer with a passion for creating web applications.";
	}

	@GetMapping("/projects")
	public String projects() {
		return "Project 1: Description of project 1.<br>Project 2: Description of project 2.";
	}

	@GetMapping("/contact")
	public String contact() {
		return "Email: example@example.com";
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
