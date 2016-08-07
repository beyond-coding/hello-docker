package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@SpringBootApplication
public class HelloDocker {

    @GetMapping
    public String hello() {
        return "Hello Docker.";
    }

    public static void main(String[] args) {
        SpringApplication.run(HelloDocker.class, args);
    }
}
