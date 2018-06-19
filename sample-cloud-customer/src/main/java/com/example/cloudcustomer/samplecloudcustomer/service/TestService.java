package com.example.cloudcustomer.samplecloudcustomer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "eureka-client",fallback = TestServiceImpl.class)
public interface TestService {
    @RequestMapping("/test")
    String testMethod();
}
