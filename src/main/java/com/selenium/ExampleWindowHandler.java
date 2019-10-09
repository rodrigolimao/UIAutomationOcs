package com.selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ExampleWindowHandler {
	
	
	@Test
	public void enterText() {
		
		System.setProperty("webdriver.chrome.driver", 
				"/Users/rodrigolima/eclipse-workspace/selenium/drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.automationpractice.com/index.php");
		driver.findElement(By.xpath("//*[@id=\'social_block\']/ul/li[1]")).click();
		
		// get all windows id's
		Set<String> windowsId = driver.getWindowHandles();
		
		//iterating through id's
		Iterator<String> itr = windowsId.iterator();
		
		String parentId = itr.next();
		String childId = itr.next();
		
		//switching to child
		driver.switchTo().window(childId);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//closing driver
		driver.close();
		
		//switching to the parent window
		driver.switchTo().window(parentId);
		driver.findElement(By.xpath("//*[@id=\'footer\']/div/section[2]/div/div/ul/li/a")).click();
		
		
		
		
}
	
}
