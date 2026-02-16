package com.app.repo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


//Creating the Object and providing the data
@Component
public class MyRepository {
	
	// This is HardCoding
	// I am not passing data from properties file no Dollar Symbol	
	@Value("SAMPLE")
	private String entity;

	@Override
	public String toString() {
		return "MyRepository [entity=" + entity + "]";
	}
	
	

}
