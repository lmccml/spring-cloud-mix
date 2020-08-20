package com.example.lmc.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * @author lmc
 * @date 2020/7/31 23:09
 */
@Configuration
@Data
public class TestDemoConfig {

    //+1.2.@Value读取配置文件
    @Value("${environment.port}")
    private Integer port;
}
