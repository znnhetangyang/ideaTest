package com.ryit.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean {  // @Configuration -- spring  applicationContext.xml

    // 配置负载均衡 实现 RestTemplate
    @Bean
    @LoadBalanced   // Ribbon
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }



}
