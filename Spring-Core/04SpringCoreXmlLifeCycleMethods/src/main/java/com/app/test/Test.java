package com.app.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
	
	ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("Beans.xml");  
     Object a1 = (Object) ac.getBean("eobj");
     System.out.println(a1);
     ac.close(); // ac.close() must be called to see destroy method, generally without closing container there will be no destroy method process.        
     //It will force container to stop by destroying the object.
	}
 
}

