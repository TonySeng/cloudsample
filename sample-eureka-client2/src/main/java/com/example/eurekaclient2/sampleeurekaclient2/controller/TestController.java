package com.example.eurekaclient2.sampleeurekaclient2.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Value("${server.port}")
    int port;

    @RequestMapping("/test")
    public String testMethod() {
        return "server bei被调用:"+port;
    }
}
