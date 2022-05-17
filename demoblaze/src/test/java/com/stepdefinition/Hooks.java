package com.stepdefinition;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import com.runner.Runner;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.Status;

public class Hooks {

	public static WebDriver driver = Runner.driver;

	@Before
	public void beforeHooks(Scenario scenario) {

		String name = scenario.getName();
		System.out.println("Scenario  Name  :" + name);
	}

	@After
	public void afterHooks(Scenario scenario) throws IOException, InterruptedException {

		Status status = scenario.getStatus();
		System.out.println("Scenario Status :" + status);
		Integer line = scenario.getLine();
		if (scenario.isFailed()) {
			Thread.sleep(1000);
			TakesScreenshot capture = (TakesScreenshot) driver;
			File save = capture.getScreenshotAs(OutputType.FILE);
			File save_As = new File(
					"C:\\Users\\maharajan_k\\eclipse-workspace\\demoblaze\\screenshots\\featureLine." + line + ".png");
			FileHandler.copy(save, save_As);

		}

	}
}