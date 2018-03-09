package com.practice.seleniumweb;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGSample {

	public WebDriver driver;
	static final Logger logger = Logger.getLogger(MyFirstCase.class);

	@Test

	public void main() {
		BasicConfigurator.configure();
		logger.debug("TestNGSample: main() Started.");
		// Find the element that's ID attribute is 'account'(My Account)

		driver.findElement(By.id("account")).click();

		// Find the element that's ID attribute is 'log' (Username)

		// Enter Username on the element found by above desc.

		driver.findElement(By.id("log")).sendKeys("testuser_1");

		// Find the element that's ID attribute is 'pwd' (Password)

		// Enter Password on the element found by the above desc.

		driver.findElement(By.id("pwd")).sendKeys("Test@123");

		// Now submit the form. WebDriver will find the form for us from the element

		driver.findElement(By.id("login")).click();

		// Print a Log In message to the screen

		logger.debug(" Login Successfully, now it is the time to Log Off buddy.");

		// Find the element that's ID attribute is 'account_logout' (Log Out)

		driver.findElement(By.id("account_logout"));
		logger.debug("TestNGSample: main() End.");

	}

	@BeforeMethod

	public void beforeMethod() {
		logger.debug("TestNGSample: beforeMethod() Start.");
		// Create a new instance of the Firefox driver

		System.setProperty("webdriver.chrome.driver", "C:\\sample\\test\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();

		// Put a Implicit wait, this means that any search for elements on the page
		// could take the time the implicit wait is set for before throwing exception

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Launch the Online Store Website

		driver.get("http://store.demoqa.com/");
		logger.debug("TestNGSample: beforeMethod() End.");

	}

	@AfterMethod

	public void afterMethod() {
		logger.debug("TestNGSample: afterMethod() Start.");
		// Close the driver

		driver.quit();
		logger.debug("TestNGSample: afterMethod() End.");
	}

}