package com.app.lakshay;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.app.lakshay")
public class MyAppConfig {

	@Bean
	//@Primary
	public MyRepository m1() {
		
		MyRepository m1 = new MyRepository();
		m1.setName("Lakshay");
		return m1;
		
	}
	
	@Bean
	//@Primary
	public MyRepository m2() {
		
		MyRepository m2 = new MyRepository();
		m2.setName("Ramm");
		return m2;
		
	}
	
}
