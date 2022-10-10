package com.property;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
	
	public Properties p;
	public ConfigurationReader() throws IOException {
		
		File f= new File("C:\\Users\\WELCOME\\eclipse-workspace\\IPTFacebookProject\\src\\main\\java\\com\\property\\Facebook.properties");
		
		FileInputStream fi= new FileInputStream(f);
		
		 p=new Properties();
		
		p.load(fi);	
	}
	
	public String getBrowser() {
	String browser= p.getProperty("browser");
	return browser;
	}
	
	public String getUrl() {
	String url=p.getProperty("url");
	return url;
	}
	
	public String getUserName() {
	String username=p.getProperty("username");
	return username;
	}
	
	public String getPassword() {
	String password= p.getProperty("password");
	return password;
	}
	
	public String getfirstName() {
	String firstname=p.getProperty("firstname");
	return firstname;
	}
	
	public String getSurName() {
	String surname=p.getProperty("surname");
	return surname;
	}
	
	public String getMobileNo() {
	String mobileNo=p.getProperty("mobileNo");
	return mobileNo;
	}
	
	public String getNewPassword() {
	String newpassword=p.getProperty("newpassword");
	return newpassword;
	}
	
	public String getDay() {
	String day=p.getProperty("day");
	return day;
	}
	
	public String getMonth() {
	String month=p.getProperty("month");
	return month;
	}
	
	public String getYear() {
	String year=p.getProperty("year");
	return year;
	}
	
	public String getScreenShot() {
	String screenshot=p.getProperty("takescreenshot");
	return screenshot;
	}
	
	public String getScreenShot1() {
	String screenshot1=p.getProperty("takescreenshot1");
	return screenshot1;
	}
}
