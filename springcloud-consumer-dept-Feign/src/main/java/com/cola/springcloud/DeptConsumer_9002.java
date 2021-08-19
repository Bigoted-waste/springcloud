package com.cola.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.cola.springcloud"})
@ComponentScan("com.cola.springcloud")
public class DeptConsumer_9002 {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer_9002.class,args);
    }
}
