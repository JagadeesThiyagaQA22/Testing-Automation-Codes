package com.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart_Page {

	private static WebDriver driver;

	@FindBy(xpath = "/html/body/div[5]/div/div[2]/div[2]/div/a")
	private WebElement addCart_Button;

	@FindBy(xpath = "/html/body/nav/div/div/ul/li[4]/a")
	private WebElement cart;

	@FindBy(xpath = "/html/body/div[6]/div/div[1]/div/table/tbody/tr/td[4]/")
	private WebElement delete_Cart;

	@FindBy(xpath = "/html/body/div[6]/div/div[2]/button")
	private WebElement place_Order;

	@FindBy(id = "name")
	private WebElement name;
	
	@FindBy(xpath = "//input[@id='country']")
	private WebElement country;
	
	@FindBy(id = "city")
	private WebElement city;
	
	@FindBy(id = "card")
	private WebElement credit_Card;
	
	@FindBy(id = "month")
	private WebElement month;
	
	@FindBy(id = "year")
	private WebElement year;
	
	@FindBy(xpath = "/html/body/div[3]/div/div/div[3]/button[2]")
	private WebElement purchase_Button;
	
	public WebElement getCountry() {
		return country;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getCredit_Card() {
		return credit_Card;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getPurchase_Button() {
		return purchase_Button;
	}

	public WebElement getName() {
		return name;
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public Cart_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddCart_Button() {
		return addCart_Button;
	}

	public WebElement getCart() {
		return cart;
	}

	public WebElement getDelete_Cart() {
		return delete_Cart;
	}

	public WebElement getPlace_Order() {
		return place_Order;
	}

}
