package com.app.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("con")
public class DatabaseConnection {
	//@Value(keys)--->Similar to the
	@Value("${my.db.drive}")
	private String driver;
	@Value("${my.db-url}")
	private String url;
	@Value("${my.db_user}")
	private String userName;
	// Reading the data from spring container
	@Value("${my.db-pwd}")
	private String userPwd;
	@Override
	public String toString() {
		return "DatabaseConnection [driver=" + driver + ", url=" + url + ", userName=" + userName + ", userPwd="
				+ userPwd + "]";
	}
	
	

}
