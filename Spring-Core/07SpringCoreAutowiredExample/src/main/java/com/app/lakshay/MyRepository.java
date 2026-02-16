package com.app.lakshay;

import org.springframework.stereotype.Component;

@Component
public class MyRepository {

	private String name;

	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "MyRepository [name=" + name + "]";
	}

	
	
}
