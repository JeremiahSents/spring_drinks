package com.ics.spring_drinks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.ics.models")
public class Main {
	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}
}
