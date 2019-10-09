package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ExampleMouseOver {
	

	@Test
	public void enterText() {
		
		System.setProperty("webdriver.chrome.driver", 
				"/Users/rodrigolima/eclipse-workspace/selenium/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.actitime.com/download");
		WebElement features = driver.findElement(By.xpath("/html/body/header/div/nav/ul/li[2]/a"));

		Actions action = new Actions(driver);
		
		action.moveToElement(features).build().perform();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.findElement(By.linkText("Work Scope Management")).click();
}
	
}

