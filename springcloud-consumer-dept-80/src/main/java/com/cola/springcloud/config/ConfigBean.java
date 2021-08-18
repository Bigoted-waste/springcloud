package com.cola.springcloud.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean {   //@Configuration --spring applicationContext.xml

    //配置负载均衡实现RestTemplate
    /** IRule
        AvailabilityFilteringRule: 会先过滤吊，跳闸，访问故障的服务～，堆剩下的进行论询～
        RoundRobinRule ： 论询
        RandomRule ： 随机
        RetryRule   ： 会先按照论询获取服务～，如果服务获取失败，则会在制定的时间内进行重试。
     */
    @Bean
    @LoadBalanced   //Ribbon
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }



}
