package com.app.lakshay;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(MyAppConfig.class);
		
		Object  o1 = ac.getBean("eobj");
		
		Object  o2 = ac.getBean("cob");
		
		Object  o3 = ac.getBean("vr");
		
		System.out.println(o1);
		System.out.println(o2);
		System.out.println(o3);
		
	}
}
