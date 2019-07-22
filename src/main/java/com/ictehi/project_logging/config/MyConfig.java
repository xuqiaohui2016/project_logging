package com.ictehi.project_logging.config;

import com.ictehi.project_logging.service.DeptService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    private static final Logger logger = LoggerFactory.getLogger(MyConfig.class);


    @Bean
    public DeptService deptService() {
        logger.info(" == init service bean ==");
        return new DeptService();
    }
}
