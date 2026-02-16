package com.app.lakshay;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("oa")
public class A {

	@Value("Lakshay")
	private String name;
	
	@Value("112")
	private Integer id;

	@Autowired //(required = false) then Output will be : A [name=Lakshay, id=112, ob=null]
	B ob;

	@Override
	public String toString() {
		return "A [name=" + name + ", id=" + id + ", ob=" + ob + "]";
	}
	
	
	
}
