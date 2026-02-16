package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.app.c.C;
import com.app.config.MyAppConfig;


public class Test {

	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(MyAppConfig.class);
		Object ob = ac.getBean(C.class);
		
		System.out.println(ob);
		// If we don't use @AutoWired then it will give output null
	}
}
