package com.example.learn.springboot.mycoolapp.rest_controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    @GetMapping("/") // FOR MAPPING THE SITE
    public String sayHello(String message){
        return  "Hello World";
    }
}
