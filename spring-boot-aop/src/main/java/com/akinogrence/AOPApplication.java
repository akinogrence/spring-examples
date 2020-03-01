package com.akinogrence;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;


@SpringBootApplication
@EnableMongoRepositories
public class AOPApplication {

    public static void main(String[] args) {

        SpringApplication.run(AOPApplication.class,args);

    }
}
