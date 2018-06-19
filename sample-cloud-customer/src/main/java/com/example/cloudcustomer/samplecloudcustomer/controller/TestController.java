package com.example.cloudcustomer.samplecloudcustomer.controller;

import com.example.cloudcustomer.samplecloudcustomer.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    TestService testService;

    @RequestMapping(value = "/test",method = {RequestMethod.POST,RequestMethod.GET})
    public String testMethod() {
        return testService.testMethod();
    }
}
