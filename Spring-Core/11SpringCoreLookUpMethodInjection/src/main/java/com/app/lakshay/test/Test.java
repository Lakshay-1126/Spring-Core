package com.app.lakshay.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.lakshay.Service.Token;
import com.app.lakshay.Service.TokenService;
import com.app.lakshay.config.AppConfig;

public class Test {

//	public static void main(String[] args) {
//		ApplicationContext ac  = new AnnotationConfigApplicationContext(AppConfig.class);
//		
//		// Reading first time 
//		TokenService ts1  = ac.getBean("tokenService", TokenService.class);
//		Token tk1  = ts1.getToken();
//		System.out.println(tk1);
//		System.out.println(tk1.hashCode());
//		
//		// Reading second time 
//		TokenService ts2  = ac.getBean("tokenService", TokenService.class);
//		Token tk2  = ts2.getToken();
//		System.out.println(tk2);
//		System.out.println(tk2.hashCode());
//				
//	    // Reading third time 
//		TokenService ts3  = ac.getBean("tokenService", TokenService.class);
//		Token tk3  = ts3.getToken();
//		System.out.println(tk3);
//		System.out.println(tk3.hashCode());
//		
//		
//	}
	
	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		
		// Reading first time 
		TokenService ts1 = ac.getBean("tokenService",TokenService.class);
		Token tk1 = ts1.getMyToken();
		System.out.println(ts1.hashCode() + " " + tk1.hashCode());
		
		// Reading second time 
		TokenService ts2 = ac.getBean("tokenService",TokenService.class);
		Token tk2 = ts2.getMyToken();
		System.out.println(ts2.hashCode() + " " + tk2.hashCode());
				
		// Reading third time 
		TokenService ts3 = ac.getBean("tokenService",TokenService.class);
		Token tk3 = ts3.getMyToken();
		System.out.println(ts3.hashCode() + " " + tk3.hashCode());
				
	}
}
