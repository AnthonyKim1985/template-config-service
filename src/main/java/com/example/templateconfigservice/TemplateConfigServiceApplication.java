package com.example.templateconfigservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class TemplateConfigServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(TemplateConfigServiceApplication.class, args);
    }
}
