package com.pom.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pom.main.TestBase;
import com.pom.pages.HomePage;
import com.pom.pages.SigninPage;

public class LoginPageTest extends TestBase {

	SigninPage loginpage;
	HomePage homepage;
	
	public LoginPageTest() {

		super();
	}

	@BeforeMethod
	public void setUp() {

		initialization();
		loginpage = new SigninPage();

	}

	@Test (priority = 1)
	public void loginPageTitleTest() {
		String title = loginpage.validatePageTitle();

		Assert.assertEquals(title, "Expedia Travel: Search Hotels, Cheap Flights, Car Rentals & Vacations");
	}
	
	@Test (priority = 2)
	public void expediaLogoImageTest() {
		
		boolean flag =loginpage.validateLogo();
		Assert.assertTrue(flag);
	}

	@Test (priority = 3)
	public void loginTest() {
		
	homepage =	loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	
	}
	
	@AfterMethod
	public void tearDown() {

		driver.quit();
	}

}