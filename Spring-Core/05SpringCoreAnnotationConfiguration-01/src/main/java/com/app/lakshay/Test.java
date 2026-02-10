package com.app.lakshay;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
	// 1. First create a empty Container
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
		
		// 2. Find all the classes from given base packages
		ac.scan("com.app");
		
		// 3. Refresh the container
		
		ac.refresh();
		
		// 4. Read the Object
		HandlerComponent hc = ac.getBean("a1", HandlerComponent.class);
		
		// 5. Print the Object
		System.out.println(hc); // toString()
	}
}
