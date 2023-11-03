package com.jaax.jwt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class Greeting {

    @GetMapping("/helloPublic")
    String helloPublic(){
        return "Hello world";
    }
    @GetMapping("/helloProtected")
    String helloPublicProtected(){
        return "Hello world";
    }
}
