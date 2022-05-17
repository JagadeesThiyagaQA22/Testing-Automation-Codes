package com.runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import com.baseclass.Base_Class;
import com.configuration.File_Reader_Manager;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\maharajan_k\\eclipse-workspace\\demoblaze\\src\\test\\java\\demoblaze\\features\\demoblaze.feature", 
					 glue = {"com.stepdefinition" },
				   plugin = { "html:Report/cucumber.html" } )
// tags = "@Regression"
public class Runner {

	public static WebDriver driver;

	@SuppressWarnings("static-access")
	@BeforeClass
	public static void setUp() {
		// driver = Base_Class.getBrowser("chrome");
		driver = Base_Class.getBrowser(File_Reader_Manager.getInstanceCR().getBrowser());
		
	}
	
}
