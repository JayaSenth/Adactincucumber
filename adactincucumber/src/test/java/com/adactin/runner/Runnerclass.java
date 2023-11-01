package com.adactin.runner;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features ="src//test//java//com//adactin//feature",
glue ="com.adactin.stepdefinition",
plugin = {"html:Reports/Html_Report","pretty",
		"json:Reports/Json_Report.json",
		"com.cucumber.listener.ExtentCucumberFormatter:Report/Extent_Report.html"}
)
public class Runnerclass {
	
	public static WebDriver driver;
   @BeforeClass
public static void setUp() {
	  
	   System.setProperty("webdriver.chrome.driver", 
			   "C:\\Users\\HP\\eclipse-workspace\\adactincucumber\\Webdriver\\chromedriver.exe");
	  driver = new ChromeDriver();
	   driver.manage().window().maximize();
	
}
    @AfterClass
	public static void tearDown()  {
		driver.close();
		
		
	}

}
