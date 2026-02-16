package com.app.lakshay;

import org.springframework.beans.factory.annotation.Value;

public class B {

	@Value("10")
	private Integer roll;

	@Override
	public String toString() {
		return "B [roll=" + roll + "]";
	}	
}
