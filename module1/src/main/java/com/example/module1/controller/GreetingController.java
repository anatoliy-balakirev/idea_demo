package com.example.module1.controller;

import com.example.module2.SomeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/greet/{name}")
    public String greeting(@PathVariable("name") String name) {
        return new SomeService().greet(name);
    }
}
