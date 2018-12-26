package com.imooc.pay.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

/**
 * create by WSL_SILVA
 * 日期: 2018/8/28 0028
 * 用途：
 * 描述:
 */
@Data
@Component
@RefreshScope
@ConfigurationProperties("test")
public class TestConfig {

    private String name;
}
