package com.example.Spring_Security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Hello, Hau's home!";
    }

    @GetMapping("/secured")
    public String secured() {
        return "Hello, Secured!";
    }
}
