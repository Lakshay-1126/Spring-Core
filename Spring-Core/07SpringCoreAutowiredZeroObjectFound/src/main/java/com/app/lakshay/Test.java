package com.app.lakshay;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.MyAppConfig;

public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(MyAppConfig.class);
		
	        Object o = ac.getBean("oa");
	        
	        System.out.println(o);
	        
	        // NoSuchBeanDefinitionException: No qualifying bean of type 'com.app.lakshay.B' available: 
	        // expected at least 1 bean which qualifies as AutoWire candidate. Dependency annotations: {(required=true)}
	}
}
