package com.example.demo;

import com.aki.TestInterface;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerTest {
    @Reference
    TestInterface testInterface;

    @RequestMapping(value = "test")
    public String test(){
        String s = testInterface.testString();
        return s;
    }
}
