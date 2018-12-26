package com.imooc.project;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Project1Application {

	public static void main(String[] args) {
		SpringApplication.run(Project1Application.class, args);
	}


	@Value("${server.port}")
	String port;
	@GetMapping("/hi")
	@HystrixCommand(fallbackMethod = "hiError")
	public String hi(@RequestParam(required = false,defaultValue = "cralor")String name){
		return "hi "+name+",i am client one and from port:"+port;
	}
	public String hiError(String name){
		return "熔断机制，服务降级";
	}

}

