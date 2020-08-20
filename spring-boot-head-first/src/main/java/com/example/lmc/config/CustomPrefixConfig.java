package com.example.lmc.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author lmc
 * @date 2020/7/31 23:29
 */
//+1.3.prefix自定义配置类读取配置文件
@ConfigurationProperties(prefix = "lmc")
@Component
@Data
public class CustomPrefixConfig {
    private Integer port;
}
