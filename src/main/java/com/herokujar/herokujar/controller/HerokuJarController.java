package com.herokujar.herokujar.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HerokuJarController {
    @GetMapping()
    public String getHome() {
        return "Hello!";
    }
}
