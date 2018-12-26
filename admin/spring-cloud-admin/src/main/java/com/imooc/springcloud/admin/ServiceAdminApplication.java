package com.imooc.springcloud.admin;


import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * create by WSL_SILVA
 * 日期: 2018/12/26 0026
 * 用途：
 * 描述:
 */
@SpringBootApplication
@EnableAdminServer
public class ServiceAdminApplication {


    public static void main(String[] args) {
        SpringApplication.run(ServiceAdminApplication.class,args);
    }
}
