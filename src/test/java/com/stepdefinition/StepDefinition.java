package com.stepdefinition;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import com.ipt.sept.IPTFacebookProject.Baseclass.BaseClass;
import com.pom.SingleTonDesignpattern;
import com.property.ConfigurationHelper;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends BaseClass {
	
	public  WebDriver driver= BaseClass.browserLaunch("chrome");
	
	SingleTonDesignpattern sdp= new SingleTonDesignpattern(driver);
	
	@Given("^user Launch The Url$")
	public void user_Launch_The_Url() throws Throwable {
		
		String url=ConfigurationHelper.getInstance().getUrl();
		launchUrl(url);
		implicitWait();
	}
	
	@When("user Print The Text In The Login Page")
	public void user_Print_The_Text_In_The_Login_Page() {
		printText(sdp.getLoginPage().getText());
	}

	@When("^user Enter The Username$")
	public void user_Enter_The_Username() throws Throwable {
		sleep();
		String username=ConfigurationHelper.getInstance().getUserName();
		userInput(sdp.getLoginPage().getUserName(),username);
	}
	
	@When("user enter The Incorrect Password")
	public void user_enter_The_Incorrect_Password() throws InterruptedException, IOException {
		sleep();
		String password=ConfigurationHelper.getInstance().getPassword();
		userInput(sdp.getLoginPage().getPassword(),password);  
	}

	@Then("^user Click The Login Button$")
	public void user_Click_The_Login_Button() throws Throwable {
		clickOnElement(sdp.getLoginPage().getLoginBtn());   
	}
	
	@When("user Take Screenshot of The Current WebPage")
	public void user_Take_Screenshot_of_The_Current_WebPage() throws InterruptedException, IOException {
		sleep();
		String path=ConfigurationHelper.getInstance().getScreenShot();
		takeScreenShot(path);;  
	}

	@Then("user navigate To The Login Page")
	public void user_navigate_To_The_Login_Page() throws InterruptedException {
		sleep();
		navigateBack(); 		
	}
	
	@When("user Click The Create New account Button And It Navigates To The Next Page")
	public void user_Click_The_Create_New_account_Button_And_It_Navigates_To_The_Next_Page() throws InterruptedException {
		sleep();
		clickOnElement(sdp.getCreateNewAccountPage().getCreateNewAccountBtn());
	}

	@When("user Enter The FirstName In The FirstName Field")
	public void user_Enter_The_FirstName_In_The_FirstName_Field() throws IOException {
		String firstname= ConfigurationHelper.getInstance().getfirstName();
		userInput(sdp.getCreateNewAccountPage().getFirstName(),firstname); 
	}

	@When("user Enter The SurName In The SurName Field")
	public void user_Enter_The_SurName_In_The_SurName_Field() throws IOException {
		String surname=ConfigurationHelper.getInstance().getSurName();
		userInput(sdp.getCreateNewAccountPage().getSurName(),surname);	  
	}

	@When("user Enter The Mobile Number In The MobileNumberField")
	public void user_Enter_The_Mobile_Number_In_The_MobileNumberField() throws IOException {
		String mobileno=ConfigurationHelper.getInstance().getMobileNo();
		userInput(sdp.getCreateNewAccountPage().getMobileNo(),mobileno);
	}

	@When("user Enter the NewPassword In The Password Field")
	public void user_Enter_the_NewPassword_In_The_Password_Field() throws IOException {
		String newpassword=ConfigurationHelper.getInstance().getNewPassword();
		userInput(sdp.getCreateNewAccountPage().getNewPassword(),newpassword);		
	}

	@When("user Select Day From DropDown")
	public void user_Select_Day_From_DropDown() throws IOException {
		String date= ConfigurationHelper.getInstance().getDay();
		selectDropDown(sdp.getCreateNewAccountPage().getDate(),"value", date);
	}

	@When("user Select Month From dropDown")
	public void user_Select_Month_From_dropDown() throws IOException {
		String month=ConfigurationHelper.getInstance().getMonth();
		selectDropDown(sdp.getCreateNewAccountPage().getMonth(),"index",month);
	}

	@When("user Select Year From DropDown")
	public void user_Select_Year_From_DropDown() throws IOException {
		String year=ConfigurationHelper.getInstance().getYear();	
		selectDropDown(sdp.getCreateNewAccountPage().getYear(),"text",year);
	}

	@When("user Choose Gender From Options")
	public void user_Choose_Gender_From_Options() {
		clickOnElement(sdp.getCreateNewAccountPage().getGender());
	}

	@When("user signUp And It Navigates To Another Page")
	public void user_signUp_And_It_Navigates_To_Another_Page() {
		clickOnElement(sdp.getCreateNewAccountPage().getSignUpBtn()); 
	}

	@When("user Takes ScreenShot Of The Current WebPage")
	public void user_Takes_ScreenShot_Of_The_Current_WebPage() throws InterruptedException, IOException {
		sleep();
		String path1= ConfigurationHelper.getInstance().getScreenShot1();
		takeScreenShot(path1);
	}

	@Then("user Navigate To The Login Page")
	public void user_Navigate_To_The_Login_Page() throws InterruptedException {
		sleep();
		navigateBack();
		
		
	}



}
