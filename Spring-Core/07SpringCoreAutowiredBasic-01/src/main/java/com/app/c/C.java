package com.app.c;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.app.A.A;

@Component
public class C {

	@Autowired
	private A aa;  // Has-A-Relationship

	@Override
	public String toString() {
		return "C [aa=" + aa + "]";
	}
}
