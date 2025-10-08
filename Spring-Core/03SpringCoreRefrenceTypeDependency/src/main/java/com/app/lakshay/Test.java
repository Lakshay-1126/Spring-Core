package com.app.lakshay;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context =
            new ClassPathXmlApplicationContext("Config.xml");  

        Service sob = (Service) context.getBean("sob");
        System.out.println(sob);
    }
}
