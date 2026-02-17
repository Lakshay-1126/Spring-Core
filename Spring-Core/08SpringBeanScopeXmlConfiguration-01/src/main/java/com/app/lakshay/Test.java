package com.app.lakshay;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("Beans.xml");
	
		A a1 = ac.getBean("a1",A.class);
		System.out.println(a1.hashCode());
		
		A a2 = ac.getBean("a1",A.class);
		System.out.println(a2.hashCode());
	}
}
