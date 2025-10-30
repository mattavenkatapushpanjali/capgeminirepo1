



package com.Gmail.Users.StepDef;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.Gmail.Users.Pages.UserInteraction2;
import com.Gmail.Users.Pages.UserInteraction3;
import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class logintours {
	
	
	WebDriver driver=Hooks.driver;
	ExtentTest test=Hooks.test;

	UserInteraction3 obj ;

    @Given("I navigate to login page")
    public void i_navigate_to_login_page() {
    	
    	driver.get("https://demo.guru99.com/test/newtours/");
    	
        obj=new UserInteraction3 (driver,test);
        
    }

   
    
    @When("I insert {string} and {string}")
    public void i_insert(String unm,String pwd) {
    	UserInteraction3 obj =new UserInteraction3 (driver,test);
   
        obj.getlogin(unm, pwd);
        
    }
    


    @And("I clicked submit button")
    public void i_clicked_signin_button() {
    	UserInteraction3 obj =new UserInteraction3(driver,test);
    	
        obj.submit_button();
    }


    @Then("Its navigated to the home page {string}")
    public void its_navigated_to_the_home_page(String result) {
    	
       UserInteraction3 obj =new UserInteraction3 (driver,test);
//    	
//    	if (result.equals("Login Successfully")) {
//    		
//    		
//			Assert.assertEquals(obj.path_login_success(), "Login Successfully");
//			System.out.println("Navigated to HomePage");
//			
//		} else if (result.equals("Enter your userName and password correct")) {
//
//			Assert.assertEquals(obj.path_login_not_successful(), "Enter your userName and password correct");
//			System.out.println("Error message appeared");
//		}
    	
       
      

       		
        	
            	try {
            	    boolean res = obj.run(result);
            	    Assert.assertTrue(res);
            	    System.out.println("Success..");
            	} catch (AssertionError ae) {
            	    System.out.println("Failure... Assertion failed: ");
            	}
        	    	
                
            }
    	
    
    

@After
public void closeBrowser() {
    obj.tearDown(); 
}







































//
//package com.Gmail.Users.StepDef;
//
//import org.openqa.selenium.WebDriver;
//import org.testng.Assert;
//
//import com.Gmail.Users.Pages.UserInteraction;
//import com.aventstack.extentreports.ExtentTest;
//
//import io.cucumber.java.After;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class logintours {
//	
//	
//	WebDriver driver=Hooks.driver;
//	ExtentTest test=Hooks.test;
//
//	UserInteraction obj ;
//
//    @Given("I navigate to login page")
//    public void i_navigate_to_login_page() {
//    	
//    	driver.get("https://demo.guru99.com/test/newtours/");
//    	
//        obj=new UserInteraction (driver,test);
//        
//    }
//
//   
//    
//    @When("I insert {string} and {string}")
//    public void i_insert(String unm,String pwd) {
//    	UserInteraction obj =new UserInteraction (driver,test);
//   
//        obj.getlogin(unm, pwd);
//        
//    }
//    
//
//
//    @And("I clicked submit button")
//    public void i_clicked_signin_button() {
//    	UserInteraction obj =new UserInteraction (driver,test);
//    	
//        obj.submit_button();
//    }
//
//
//    @Then("Its navigated to the home page {string}")
//    public void its_navigated_to_the_home_page(String result) {
//    	
//    	UserInteraction obj =new UserInteraction (driver,test);
//    	
//    	if (result.equals("Login Successfully")) {
//    		
//    		
//			Assert.assertEquals(obj.path_login_success(), "Login Successfully");
//			System.out.println("Navigated to HomePage");
//			
//		} else if (result.equals("Enter your userName and password correct")) {
//
//			Assert.assertEquals(obj.path_login_not_successful(), "Enter your userName and password correct");
//			System.out.println("Error message appeared");
//		}
//    	
//    }
//    
//
//@After
//public void closeBrowser() {
//    obj.tearDown(); 
//}
//
//
//
//








































//
//
//
////
////package com.Gmail.Users.StepDef;
////
////import org.testng.Assert;
////
////import com.Gmail.Users.Pages.UserInteraction;
////
////import io.cucumber.java.After;
////import io.cucumber.java.en.And;
////import io.cucumber.java.en.Given;
////import io.cucumber.java.en.Then;
////import io.cucumber.java.en.When;
////
////public class logintours {
////
////	UserInteraction obj = new UserInteraction();
////
////    @Given("I navigate to login page")
////    public void i_navigate_to_login_page() {
////        
////       obj.openurl();
////        
////    }
////
////   
////    
////    @When("I insert {string} and {string}")
////    public void i_insert(String unm,String pwd) {
////   
////        obj.getlogin(unm, pwd);
////        
////    }
////    
////
////
////    @And("I clicked submit button")
////    public void i_clicked_signin_button() {
////    	
////        obj.submit_button();
////    }
////
////
////    @Then("Its navigated to the home page {string}")
////    public void its_navigated_to_the_home_page(String result) {
////    	
////    	if (result.equals("Login Successfully")) {
////    		
////			Assert.assertEquals(obj.path_login_success(), "Login Successfully");
////			System.out.println("Navigated to HomePage");
////			
////		} else if (result.equals("Enter your userName and password correct")) {
////
////			Assert.assertEquals(obj.path_login_not_successful(), "Enter your userName and password correct");
////			System.out.println("Error message appeared");
////		}
////    	
////    }
////    
////
////@After
////public void closeBrowser() {
////    obj.tearDown(); 
////}
////
////    
////
//
//
//
















//
//package com.Gmail.Users.StepDef;
//
//import java.util.List;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//
//import io.cucumber.datatable.DataTable;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class logintours {
//
//    WebDriver driver;
//
//    @Given("I navigate to login page")
//    public void i_navigate_to_login_page() {
//        
//       
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://demo.guru99.com/test/newtours/"); 
//    }
//
//    @And("I entered the {string} and {string}")
//    public void i_entered_and(String unm,String pwd) {
//        WebElement username = driver.findElement(By.xpath("//input[@name='userName']"));
//        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
//
//        username.sendKeys(unm); 
//        password.sendKeys(pwd);
//
//    }
//    
//       
////	public void enterUsernamePassword(DataTable table){
////		List<List<String>> data = table.cells();
////		
//		
////		
////	
////		System.out.println(" 1st coulumn is - "+ data.get(0).get(0));
////		System.out.println(" 2nd column is  - "+ data.get(0).get(1));
////		//System.out.println(" username is - "+ data.get(1).get(0));
////		//System.out.println(" password is - "+ data.get(1).get(1));
////		//System.out.println(" username is - "+ data.get(2).get(0));
////		//System.out.println(" password is - "+ data.get(2).get(1));
////
////for (int i = 1; i < data.size(); i++) {
////        String usernameValue = data.get(i).get(0);
////        String passwordValue = data.get(i).get(1);
////
////		
////		WebElement username = driver.findElement(By.xpath("//input[@name='userName']"));
////        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
////        
////        username.sendKeys(usernameValue); 
////        password.sendKeys(passwordValue);
////
////				}
////
////    }
//
//    
//    @When("I insert {string} and {string}")
//    public void i_insert(String unm,String pwd) {
//        WebElement username = driver.findElement(By.xpath("//input[@name='userName']"));
//        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
//
//        username.sendKeys(unm); 
//        password.sendKeys(pwd);
//
//    }
//    
//
//
//    @And("I clicked submit button")
//    public void i_clicked_signin_button() {
//        WebElement submitButton = driver.findElement(By.xpath("//input[@name='submit']"));
//        submitButton.click();
//    }
//
//  //  @Then("Its navigated to the home page")
//   
//       
////
////public void its_navigated_to_the_home_page() {
////
////    WebElement successMessage = driver.findElement(By.xpath("//h3[normalize-space()='Login Successfully']"));
////    
////    Assert.assertTrue(successMessage.isDisplayed());
////    System.out.println("Navigated to home page");
////
////
////    //driver.quit();
////
////    }
////    
//    @Then("Its navigated to the home page {string}")
//    public void its_navigated_to_the_home_page(String result) {
//    	
//    	if (result.equals("Login Successfully")) {
//			WebElement success = driver.findElement(By.xpath("//h3[normalize-space()='Login Successfully']"));
//			Assert.assertEquals(success.getText(), "Login Successfully");
//			System.out.println("Navigated to HomePage");
//		} else if (result.equals("Enter your userName and password correct")) {
//			WebElement errorMsg = driver
//					.findElement(By.xpath("//span[normalize-space()='Enter your userName and password correct']"));
//			Assert.assertEquals(errorMsg.getText(), "Enter your userName and password correct");
//			System.out.println("Error message appeared");
//		}
//    	
//    }
//    
 //   @Then("Its not navigated to the home page")
    
    

//    public void its_not_navigated_to_the_home_page() {
//
//        WebElement successMessage = driver.findElement(By.xpath("//span[normalize-space()='Enter your userName and password correct']"));
//        
//        Assert.assertTrue(successMessage.isDisplayed());
//        System.out.println("not Navigated to home page");
//        
//
//        driver.quit();
//
//        }
}















//package com.Gmail.Users.StepDef;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class logintours {
//	
//	@Given("I navigate to login page")
//	public void i_navigate_to_login_page() {
//		
//		//input[@name='userName']
//		//input[@name='password']
//		
//	}
//	//When I entered "admin1" and "pass1"
//	@When("I entered {string} and {string}")
//	public void i_entered_and(String unm, String pwd) {
//		System.out.println(unm + " "+ pwd);
//	}
//	    
//	@And("I clicked submit button")
//	public void i_clicked_signin_button() {
//		
//		//input[@name='submit']
//	  
//	}
//	@Then("Its navigated to the home page")
//	public void its_navigated_to_the_home_page() {
//	  
//	}
//
//}
