package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorldApp {

    public static void main(String[] args) {
        System.out.println("running sprint boot");
        System.out.println("running sprint boot2");
        SpringApplication.run(HelloWorldApp.class, args);
    }

}
