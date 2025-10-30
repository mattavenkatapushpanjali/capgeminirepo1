package com.Gmail.Users.Runner;



import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;

import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features=".\\src\\test\\java\\com\\Gmail\\Users\\Features\\tourslogin.feature",
                           glue="com.Gmail.Users.StepDef",
                           tags="@datatable",
                        		   plugin= {"pretty","html:Reports/cucumber-reports.html"}
                         
                           
		
		)



public class TestRunner {
	
	

}
