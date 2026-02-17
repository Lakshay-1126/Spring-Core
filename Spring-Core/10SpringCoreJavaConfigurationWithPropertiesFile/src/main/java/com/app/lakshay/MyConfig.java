package com.app.lakshay;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;  

@Configuration
@PropertySource("classpath:lakshay.properties")
public class MyConfig {

    @Autowired
    private Environment env;  //  Spring Environment

    @Bean
    public A oa() {
        A a1 = new A();
        a1.setId(env.getProperty("id"));
        a1.setName(env.getProperty("name"));
        return a1;
    }
}
