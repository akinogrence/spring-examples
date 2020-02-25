package com.akinogrence;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
public class SwaggerApp {

    public static void main(String[] args) {
        SpringApplication.run(SwaggerApp.class,args);
    }
}
