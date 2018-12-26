package com.imooc.pay.controller;

import com.imooc.pay.config.TestConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * create by WSL_SILVA
 * 日期: 2018/8/28 0028
 * 用途：
 * 描述:
 */
@RestController
@RequestMapping("/pay/test")
public class TestController {

    @Autowired
    private TestConfig testConfig;

    @RequestMapping("/print")
    public String print(){
        return testConfig.getName();
    }
}
