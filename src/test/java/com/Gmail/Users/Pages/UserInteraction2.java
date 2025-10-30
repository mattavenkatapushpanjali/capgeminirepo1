package com.Gmail.Users.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

public class UserInteraction2 {
	
private WebDriver driver;
	
	private ExtentTest test;
	
	public UserInteraction2(WebDriver driver,ExtentTest test) {
		
		this.driver=driver;
		
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
	
	public void getlogin(String unm,String pwd) {
	    //WebElement username = driver.findElement(By.xpath("//input[@name='userName']"));
    //WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
    username.sendKeys(unm); 
    password.sendKeys(pwd);
}

	
	public void submit_button() {
		
		//WebElement submitButton = driver.findElement(By.xpath("//input[@name='submit']"));
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
