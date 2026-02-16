package com.app.lakshay;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MyService {

	@Autowired
	@Qualifier("m1")
	private  MyRepository repo;

	public MyRepository getRepo() {
		return repo;
	}

	public void setRepo(MyRepository repo) {
		this.repo = repo;
	}

	@Override
	public String toString() {
		return "MyService [repo=" + repo + "]";
	}

	
	
}
