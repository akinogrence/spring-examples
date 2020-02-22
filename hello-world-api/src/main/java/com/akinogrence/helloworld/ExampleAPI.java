package com.akinogrence.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sayServices")
public class ExampleAPI {

    @GetMapping("/sayHello")
    public String sayHello() { return "Hello";
    }

    @GetMapping("/sayMyName")
    public String sayMyName() {
        return "Akin";
    }
}

