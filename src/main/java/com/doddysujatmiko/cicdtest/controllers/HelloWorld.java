package com.doddysujatmiko.cicdtest.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class HelloWorld {
    @GetMapping("/")
    public String getHello() {
        return "Hello there, the cicd works. This is the first test of update.";
    }
}
