package com.sapient.asde.controller;

import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hellop")
public class HelloController {
    @GetMapping("/greet")
    public String getMessage(){
        return "I am hello producer";
    }
}
