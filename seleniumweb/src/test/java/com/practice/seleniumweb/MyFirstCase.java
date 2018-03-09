package com.practice.seleniumweb;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstCase {
	static final Logger logger = Logger.getLogger(MyFirstCase.class);

	public static void main(String args[]) throws InterruptedException {
		BasicConfigurator.configure();
		logger.debug("Starting Chrome browser");
		System.setProperty("webdriver.chrome.driver", "C:\\sample\\test\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.co.in/");
		Thread.sleep(20000);
		logger.debug("Title " + driver.getTitle());
		if (driver != null) {
			driver.close();
		}
		logger.debug("Before Exit");
		System.exit(0);

	}

}
