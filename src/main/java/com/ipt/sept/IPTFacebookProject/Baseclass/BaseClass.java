package com.ipt.sept.IPTFacebookProject.Baseclass;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	
	//WebDriver;
	public static WebDriver driver=null;
	public static WebDriver browserLaunch(String browser) {
		
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\WELCOME\\eclipse-workspace\\IPTFacebookProject\\Driver\\chromedriver.exe");
			 driver= new ChromeDriver();	
		
		}else if (browser.equalsIgnoreCase("edge")) {
			 driver= new EdgeDriver();	
		
		} else if (browser.equalsIgnoreCase("gecko")) {
			driver= new FirefoxDriver();
		
		} else {
			System.out.println("Invalid browser");
		} 
		driver.manage().window().maximize();
		return driver;
	}
	
	//getUrl()
	public static void launchUrl(String url) {
		driver.get(url);
	}
	
	//sendKeys();
	public static void userInput(WebElement element, String value) {
	element.sendKeys(value);
		
	}
	
	//click();
	public static void clickOnElement(WebElement element) {
	element.click();
	}

	//getText();
	public static void printText(WebElement element) {
	String text= element.getText();
	System.out.println("The text is :"+ text);	
	}
	
	//TakeScreenshot();
		public static void takeScreenShot(String path) throws IOException  {
		TakesScreenshot ts= (TakesScreenshot)driver;
		File source= ts.getScreenshotAs(OutputType.FILE);
		File target= new File(path);
		FileUtils.copyFile(source,target);
		}
	
	//boolean methods-isEnabled();
	public static void isEnabled(WebElement element) {
	boolean enable= element.isEnabled();
	System.out.println("Check whether element is enabled :"+enable);	
	}
	
	//boolean methods- isDisplayed();
	public static void isDisplayed(WebElement element) {
	boolean display=element.isDisplayed();
	System.out.println("Check whether element is displayed :"+display);
	}
	
	//boolean methods- isSelected();
	public static void isSelected(WebElement element) {
	boolean select=element.isSelected();
	System.out.println("Check whether element is selected :"+select);
	}
	
	public static void sleep() throws InterruptedException {
	Thread.sleep(3000);
	}
	
	//clear()
	public static void clearMethod(WebElement element) {
	element.clear();
	}
	
	//close();
	public static void close() {
	driver.close();
	}
	
	//quit();
	public static void quit() {
		driver.quit();
	}
	//implicitwait();
	public static void implicitWait() {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	//getTitle();
	public static void printTitle() {
	String title= driver.getTitle();
	System.out.println("The page title is :"+ title);
	}
	
	//getUrl();
	public static void printUrl() {
	String url=driver.getCurrentUrl();
	System.out.println("The pagr Url is :"+ url);
	}
	
	//Alert():-accept & dismiss
	public static void alert(String alert) {
	Alert a=driver.switchTo().alert();
	
	if (alert.equalsIgnoreCase("ok")) {
		a.accept();
	
	}else if (alert.equalsIgnoreCase("cancel")) {
	a.dismiss();	
	}
	}
	
	// alert sendKeys();
	public static void alertInput(String value) {
		driver.switchTo().alert().sendKeys(value);
	}
	
	//navigate-back;
	public static void navigateBack() {
		driver.navigate().back();
	}
	
	//To
	public static void navigateTo(String url) {
		driver.navigate().to(url);
	}
	
	//refresh;
	public static void refresh() {
		driver.navigate().refresh();
	}
	
	//dropdown-select();
	public static void selectDropDown(WebElement element, String options, String value) {
		Select s= new Select(element);
		if (options.equalsIgnoreCase("value")) {
			s.selectByValue(value);
			
		}else if (options.equalsIgnoreCase("text")) {
			s.selectByVisibleText(value);
			
		}else if (options.equalsIgnoreCase("index")) {
			int n= Integer.parseInt(value);
			s.selectByIndex(n);
			
		}else {
		System.out.println("Invalid select");	
		}
	}
	
	//dropdown- deselect
	public static void deselect(WebElement element, String options, String value) {
		Select s= new Select(element);
		
		if(options.equalsIgnoreCase("value")) {
			s.deselectByValue(value);
		
		}else if(options.equalsIgnoreCase("text")) {
			s.deselectByVisibleText(value);
		
		}else if(options.equalsIgnoreCase("index")) {
			int n=Integer.parseInt(value);
			s.deselectByIndex(n);
		
		}else {
			System.out.println("Invalid Deselect");
		}
	}
	//actions();
	public static void actions(WebElement element, String options) {
		Actions ac= new Actions(driver);
		if(options.equalsIgnoreCase("moveToElement")) {
			ac.moveToElement(element).perform();
			
	}else if(options.equalsIgnoreCase("right click")) {
		ac.contextClick(element).perform();
		
	}else if(options.equalsIgnoreCase("click")) {
		ac.click(element).perform();
			
	}else if(options.equalsIgnoreCase("double click")) {
		ac.doubleClick(element).perform();
		
	}else {
		System.out.println("Invalid actions");
	}
	}
	
	
	
}
