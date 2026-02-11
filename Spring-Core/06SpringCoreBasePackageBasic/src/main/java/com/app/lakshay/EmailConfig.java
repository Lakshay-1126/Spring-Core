/* This is the input must be given in case of Spring Annotation Configuration (so that Spring Container caV find our classes).

   Container will try to find classes from given package and sub packages.

   @ComponentScan is used to provide base packages to Scan our classes.

   Syntax:- 
   @ComponentScan(basepackages="com.app") means 
   find classes from app package and app all sub packages classes

   -> Always define one Additional class to provide base package Using Annotation @ComponentScan
 */
package com.app.lakshay;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("eobj")
public class EmailConfig {
	
	@Value("gmail")
	private String host;
	
	@Value("852")
	private Integer port;

	public EmailConfig() {
		super();
	}

	@Override
	public String toString() {
		return "EmailConfig [host=" + host + ", port=" + port + "]";
	}
	
	

}
