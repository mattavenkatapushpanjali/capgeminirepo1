package com.Gmail.Users.Pages;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Gmail.Users.Config.Reports1;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class UserInteraction3 {
	
private WebDriver driver;

private WebDriverWait wait;
	
	private ExtentTest test;
	
	public UserInteraction3(WebDriver driver,ExtentTest test) {
		
		this.driver=driver;
		wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		this.test=test;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(name="userName")
	private WebElement username;
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(name="submit")
	private WebElement submitButton;

	
	
	public void getusername(String unm) {
		    //WebElement username = driver.findElement(By.xpath("//input[@name='userName']"));
	        username.sendKeys(unm); 
	        
	}
	
	public void getpassword(String pwd) {
	   
       //password = driver.findElement(By.xpath("//input[@name='password']"));
        password.sendKeys(pwd);
}
	
	public boolean getlogin(String unm,String pwd) {
		
		boolean actResult=true;
	    //WebElement username = driver.findElement(By.xpath("//input[@name='userName']"));
    //WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		try {
			wait.until(ExpectedConditions.visibilityOf(username));
			Reports1.generateReport(driver,test,Status.PASS,"displayed");
			wait.until(ExpectedConditions.visibilityOf(password));
			Reports1.generateReport(driver,test,Status.PASS,"displayed");
            username.sendKeys(unm); 
            password.sendKeys(pwd);
		}
		catch(TimeoutException te) {
			actResult=false;
			Reports1.generateReport(driver,test,Status.FAIL,"not displayed");
		}
		return actResult;
}

	
	public void submit_button() {
		
		//WebElement submitButton = driver.findElement(By.xpath("//input[@name='submit']"));
        submitButton.click();
	}
	
	public boolean run(String expectedResult) {
		boolean actResult = true;
		WebElement ele;
		if(expectedResult.equals("Login Successfully")) {
			 ele = driver.findElement(By.xpath("//h3[normalize-space()='Login Successfully']"));
		}else {
			ele=driver.findElement(By.xpath("//span[normalize-space()='Enter your userName and password correct']"));
		}
		
		try {
			wait.until(ExpectedConditions.visibilityOf(ele));
			if(ele.getText().matches("Login Successfully")){
	   			Reports1.generateReport(driver, test, Status.PASS, "Valid User");
	   		 }
	   		 else
	   		 {
	   			actResult = false;
	            Reports1.generateReport(driver, test, Status.FAIL, "Invalid Credentials");
	   		 }
		}catch (Exception te) {
            actResult = false;
            Reports1.generateReport(driver, test, Status.FAIL, "Wait time exceeded...");
        }
		
	   	 return actResult;
	    }
 
	
//	
//	public boolean path_login_not_successful(String matches) {
//	
//		
//boolean actResult=true;
//		
//		try {
//		
//			WebElement errorMsg = driver
//					.findElement(By.xpath("//span[normalize-space()='Enter your userName and password correct']"));
//	wait.until(ExpectedConditions.visibilityOf(errorMsg));
//    if(errorMsg.getText().matches(matches)){
//    	
//    	Reports1.generateReport(driver, test, Status.PASS, "Valid User");
//    	
//		 }
//    
//		 else
//		 {
//			actResult = false;
//       Reports1.generateReport(driver, test, Status.FAIL, "Invalid User");
//		 }
//       
//	 }
//	   catch (TimeoutException te) {
//       actResult = false;
//       Reports1.generateReport(driver, test, Status.FAIL, "password not interacting...");
//   }
//	 return actResult;
//		
//		
//		
//		}
	

 public void tearDown() {
    if (driver != null) {
        driver.quit();
    }
}

}
