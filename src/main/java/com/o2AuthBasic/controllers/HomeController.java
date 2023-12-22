package com.o2AuthBasic.controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/api/v1/hello")
    public String home(){
        return "hello guy";
    }
    @GetMapping("/profile")
    public String profile(){
        return null;
    }
}
