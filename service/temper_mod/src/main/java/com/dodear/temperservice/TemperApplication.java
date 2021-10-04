package com.dodear.temperservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.dodear"})
public class TemperApplication {
    public static void main(String[] args) {
        SpringApplication.run(TemperApplication.class,args);
    }
}
