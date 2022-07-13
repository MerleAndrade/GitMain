package com.example.gitmain;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping
    public String sayWelcome(){
        return "Welcome!";
    }

    @GetMapping
    public String sayWelcome2(){
        return "Welcome!";
    }

}
