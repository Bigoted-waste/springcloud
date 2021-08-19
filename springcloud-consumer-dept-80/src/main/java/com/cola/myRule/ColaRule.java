package com.cola.myRule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ColaRule {

    @Bean
    public IRule myRule(){
        return new RandomRule();
//        return new ColaRandomRule();    //默认是论询，现在我们自定义为 ColaRandomRule
    }
}
