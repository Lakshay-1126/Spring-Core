package com.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfiguration {

	// 1 method = 1 Object
	@Bean
	public A oa() {
		A a1 = new A();
		a1.setId(11);
		a1.setName("Lakshay");
		
		return a1;
	}
}