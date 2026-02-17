package com.app.lakshay;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(MyConfig.class);
		
		Object o1 = ac.getBean("oa");
		System.out.println(o1);
		
	}
}
