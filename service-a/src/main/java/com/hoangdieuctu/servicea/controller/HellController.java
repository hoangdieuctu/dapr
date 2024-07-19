package com.hoangdieuctu.servicea.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HellController {

    @GetMapping
    @ResponseBody
    public String sayHello() {
        return "Hello from Service A";
    }

}
