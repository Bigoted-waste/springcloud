package com.cola.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard //开启
public class DeptConsumerDashboard_9011 {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumerDashboard_9011.class,args);
    }
}
