package com.app.lakshay.Service;

import java.util.Random;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Token {

	private int code;

	public Token() {
		super();
		//Constructor Injection
		code = Math.abs(new Random().nextInt());
	}

	@Override
	public String toString() {
		return "Token [code=" + code + "]";
	}
}
