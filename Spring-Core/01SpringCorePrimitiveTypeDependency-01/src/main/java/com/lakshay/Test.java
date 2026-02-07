package com.lakshay;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		
		Repository repository = (Repository) ac.getBean("aa");
		
		System.out.println(repository);
		
	}
}
