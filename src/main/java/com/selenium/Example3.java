package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Example3 {
	

	@Test
	public void enterText() {
		
		System.setProperty("webdriver.chrome.driver", 
				"/Users/rodrigolima/eclipse-workspace/selenium/drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement month = driver.findElement(By.xpath("//*[@id=\'month\']"));
		Select select = new Select(month);
		select.selectByValue("15");
		
		WebElement day = driver.findElement(By.xpath("//*[@id=\'day\']"));
		select = new Select(day);
		select.selectByIndex(3);
		
		WebElement year = driver.findElement(By.xpath("//*[@id=\'year\']"));
		select = new Select(year);
		select.selectByVisibleText("1993");
}

}
