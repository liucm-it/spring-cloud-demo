package com.example.feign.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/producer")
public class ProducerController {

    @RequestMapping("/hi")
    public String index(@RequestParam String name) {
        return String.format("hello %s", name);
    }
}
