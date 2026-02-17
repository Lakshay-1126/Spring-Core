package com.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyAppConfig {
	
	// 1 Method = 1 Object
	@Bean
	public DriverManager conobj() {
		
		DriverManager dm = new DriverManager();
		dm.setDriverClass("ORACLE");
		dm.setUrl("JDBC:ORACLE");
		
		return dm;
	}

}
