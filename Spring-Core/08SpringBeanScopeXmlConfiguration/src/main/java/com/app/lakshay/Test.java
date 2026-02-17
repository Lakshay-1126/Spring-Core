package com.app.lakshay;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("Beans.xml");
		
		// getBean method reading the object from the container
		// To avoid the type casting
		Token tk1 = ac.getBean("t1",Token.class);
		System.out.println(tk1.hashCode());
		
		// Same  object I am reading the second time
		Token tk2 = ac.getBean("t1",Token.class);
		System.out.println(tk2.hashCode());
		
		// HashCode  just for confirmation that object is same or different
		
		// In case of scope is Singleton : HashCode are the same that means Single object is created
		
		// In the case of prototype we read same object 2 times
		// it gives two different values means different object created
		
		
	}
}
