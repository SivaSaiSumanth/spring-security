package com.example.demo.web.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/api/public")
    public String publicEndpoint() {
        return "Anyone can access this endpoint";
    }

    @GetMapping("/api/user")
    public String userEndpoint() {
        return "USER or ADMIN can access this endpoint";
    }

    @GetMapping("/api/admin")
    public String adminEndpoint() {
        return "Only ADMIN can access this endpoint";
    }
}