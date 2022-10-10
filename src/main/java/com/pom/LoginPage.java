package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public static WebDriver driver;
	@FindBy(tagName="h2")
	private WebElement text;
	
	@FindBy(id="email")
	private WebElement username;
	
	@FindBy(name="pass")
	private WebElement password;
	
	@FindBy(name="login")
	private WebElement loginbtn;
	
	
	
	public LoginPage(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getText() {
		return text;
	}
	
	public WebElement getUserName() {
		return username;
	}
	
	public WebElement getPassword() {
		return password;
	}
	
	public WebElement getLoginBtn() {
		return loginbtn;
	}

}
