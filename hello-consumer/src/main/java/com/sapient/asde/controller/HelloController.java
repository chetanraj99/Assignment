package com.sapient.asde.controller;

import com.sapient.asde.feign.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloc")
public class HelloController {
    @Autowired
    private HelloService helloService;

    @RequestMapping("/greet")
    public String getGreeting(){
        String message= helloService.getGreetings();
        return "I am hello consumer service\n"+message;
    }
}
