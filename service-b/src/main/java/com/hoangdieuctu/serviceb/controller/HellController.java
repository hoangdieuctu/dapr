package com.hoangdieuctu.serviceb.controller;

import com.hoangdieuctu.serviceb.downstream.ServiceACaller;
import com.hoangdieuctu.serviceb.dto.HelloResponseDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/hello")
public class HellController {

    private final ServiceACaller serviceACaller;

    public HellController(ServiceACaller serviceACaller) {
        this.serviceACaller = serviceACaller;
    }

    @GetMapping
    @ResponseBody
    public HelloResponseDto sayHello() {
        log.info("Say hello");
        var helloDto = serviceACaller.sayHello();
        return new HelloResponseDto("Hello from Service B", helloDto);
    }
}
