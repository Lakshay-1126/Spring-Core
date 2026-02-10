package com.app.lakshay;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// @Component :- Container creates Object to the class.
@Component("hob")
public class HandlerInfo {

	/* @Value :- To provide data to variable (dependency).
	             To HardCode variable/dependencies {HardCoding :- Assign a direct value to a variable inside source code}.
	             TO read the data for resources [.properties / .yml / .xml ].
	             To provide One SPEL (Spring Expression Language).
	*/
	@Value("data")
	private String resolvercode;
	
	@Value("temp")
	private String pethtostore;

	public HandlerInfo() {
		super();
	}
	@Override
	public String toString() {
		return "HandlerInfo [resolvercode=" + resolvercode + ", pethtostore=" + pethtostore + "]";
	}
}
