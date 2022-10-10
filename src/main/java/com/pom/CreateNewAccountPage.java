package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewAccountPage {

	public static WebDriver driver;
	@FindBy(xpath="(//a[@role='button'])[2]")
	private WebElement createnewaccbtn;
	
	@FindBy(name="firstname")
	private WebElement firstname;
	
	@FindBy(name="lastname")
	private WebElement surname;
	
	@FindBy(xpath="(//input[@type='text'])[4]")
	private WebElement mobileNo;
	
	@FindBy(xpath="(//input[@type='password'])[2]")
	private WebElement newpassword;
	
	@FindBy(id="day")
	private WebElement date;
	
	@FindBy(id="month")
	private WebElement month;
	
	@FindBy(id="year")
	private WebElement year;
	
	@FindBy(xpath="//label[text()='Female']")
	private WebElement gender;
	
	@FindBy(xpath="(//button[text()='Sign Up'])[1]")
	private WebElement signup;
	
	

	public CreateNewAccountPage(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getCreateNewAccountBtn() {
		return createnewaccbtn;
	}
	
	public WebElement getFirstName() {
		return firstname;
	}
	
	public WebElement  getSurName() {
		return surname;
	}
	
	public WebElement getMobileNo() {
		return mobileNo;
			
	}
	public WebElement getNewPassword() {
		return newpassword;
	}
	
	public WebElement getDate() {
		return date;
	}
	
	public WebElement  getMonth() {
		return month;
	}
	
	public WebElement  getYear() {
		return year;
		
	}
	public WebElement  getGender() {
		return gender;
	}
	
	public WebElement getSignUpBtn() {
		return signup;
	}
}
