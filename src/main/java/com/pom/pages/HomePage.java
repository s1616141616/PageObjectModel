package com.pom.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pom.main.TestBase;

public class HomePage extends TestBase {

	@FindBy(xpath = "//a[contains(@id,'primary-header-flight')]")
	WebElement flightsLink;

	@FindBy(xpath = "//a[contains(@id,'primary-header-hotel')]")
	WebElement hotelsLink;

	@FindBy(xpath = "//a[contains(@id,'primary-header-car')]")
	WebElement carsLink;

	@FindBy(xpath = "//a[contains(@id,'primary-header-cruise')]")
	WebElement cruiseLink;

	public HomePage() {

		PageFactory.initElements(driver, this);

	}

	public SearchFlightsPage clickonFlightsLink() throws Exception {
		Thread.sleep(100000);
		flightsLink.click();
		return new SearchFlightsPage();
	}

	public SearchHotelsPage clickonHotelsLink() throws Exception {
		Thread.sleep(100000);
		hotelsLink.click();
		return new SearchHotelsPage();
	}

	public SearchRentalCarsPage clickonRentalCarsLink() throws Exception {
		Thread.sleep(100000);
		carsLink.click();
		return new SearchRentalCarsPage();
	}

	public SearchCruisesPage clickonCruisesLink() throws Exception {
		Thread.sleep(100000);
		cruiseLink.click();
		return new SearchCruisesPage();
	}

}