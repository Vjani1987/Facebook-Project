package com.BasicFacebookTest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.ipt.sept.IPTFacebookProject.Baseclass.BaseClass;
import com.pom.SingleTonDesignpattern;
import com.property.ConfigurationHelper;

public class Facebook extends BaseClass {
	public static WebDriver driver=null;
	public static void main(String[] args) throws IOException, InterruptedException {
		
		String browser=ConfigurationHelper.getInstance().getBrowser();		
		driver= browserLaunch(browser);
		
		SingleTonDesignpattern sdp= new SingleTonDesignpattern(driver);
		
		String url=ConfigurationHelper.getInstance().getUrl();
		launchUrl(url);
		implicitWait();
		
		printText(sdp.getLoginPage().getText());
		
		sleep();	
		String username=ConfigurationHelper.getInstance().getUserName();
		userInput(sdp.getLoginPage().getUserName(),username);
		isEnabled(sdp.getLoginPage().getUserName());
		
		sleep();		
		String password=ConfigurationHelper.getInstance().getPassword();
		userInput(sdp.getLoginPage().getPassword(),password);
		
		sleep();
		
		clickOnElement(sdp.getLoginPage().getLoginBtn());
		
		sleep();
		String path=ConfigurationHelper.getInstance().getScreenShot();
		takeScreenShot(path);
	
		sleep();
		navigateBack();
			
		clickOnElement(sdp.getCreateNewAccountPage().getCreateNewAccountBtn());
	
		String firstname= ConfigurationHelper.getInstance().getfirstName();
		userInput(sdp.getCreateNewAccountPage().getFirstName(),firstname);
		
		String surname=ConfigurationHelper.getInstance().getSurName();
		userInput(sdp.getCreateNewAccountPage().getSurName(),surname);
		
		String mobileno=ConfigurationHelper.getInstance().getMobileNo();
		userInput(sdp.getCreateNewAccountPage().getMobileNo(),mobileno);
		
		String newpassword=ConfigurationHelper.getInstance().getNewPassword();
		userInput(sdp.getCreateNewAccountPage().getNewPassword(),newpassword);
		
		String date= ConfigurationHelper.getInstance().getDay();
		selectDropDown(sdp.getCreateNewAccountPage().getDate(),"value", date);
		
		String month=ConfigurationHelper.getInstance().getMonth();
		selectDropDown(sdp.getCreateNewAccountPage().getMonth(),"index",month);
		
		String year=ConfigurationHelper.getInstance().getYear();	
		selectDropDown(sdp.getCreateNewAccountPage().getYear(),"text",year);		
		
		clickOnElement(sdp.getCreateNewAccountPage().getGender());
				
		clickOnElement(sdp.getCreateNewAccountPage().getSignUpBtn());
		
		sleep();
		String path1= ConfigurationHelper.getInstance().getScreenShot1();
		takeScreenShot(path1);
		
		sleep();
		navigateBack();
		
		
	}
}



