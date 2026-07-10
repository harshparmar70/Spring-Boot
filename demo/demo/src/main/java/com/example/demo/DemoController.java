package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/hello")
    public String helloworld() {
        return "Hello world!";
    }
}
/*
Create a package named controller and add the following class.

@RestController is used to create RESTful web services.
@GetMapping("/hello") maps the /hello URL to the method. */