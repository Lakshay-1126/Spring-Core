package com.app.lakshay;

public class Service {

	private Repository r1;

	public Service() {
		super();
	}

	public Repository getR1() {
		return r1;
	}

	public void setR1(Repository r1) {
		this.r1 = r1;
	}

	@Override
	public String toString() {
		return "Service [r1=" + r1 + "]";
	}
	
}
