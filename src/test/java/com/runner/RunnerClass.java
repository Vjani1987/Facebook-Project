package com.runner;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import com.ipt.sept.IPTFacebookProject.Baseclass.BaseClass;
import com.property.ConfigurationHelper;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions( features="C:\\Users\\WELCOME\\eclipse-workspace\\IPTFacebookProject\\src\\test\\java\\com\\feature",glue="com.stepdefinition",
plugin= {"html:Report/HtmlReport1.html","junit:Report/xmlReport1.Xml","json:Report/JsonReport1.json"})

public class RunnerClass {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void setUp() throws IOException {
		
	String browser=ConfigurationHelper.getInstance().getBrowser();		
	driver=	BaseClass.browserLaunch(browser);
	}
		
	@AfterClass
	public static void tearDown() {
		driver.close();
	}
	
}
