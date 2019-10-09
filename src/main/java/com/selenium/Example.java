package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Example {

	@Test
	public void enterData() {
		System.setProperty("webdriver.chrome.driver", "/Users/rodrigolima/eclipse-workspace/selenium/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");	
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("test@gmail.com");
		
		
	}
}
