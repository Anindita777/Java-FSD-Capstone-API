package com.dell.webservice.ui;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CuisinePageTest {
	
	String driverPath = "C:\\Users\\pandaa7\\eclipse-projects\\java-fsd-capstone-assessment-foodbox\\java-fsd-capstone-assessment-foodbox\\chromedriver\\chromedriver.exe";
	ChromeDriver driver;
	String baseUrl = "http://localhost:4200/";
	
	@Test
	void testCuisineUrl() {
		String siteUrl = baseUrl+"cuisines";
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.get(siteUrl);
		assertEquals(siteUrl, driver.getCurrentUrl());
	}
	
	@Test
	void testExplore_success() {
		String siteUrl = baseUrl+"cuisines";
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.get(siteUrl);
		WebElement explore = driver.findElementByXPath("/html/body/app-root/app-cuisines/div/table/tbody/tr[1]/td[4]/div/div/a");
		explore.click();
		siteUrl = baseUrl + "products?category=Mughlai";
		assertEquals(siteUrl,driver.getCurrentUrl());
	}

}
