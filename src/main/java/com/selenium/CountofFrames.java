package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;;

@Test
public class CountofFrames {

	public void enterText() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", 
			"/Users/rodrigolima/eclipse-workspace/selenium/drivers/chromedriver");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://ocs.ca/26361928/checkouts/579f13bff499982eb9960cf5b287b34e");
	List<WebElement> iframeElements = driver.findElements(By.tagName("iframe"));
	System.out.println("Total number of iframes are " + iframeElements.size());
	
	
	////body[@class='checkout--enabled']//*[@class='content']//*[@class='wrap']//*[@class='main']//*[@class='main__content']//*[@class='step']//*[@class='step__sections']//*[@class='card-fields-iframe']
}
}
