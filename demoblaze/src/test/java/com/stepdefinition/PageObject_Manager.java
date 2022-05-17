package com.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.Cart_Page;
import com.baseclass.Home_Page;
import com.baseclass.Login_Page;

public class PageObject_Manager {

	public static WebDriver driver;

	public static Login_Page lp;
	public static Home_Page hp;
	public static Cart_Page cp;

	public PageObject_Manager(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public static Login_Page getInstance_Login() {
		lp = new Login_Page(driver);
		return lp;
	}

	public static Home_Page getInstance_Home() {
		hp = new Home_Page(driver);
		return hp;
	}

	public static Cart_Page getInstance_Cart() {
		cp = new Cart_Page(driver);
		return cp;
	}
}
