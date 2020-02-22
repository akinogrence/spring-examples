package com.akinogrence;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@SpringBootApplication
@EnableElasticsearchRepositories
class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }

    ;
}
