package com.app.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("oa")
public class A {
	
	@Value("${my.db.id}")
	private Integer id;
	
	@Value("${my.db.name}")
	private String name;
	
	@Value("${my.db.city}")
	private String city;
	
	@Value("${my.db.state}")
	private String state;

	@Override
	public String toString() {
		return "A [id=" + id + ", name=" + name + ", city=" + city + ", state=" + state + "]";
	}
	
	
	

}
