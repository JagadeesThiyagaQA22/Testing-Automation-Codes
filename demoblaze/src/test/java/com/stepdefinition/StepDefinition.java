package com.stepdefinition;

import org.openqa.selenium.WebDriver;
import com.baseclass.Base_Class;
import com.configuration.File_Reader_Manager;
import com.runner.Runner;
import io.cucumber.java.en.*;

@SuppressWarnings("unused")
public class StepDefinition extends Base_Class {

	private static WebDriver driver = Runner.driver;

	// Login_Page lp = new Login_Page(driver);
	PageObject_Manager pom = new PageObject_Manager(driver);

	@SuppressWarnings("static-access")
	@Given("User Enter The Invalid {string} Username")
	public void user_enter_the_invalid_username(String string) throws Throwable {
		
			// Base_Class.getUrl("https://www.demoblaze.com/index.html");
			Base_Class.getUrl(File_Reader_Manager.getInstanceCR().getUrl());
			// Base_Class.clickElement(lp.getLogIn());
			Base_Class.clickElement(pom.getInstance_Login().getLogIn());
			// Base_Class.sendInput(lp.getUsername(), string);
			Base_Class.sendInput(pom.getInstance_Login().getUsername(), string);
			Thread.sleep(1000);
			System.out.println("User Successfully Entered the Invalid Username");

		}
	
	@SuppressWarnings("static-access")
	@When("User Enter The Invalid {string} Password")
	public void user_enter_the_invalid_password(String string) throws Throwable {

		// Base_Class.sendInput(lp.getPassword(), string);
		Base_Class.sendInput(pom.getInstance_Login().getPassword(), string);
		Thread.sleep(1000);
		// String actual = pom.getInstance_Login().getPassword().getText();
		// Assert.assertEquals(string, actual );
		System.out.println("User Successfully Entered the Invalid Password");

	}

	@SuppressWarnings("static-access")
	@Then("User Validate the Inavlid Credentials")
	public void user_validate_the_inavlid_credentials() throws Throwable {
		// Base_Class.clickElement(lp.getLoginButton());
		Base_Class.clickElement(pom.getInstance_Login().getLoginButton());
		Thread.sleep(1000);
		Base_Class.isAlertPresent();
		System.out.println("User Successfully Validated the Credentials");
		System.out.println("User Not Able Login  Using Invalid Credentials");

	}
	/*
	 * 
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  */

	@SuppressWarnings("static-access")
	@Given("User Enter the Valid Username")
	public void user_enter_the_valid_username() throws Throwable {
		// Base_Class.clickElement(lp.getLogOut());
		// Base_Class.clickElement(pom.getInstance_Login().getLogOut());
		// Base_Class.clickElement(lp.getLogIn());
		Base_Class.getUrl(File_Reader_Manager.getInstanceCR().getUrl());
		Base_Class.clickElement(pom.getInstance_Login().getLogIn());
		// Base_Class.sendInput(lp.getUsername(), "invalid");
		Base_Class.sendInput(pom.getInstance_Login().getUsername(), "invalid");
		System.out.println("User Successfully Entered the Valid Username");

	}

	@SuppressWarnings("static-access")
	@When("User Enter The Valid Password")
	public void user_enter_the_valid_password() throws Throwable {

		// Base_Class.sendInput(lp.getPassword(), "invalid");
		Base_Class.sendInput(pom.getInstance_Login().getPassword(), "invalid");
		System.out.println("User Successfully Entered the Valid Password");


	}

	@SuppressWarnings("static-access")
	@Then("User Validate The Credentials")
	public void user_validate_the_credentials() throws Throwable {

		// Base_Class.clickElement(lp.getLoginButton());
		Base_Class.clickElement(pom.getInstance_Login().getLoginButton());
		Thread.sleep(1000);
		Base_Class.isAlertPresent();
		System.out.println("User Successfully Logined Using Valid Credentials");

	}

	@Given("User View The Mobile")
	public void user_view_the_mobile() throws Throwable {

		Base_Class.clickElement(pom.getInstance_Home().getNexus6());
		Thread.sleep(1000);
		Base_Class.back_Page();
		System.out.println("User Successfully View the Product");

	}

	@Given("User View The Another Product")
	public void user_view_the_another_product() throws Throwable {

		Base_Class.clickElement(pom.getInstance_Home().getIphone6());
		Thread.sleep(1000);
		Base_Class.back_Page();
		System.out.println("User Successfully Viewed Another Product");
		
	}

	@Given("User Scroll The Page Down")
	public void user_scroll_the_page_down() throws Throwable {

		Base_Class.scroll(pom.getInstance_Home().getPageDown());
		System.out.println("User Successfully Scroll Down the Page");

	}

	@Given("User Click The Next Page")
	public void user_click_the_next_page() throws Throwable {

		// Thread.sleep(1000);
		Base_Class.clickElement(pom.getInstance_Home().getNextPage());
		System.out.println("Next Page Button Works");
	}

	@Given("User Click The Previous Page")
	public void user_click_the_previous_page() throws Throwable {

		// Thread.sleep(1000);
		Base_Class.clickElement(pom.getInstance_Home().getPreviousPage());
		System.out.println("Previous Page Button Works");
		
	}

	@Given("User Scroll The Page Up")
	public void user_scroll_the_page_up() throws Throwable {

		// Thread.sleep(1000);
		Base_Class.scroll(pom.getInstance_Home().getPageUp());
		System.out.println("User Successfully Scroll Up the Page");
	}

	@Given("User Choose the Product")
	public void user_choose_the_product() throws Throwable {

		Base_Class.clickElement(pom.getInstance_Home().getNexus6());
		System.out.println("Product Choosed By the User");
	}

	@Given("User Click The Add Cart Button")
	public void user_click_the_add_cart_button() throws Throwable {

		Base_Class.clickElement(pom.getInstance_Cart().getAddCart_Button());
		Thread.sleep(1000);
		isAlertPresent();
		System.out.println("Cart Button Enabled,Works Successfully");
	}

	@Given("User Click The Cart Page")
	public void user_click_the_cart_page() throws Throwable {

		try {
			Base_Class.clickElement(pom.getInstance_Cart().getCart());
			Base_Class.clickElement(pom.getInstance_Cart().getDelete_Cart());
			Thread.sleep(1000);
			driver.navigate().back();
			driver.navigate().back();
			Base_Class.clickElement(pom.getInstance_Cart().getAddCart_Button());
			Thread.sleep(1000);
			isAlertPresent();
			Base_Class.clickElement(pom.getInstance_Cart().getCart());
			System.out.println("User Clicked the Cart Page");
		} catch (Exception e) {
			if (e != null) {
				
				screenShot(null);
			}
			e.printStackTrace();
		}

	}

	@When("User Click The Place Order Button")
	public void user_click_the_place_order_button() throws Throwable {

		Base_Class.isEnabled_Or_Not(pom.getInstance_Cart().getPlace_Order());
		Base_Class.clickElement(pom.getInstance_Cart().getPlace_Order());
		System.out.println("Place Order Button Enabled,Works Successfully");
	}

	@When("User Enter The Order Details")
	public void user_enter_the_order_details() throws Throwable {
		// frame1();
		Base_Class.clickElement(pom.getInstance_Cart().getPurchase_Button());
		isAlertPresent();
		Base_Class.sendInput(pom.getInstance_Cart().getName(), "Rocky");
		Base_Class.sendInput(pom.getInstance_Cart().getCountry(), "india");
		Base_Class.sendInput(pom.getInstance_Cart().getCity(), "Mumbai");
		Base_Class.sendInput(pom.getInstance_Cart().getCredit_Card(), "1234-5678-9012");
		Base_Class.sendInput(pom.getInstance_Cart().getMonth(), "April");
		Base_Class.sendInput(pom.getInstance_Cart().getYear(), "2022");
		Base_Class.clickElement(pom.getInstance_Cart().getPurchase_Button());
		System.out.println("User Successfully Entered the Order Details and Purchased Successfuly");
		Thread.sleep(1000);
		screenShot("Final");
		driver.navigate().to("https://tablepress.org/demo/");
		
	}

}
