package com.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {
	
	private static WebDriver driver;
	
@FindBy(xpath = "//*[@id=\"tbodyid\"]/div[2]/div/div/h4/a")
private WebElement nexus6;
	
@FindBy(xpath = "//*[@id=\"tbodyid\"]/div[4]/div/div/h4/a")
private WebElement iphone6;
	
@FindBy(xpath = "//*[@id=\"fotcont\"]/div[3]")
private WebElement pageDown;

@FindBy(xpath = "//*[@id=\"navbarExample\"]/ul/li[1]/a")
private WebElement pageUp;

public static WebDriver getDriver() {
	return driver;
}

public WebElement getPageUp() {
	return pageUp;
}

@FindBy(id = "next2")
private WebElement nextPage;
	
public Home_Page(WebDriver driver) {
	this.driver= driver;
	PageFactory.initElements(driver, this);
}

public WebElement getNexus6() {
	return nexus6;
}

public WebElement getIphone6() {
	return iphone6;
}

public WebElement getPageDown() {
	return pageDown;
}

public WebElement getNextPage() {
	return nextPage;
}

public WebElement getPreviousPage() {
	return previousPage;
}

@FindBy(id = "prev2")
private WebElement previousPage;

}
