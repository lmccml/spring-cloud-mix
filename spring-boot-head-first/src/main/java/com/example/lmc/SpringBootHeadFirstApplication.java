package com.example.lmc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/*
**+2.1.Program arguments:  --debug 调出自动配置评估报告
 */
//@SpringBootApplication(exclude = org.springframework.cache.CacheManager.class) --排除自动配置类
@EnableScheduling
@SpringBootApplication
public class SpringBootHeadFirstApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootHeadFirstApplication.class, args);
    }

}
