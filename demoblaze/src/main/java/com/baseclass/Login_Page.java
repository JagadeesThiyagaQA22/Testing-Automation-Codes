package com.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {

	private static WebDriver driver;

	@FindBy(id = "login2")
	private WebElement logIn;

	@FindBy(xpath = "(//input[@type='text'])[4]")
	private WebElement username;

	@FindBy(id = "loginpassword")
	private WebElement password;

	@FindBy(xpath = "(//button[@type='button'])[9]")
	private WebElement loginButton;

	@FindBy(xpath = "(//button[@type='button'])[8]")
	private WebElement closeButton;

	@FindBy(xpath = "//*[@id=\"logInModal\"]/div/div/div[1]/button/span")
	private WebElement closeSymbol;

	@FindBy(id = "logout2")
	private WebElement logOut;

	public static WebDriver getDriver() {
		return driver;
	}

	public Login_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getLogOut() {
		return logOut;
	}

	public WebElement getLogIn() {
		return logIn;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public WebElement getCloseButton() {
		return closeButton;
	}

	public WebElement getCloseSymbol() {
		return closeSymbol;
	}
}
