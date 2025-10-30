
package com.Gmail.Users.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import com.aventstack.extentreports.ExtentTest;

public class UserInteraction {
	
	
	private WebDriver driver;
	
	private ExtentTest test;
	
	public UserInteraction(WebDriver driver,ExtentTest test) {
		
		this.driver=driver;
		this.test=test;
	}
	
//	public void openurl() {
//
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://demo.guru99.com/test/newtours/"); 
//	}
	
	
	public void getusername(String unm) {
		    WebElement username = driver.findElement(By.xpath("//input[@name='userName']"));
	        username.sendKeys(unm); 
	        
	}
	
	public void getpassword(String pwd) {
	   
        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
        password.sendKeys(pwd);
}
	
	public void getlogin(String unm,String pwd) {
	    WebElement username = driver.findElement(By.xpath("//input[@name='userName']"));
    WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
    username.sendKeys(unm); 
    password.sendKeys(pwd);
}

	
	public void submit_button() {
		
		WebElement submitButton = driver.findElement(By.xpath("//input[@name='submit']"));
        submitButton.click();
	}
	
	public String path_login_success() {
	WebElement success = driver.findElement(By.xpath("//h3[normalize-space()='Login Successfully']"));
    return success.getText();
	}
	
	public String path_login_not_successful() {
		WebElement errorMsg = driver
				.findElement(By.xpath("//span[normalize-space()='Enter your userName and password correct']"));
		return errorMsg.getText();
		}
	

 public void tearDown() {
    if (driver != null) {
        driver.quit();
    }
}

}










































//
//
//
////package com.Gmail.Users.Pages;
////
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////
////public class UserInteraction {
////	
////	
////	WebDriver driver;
////	
////	public void openurl() {
////
////        driver = new ChromeDriver();
////        driver.manage().window().maximize();
////        driver.get("https://demo.guru99.com/test/newtours/"); 
////	}
////	
////	
////	public void getusername(String unm) {
////		    WebElement username = driver.findElement(By.xpath("//input[@name='userName']"));
////	        username.sendKeys(unm); 
////	        
////	}
////	
////	public void getpassword(String pwd) {
////	   
////        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
////        password.sendKeys(pwd);
////}
////	
////	public void getlogin(String unm,String pwd) {
////	    WebElement username = driver.findElement(By.xpath("//input[@name='userName']"));
////    WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
////    username.sendKeys(unm); 
////    password.sendKeys(pwd);
////}
////
////	
////	public void submit_button() {
////		
////		WebElement submitButton = driver.findElement(By.xpath("//input[@name='submit']"));
////        submitButton.click();
////	}
////	
////	public String path_login_success() {
////	WebElement success = driver.findElement(By.xpath("//h3[normalize-space()='Login Successfully']"));
////    return success.getText();
////	}
////	
////	public String path_login_not_successful() {
////		WebElement errorMsg = driver
////				.findElement(By.xpath("//span[normalize-space()='Enter your userName and password correct']"));
////		return errorMsg.getText();
////		}
////	
////
//// public void tearDown() {
////    if (driver != null) {
////        driver.quit();
////    }
////}
////
////}
