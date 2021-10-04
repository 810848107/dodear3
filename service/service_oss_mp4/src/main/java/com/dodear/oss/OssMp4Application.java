package com.dodear.oss;

import com.dodear.oss.service.OssServiceForMp4;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@ComponentScan(basePackages = {"com.dodear"})
public class OssMp4Application {
    public static void main(String[] args) {
        SpringApplication.run(OssMp4Application.class,args);
    }
}
