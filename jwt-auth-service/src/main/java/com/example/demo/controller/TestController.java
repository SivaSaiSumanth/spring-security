package com.example.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/api/public")
    public String publicEndpoint() {
        return "This is a public endpoint";
    }

    @GetMapping("/api/protected")
    public String protectedEndpoint() {
        return "You have accessed a protected endpoint";
    }
}