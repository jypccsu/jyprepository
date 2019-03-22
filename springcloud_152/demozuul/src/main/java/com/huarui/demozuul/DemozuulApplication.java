package com.huarui.demozuul;

import com.huarui.demozuul.filter.ThrowExceptionFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class DemozuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemozuulApplication.class, args);
    }

    @Bean
    ThrowExceptionFilter throwExceptionFilter(){
        return new ThrowExceptionFilter();
    }
}
