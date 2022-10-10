package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SingleTonDesignpattern {
	public WebDriver driver;
	
	public SingleTonDesignpattern(WebDriver driver2) {
		this.driver= driver2;
		PageFactory.initElements(driver2, this);
	}

	public LoginPage getLoginPage() {
		LoginPage lp= new LoginPage(driver);
		return lp;
	}

	public CreateNewAccountPage getCreateNewAccountPage() {
		CreateNewAccountPage cnap= new CreateNewAccountPage(driver);
		return cnap;
	}
}
