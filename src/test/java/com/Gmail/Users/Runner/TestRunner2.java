package com.Gmail.Users.Runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features=".\\src\\test\\java\\com\\Gmail\\Users\\Features\\tourslogin.feature",
                           glue="com.Gmail.Users.StepDef",
                           tags="@datatable",
                        		   plugin= {"pretty","html:Reports/cucumber-reports.html"}
                         
                           
		
		)



public class TestRunner2 extends AbstractTestNGCucumberTests{
	
	

}
