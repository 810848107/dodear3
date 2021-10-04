package com.dodear.recordingservice.config;

import com.dodear.recordingservice.service.TabRecordService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.dodear.recordingservice.mapper")
public class RrcordingConfig {
    @Autowired
    private TabRecordService tabRecordService;


}
