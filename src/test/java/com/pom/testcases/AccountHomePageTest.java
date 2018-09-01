package com.pom.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.pom.main.TestBase;
import com.pom.pages.HomePage;
import com.pom.pages.SearchCruisesPage;
import com.pom.pages.SearchFlightsPage;
import com.pom.pages.SearchHotelsPage;
import com.pom.pages.SearchRentalCarsPage;
import com.pom.pages.SigninPage;

public class AccountHomePageTest extends TestBase {

	SigninPage loginpage;
	HomePage homepage;
	SearchFlightsPage searchFlightsPage;
	SearchHotelsPage searchHotelsPage;
	SearchRentalCarsPage searchRentalCarsPage;
	SearchCruisesPage searchCruisesPage;
	
	public AccountHomePageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {

		initialization();
		loginpage = new SigninPage();
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		searchFlightsPage = new SearchFlightsPage ();
		searchHotelsPage = new SearchHotelsPage ();
		searchRentalCarsPage = new SearchRentalCarsPage ();
		searchCruisesPage = new SearchCruisesPage ();
	}

	@Test
	public void clickFlightsLinkTest() throws Exception {
		searchFlightsPage = homepage.clickonFlightsLink();
	}

	@Test
	public void clickHotelsLinkTest() throws Exception {
		searchHotelsPage = homepage.clickonHotelsLink();
	}
	
	@Test
	public void clickRentalCarsLinkTest() throws Exception {
		searchRentalCarsPage = homepage.clickonRentalCarsLink();
	}
	
	@Test
	public void clickCruisesLinkTest() throws Exception {
		searchCruisesPage = homepage.clickonCruisesLink();
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}