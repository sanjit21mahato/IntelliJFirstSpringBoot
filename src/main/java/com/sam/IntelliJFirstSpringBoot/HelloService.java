package com.sam.IntelliJFirstSpringBoot;

import org.springframework.stereotype.Component;

@Component
public class HelloService {

    public String helloCall(String id) {
        return "Hello, World!";
    }
}
