package com.example.cabService.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class defaultController {
    @GetMapping("/home")
    public String home(){
        return "Hi!! there";
    }
}
