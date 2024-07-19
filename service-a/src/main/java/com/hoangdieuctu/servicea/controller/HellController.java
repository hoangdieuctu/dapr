package com.hoangdieuctu.servicea.controller;

import com.hoangdieuctu.servicea.dto.HelloDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/hello")
public class HellController {

    @GetMapping
    @ResponseBody
    public HelloDto sayHello() {
        log.info("Say hello");
        return new HelloDto("Hello from Service A");
    }

}
