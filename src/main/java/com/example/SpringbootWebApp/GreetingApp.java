package com.example.SpringbootWebApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GreetingApp {
    public static void main(String[] args) {
        SpringApplication.run(GreetingApp.class, args);
		System.out.println("HELLO SPRING BOOT");
    }
}
