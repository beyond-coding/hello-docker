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

    private Integer counter = 0;

    @GetMapping
    public String hello() {
        return "Hello Docker.";
    }

    @GetMapping("/counter")
    public String counter() {
        return "The counter is " + counter;
    }

    public static void main(String[] args) {
        SpringApplication.run(HelloDocker.class, args);
    }
}
