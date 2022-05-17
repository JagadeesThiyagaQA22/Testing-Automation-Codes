package com.baseclass;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Class {

	private static WebDriver driver;
	private static Actions act;

	public static WebDriver getBrowser(String browser) {

		if (browser.equalsIgnoreCase("Chrome")) {

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("Firefox")) {

			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		return driver;

	}

	public static void getUrl(String url) {

		driver.get(url);

	}

	public static void clickElement(WebElement element) {

		try {
			implicitlyWait();
			element.click();

		} catch (Exception e) {

			System.out.println(e);
		}

	}

	public static void sendInput(WebElement element, String input) {

		implicitlyWait();
		element.clear();
		element.sendKeys(input);

	}

	public static void isAlertPresent() {

		try {
			driver.switchTo().alert().accept();

		} catch (NoAlertPresentException Ex) {
			System.out.println("No Alert Found");

		}
	}

	public static void back_Page() {

		try {
			driver.navigate().back();

		} catch (Exception e) {
			System.out.println(e);
			;
		}

	}

	public static void foward_Page() {

		try {
			driver.navigate().forward();

		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public static void refresh_the_Page() {

		try {
			driver.navigate().refresh();

		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public static void screenShot(String name) {

		if (name == null) {

			try {
				TakesScreenshot capture = (TakesScreenshot) driver;
				File source = capture.getScreenshotAs(OutputType.FILE);
				File destination = new File("C:\\Users\\maharajan_k\\eclipse-workspace\\demoblaze\\screenshots\\"
						+ driver.hashCode() + ".png");
				FileHandler.copy(source, destination);

			} catch (WebDriverException e) {
				System.out.println(e);

			} catch (IOException e) {
				System.out.println(e);
			}

		} else {
			try {
				TakesScreenshot capture = (TakesScreenshot) driver;
				File source = capture.getScreenshotAs(OutputType.FILE);
				File destination = new File(
						"C:\\Users\\maharajan_k\\eclipse-workspace\\demoblaze\\screenshots\\captured.png");
				FileHandler.copy(source, destination);

			} catch (WebDriverException e) {

				System.out.println(e);

			} catch (IOException e) {
				System.out.println(e);
			}

		}

	}

	public static void scroll(WebElement element) {

		try {
			implicitlyWait();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView()", element);
		} catch (Exception e) {

			System.out.println(e);
		}

	}

	public static void implicitlyWait() {

		try {
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		} catch (Exception e) {

			System.out.println(e);
		}

	}

	public static void alertKey(String text) {

		try {
			driver.switchTo().alert().sendKeys(text);
		} catch (Exception e) {

			System.out.println("No Alert Found");
		}

	}

	public static void close_Tab() {

		try {
			driver.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public static void quit_Browser() {

		try {
			driver.quit();
		} catch (Exception e) {

			System.out.println(e);
		}

	}

	public static void getPage_Url() {

		try {
			String currentUrl = driver.getCurrentUrl();
			System.out.println(currentUrl);

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void getPage_Tittle() {

		try {
			String title = driver.getTitle();
			System.out.println(title);

		} catch (Exception e) {
			System.out.println(e);

		}
	}

	public static Actions mouseOver(WebElement element) {

		try {
			implicitlyWait();
			act = new Actions(driver);
			act.moveToElement(element);

		} catch (Exception e) {
			System.out.println(e);

		}
		return act;

	}

	public static void right_Click(WebElement element) {

		try {
			implicitlyWait();
			act.click(element);

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void isEnabled_Or_Not(WebElement element) {

		try {
			implicitlyWait();
			boolean enabled = element.isEnabled();
			System.out.println("Place Order Enabled : " + enabled);

		} catch (Exception e) {
			System.out.println("Element is Not Enabled");
		}

	}

	public static void frame1() {

		try {
			driver.switchTo().frame(1);

		} catch (Exception e) {

			System.out.println("No Such Frame Found");
		}

	}

	public static void isDisplayed_Or_Not(WebElement element) {

		try {
			implicitlyWait();
			boolean displayed = element.isDisplayed();
			System.out.println("Element is Displayed : " + displayed);

		} catch (Exception e) {

			System.out.println("Element is Not Displayed");
		}
	}

	public static void isSelected_Or_Not(WebElement element) {

		try {
			implicitlyWait();
			boolean selected = element.isSelected();
			System.out.println("Element is Selected : " + selected);

		} catch (Exception e) {

			System.out.println("Element is Not Selected");
		}
	}
	
}
