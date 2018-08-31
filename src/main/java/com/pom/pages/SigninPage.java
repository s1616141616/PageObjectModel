package com.pom.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pom.main.TestBase;

public class SigninPage extends TestBase {

	// Page Factory

	@FindBy(id = "header-account-menu")
	WebElement accountmenu;

	@FindBy(id = "account-signin")
	WebElement signin;

	@FindBy(id = "account-register")
	WebElement signup;
	
	@FindBy(css = "#header-logo > img")
	WebElement logo;
	
	@FindBy(xpath = "//*[@id=\"signin-loginid\"]")
	WebElement email;
	
	@FindBy(xpath = "//*[@id=\"signin-password\"]")
	WebElement password;
	
	@FindBy(xpath = "//*[@id=\"submitButton\"]")
	WebElement login;
	
	public SigninPage() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	public String validatePageTitle() {
		return driver.getTitle();
		
	}
	
	public boolean validateLogo() {
		
		return logo.isDisplayed();
	} 
	
	public HomePage login(String un, String pwd) {
		
		accountmenu.click();
		signin.click();
		email.sendKeys(un);
		password.sendKeys(pwd);
		login.click();
		
		return new HomePage();
	}
	
	
}
