package com.app.lakshay;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext acac = new AnnotationConfigApplicationContext(MyAppConfig.class);
		
		MyService o1 = (MyService) acac.getBean("myService");
		System.out.println(o1);
	}
}
