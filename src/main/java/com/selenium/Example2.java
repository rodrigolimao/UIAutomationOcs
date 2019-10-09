package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Example2 {
	
	@Test
	public void enterText() {
		
		System.setProperty("webdriver.chrome.driver", 
				"/Users/rodrigolima/eclipse-workspace/selenium/drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("test@gmail.com");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("test");
		driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys("Rodrigo Test");
		driver.findElement(By.xpath("//*[@name='lastname']")).sendKeys("Lima Test");
		driver.findElement(By.xpath("//*[@name='reg_email__']")).sendKeys("test@gmail.com");
		driver.findElement(By.xpath("//*[@name='reg_email_confirmation__']")).sendKeys("test@gmail.com");
		driver.findElement(By.xpath("//*[@name='reg_passwd__']")).sendKeys("denisdenis");
	}

}
