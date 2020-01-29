package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class WebApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebApplication.class, args);
		
	}
	
	 @RestController
	    class SimpleController {

	        @GetMapping
	        public Map hello() {
	            Map map = new HashMap();
	            map.put("say", "hello");
	            return map;
	        }
	    }

}
