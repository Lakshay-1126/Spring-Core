package com.app.lakshay;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("a1")
public class HandlerComponent {
	
	@Value("data")
	private String ha;
	
	@Value("info")
	private String sa;

	public HandlerComponent() {
		super();
	}

	@Override
	public String toString() {
		return "HandlerComponent [ha=" + ha + ", sa=" + sa + "]";
	}
	
	
	

}
