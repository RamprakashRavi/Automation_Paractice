package com.helper;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Configuration_reader {
	
	public static Properties p ;
	
	public Configuration_reader() throws Throwable {
		
		
	File f = new File("C:\\Users\\Ramprakash\\eclipse-workspace\\Automation_Practice\\src\\main\\java\\com\\properties\\configuration.properties");
	FileInputStream Fi = new FileInputStream(f);
    p = new Properties();
	p.load(Fi);
	
	
	
	
	}
	
	
	
	public String getUrl() {
		String url = p.getProperty("url");
		return url;

	}
	
	public String getUsername() {
		String user = p.getProperty("username");
		return user;

	}
	
	public String getPassword() {
		String pass = p.getProperty("password");
		return pass;

	}

}

