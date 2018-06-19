package com.example.cloudcustomer.samplecloudcustomer.service;

import org.springframework.stereotype.Component;

@Component
public class TestServiceImpl implements TestService {
    @Override
    public String testMethod() {
        return "Sorry!";
    }
}
