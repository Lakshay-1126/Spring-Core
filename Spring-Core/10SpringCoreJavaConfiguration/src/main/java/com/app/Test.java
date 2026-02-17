package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(JavaConfiguration.class);
		
		Object o1 = ac.getBean("oa");
		System.out.println(o1);
		
	}
}