package com.ryit.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

// 启动类
@SpringBootApplication
@EnableEurekaClient  // 在服务启动后 自动注册到 Eureka 中 ！！
@EnableDiscoveryClient
@EnableCircuitBreaker   // 添加对熔断的支持
public class DeptProviderHystrix_8001 {

    public static void main(String [] args){
        SpringApplication.run(DeptProviderHystrix_8001.class,args);
    }

}
