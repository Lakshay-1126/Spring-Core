package com.app.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.MyAppConfig;

public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(MyAppConfig.class);
		Object ob = ac.getBean("oa");
		System.out.println(ob);
	}

}
