package com.pom.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.pom.utility.TestUtility;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;

	public TestBase() {

		try {

			prop = new Properties();
			FileInputStream input = new FileInputStream(
					"D:\\eclipse-workspace\\PageObjectModel\\src\\main\\java\\com\\pom\\config\\config.properties");
			prop.load(input);

			} catch (FileNotFoundException e) {
			e.printStackTrace();
			} catch (IOException e) {
			e.printStackTrace();
			}
					}

	public static void initialization() {

		String browserName = prop.getProperty("browser");

		if (browserName.equalsIgnoreCase("firefox")) {

			System.setProperty("webdriver.gecko.driver",
					"D:\\eclipse-workspace\\PageObjectModel\\Drivers\\geckodriver.exe");

			driver = new FirefoxDriver();

		} else if (browserName.equalsIgnoreCase("chroMe")) {

			System.setProperty("webdriver.chrome.driver",
					"D:\\eclipse-workspace\\PageObjectModel\\Drivers\\chromedriver.exe");

			driver = new ChromeDriver();

		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().pageLoadTimeout(TestUtility.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(TestUtility.IMPLICIT_WAIT, TimeUnit.SECONDS);

		driver.get(prop.getProperty("url"));

	}
	
}