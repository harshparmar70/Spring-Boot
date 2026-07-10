package com.harsh.myFirstProject1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class car {

    @Autowired
    private Dog dog;  //DI

    @GetMapping("/")
    public String ok(){
        return dog.fun();
    }

    @Component
    public static class Dog {
        public String fun(){
            return "something";
        }
    }
}
