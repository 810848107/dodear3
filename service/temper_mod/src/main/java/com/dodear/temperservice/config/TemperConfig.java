package com.dodear.temperservice.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.dodear.temperservice.mapper")
public class TemperConfig {

}
