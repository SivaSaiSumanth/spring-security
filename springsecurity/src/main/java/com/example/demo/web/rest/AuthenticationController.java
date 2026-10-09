package com.example.demo.web.rest;


import com.example.demo.service.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class AuthenticationController {

    @Autowired
    private AuthenticationService authenticationService;

    @PostMapping("/login-test")
    public String loginTest(
            @RequestParam String username,
            @RequestParam String password) {

        return authenticationService.authenticate(username, password);
    }
}