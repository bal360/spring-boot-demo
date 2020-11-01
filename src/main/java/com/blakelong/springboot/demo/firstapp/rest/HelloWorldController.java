package com.blakelong.springboot.demo.firstapp.rest;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@Value("${movie.title}")
	private String title;
	
	@Value("${movie.release_date}")
	private String release_date;
	
	// add mapping for root "/"
	@RequestMapping("/") 
	public String sayHello() {
		return "Hello World from Spring Boot! Time on server is " + LocalDateTime.now();
	}
	
	// test endpoints devtools hot loading
	@RequestMapping("/reloadTest")
	public String reloadTest() {
		return "successful hot reload";
	}
	
	@RequestMapping("/secondCheck")
	public String checkAgain() {
		return "Successful check, my good sir";
	}
	
	@RequestMapping("/propertiesDemo")
	public String customProperties() {
		return "Movie title: " + title + " -- Release Date: " + release_date;
	}
}
