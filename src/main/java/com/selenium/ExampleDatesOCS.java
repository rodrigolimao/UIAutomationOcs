package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

@Test
public class ExampleDatesOCS {
	
	public void enterText() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"/Users/rodrigolima/eclipse-workspace/selenium/drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.ocs.ca");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		WebElement day = driver.findElement(By.xpath("//*[@id=\'dob__day\']"));
		Select select = new Select(day);
		select.selectByValue("15");
		
		WebElement month = driver.findElement(By.xpath("//*[@id=\'dob__month\']"));
		select = new Select(month);
		select.selectByValue("2");
		
		WebElement year = driver.findElement(By.xpath("//*[@id=\'dob__year\']"));
		select = new Select(year);
		select.selectByValue("1993");
		
		//Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id='shopify-section-overlay']/div/section/div[1]/div[2]/form/p[2]/button")).click();
		
		//Thread.sleep(1000);
	
		driver.findElement(By.xpath("//*[@id='shopify-section-overlay']/div/section/div[2]/form/div[1]/div/p[3]/label/span")).click();
		driver.findElement(By.xpath("//*[@id='shopify-section-overlay']/div/section/div[2]/form/div[2]/p[1]/button")).click();
		
		//Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id='shopify-section-overlay']/div/section/div[4]/div[2]/button")).click();
	
		//choosing Cannabis
		
		WebElement headerCannabis = driver.findElement(By.xpath("//*[@id=\'shopify-section-en-header\']/div/div[2]/div/div[1]/div[1]/nav/ul/li[1]"));
		Actions action = new Actions(driver);
		action.moveToElement(headerCannabis).build().perform();

		Thread.sleep(2000);
		
		//clicking indica dominant
		driver.findElement(By.xpath("//*[@id=\"shopify-section-en-header\"]/div/div[2]/div/div[1]/div[1]/nav/ul/li[1]/div/div[2]/ul[1]/li[1]/div/div/ul/li[1]/a/span[1]")).click();
	
		Thread.sleep(1600);
		
//		//Sorting low to high and then choosing Afghan Kush
//		driver.findElement(By.xpath("//span[contains(text(),'Sort')]")).click();
//		driver.findElement(By.xpath("//label[contains(text(),'THC %: High to Low')]")).click();;
//		Thread.sleep(1500);
//		driver.findElement(By.xpath("//h3[contains(text(),'MK Ultra')]")).click();
		
		driver.findElement(By.xpath("//h3[contains(text(),'Afghan Kush')]")).click();
		
		//choosing one gram
		WebElement oneGram = driver.findElement(By.xpath("//span[contains(text(),'1g')]"));
		WebElement threeGrams = driver.findElement(By.xpath("//span[contains(text(),'3.5g')]"));
		
		//checking if 1gram is available
		if (oneGram.isDisplayed()) {
			oneGram.click();
		} else {
			threeGrams.click();
		}
		
		//add to the bag
		driver.findElement(By.xpath("//*[@id=\'product_2108889368396_pdp\']/button")).click();
		
		//view my bag
		driver.findElement(By.xpath("//*[@id=\'product_2108889368396_pdp\']/button/span[1]")).click();
		driver.findElement(By.xpath("//*[@id=\'shopify-section-en-header\']/div/div[2]/div/div[2]/div[2]/div/div/div[2]")).click();
		
		Thread.sleep(1890);
		
		//checking age
//		driver.findElement(By.xpath("//*[@class='cart__confirmation']//*[@id='age_confirm--flyout']")).click();
		driver.findElement(By.xpath("//body[@class='header--sticky body--freeze']/div/div[@id='flyout--overlay']/div[@id='flyout--cart']/form[@class='flyout--cart-form']/div[@class='cart__bottom']/div[@class='cart__totals']/div[@class='cart__confirmation']/fieldset/label[1]/span[1]")).click();
		
		//checking terms and condition
//		driver.findElement(By.xpath("//*[@class='cart__confirmation']//*[@id='terms_confirm--flyout']")).click();
		driver.findElement(By.xpath("//body[@class='header--sticky body--freeze']/div/div[@id='flyout--overlay']/div[@id='flyout--cart']/form[@class='flyout--cart-form']/div[@class='cart__bottom']/div[@class='cart__totals']/div[@class='cart__confirmation']/fieldset/label[2]/span[1]")).click();
		
		Thread.sleep(1390);
		
		//checkout 
		driver.findElement(By.xpath("//*[@id=\"flyout--cart\"]/form/div[3]/div[2]/div[3]/button[2]")).click();
		
		//Filling the address
		driver.findElement(By.xpath("//*[@id=\"checkout_email\"]")).sendKeys("test@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"checkout_shipping_address_first_name\"]")).sendKeys("Rodrigo");
		driver.findElement(By.xpath("//*[@id=\"checkout_shipping_address_last_name\"]")).sendKeys("Lima");
		driver.findElement(By.xpath("//*[@id=\"checkout_shipping_address_address1\"]")).sendKeys("28 Sandrift Drive");
		driver.findElement(By.xpath("//*[@id=\"checkout_shipping_address_city\"]")).sendKeys("Toronto");
		driver.findElement(By.xpath("//*[@id=\"checkout_shipping_address_zip\"]")).sendKeys("L4M5C1");
		driver.findElement(By.xpath("//*[@id=\"checkout_shipping_address_phone\"]")).sendKeys("7055001525");
		
		//Proceeding to the shipment process
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[2]/div/form/div[2]/button")).click();
		
		Thread.sleep(2000);
		
		//Continue to payment
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[2]/div/form/div[2]/button")).click();
		
		Thread.sleep(2000);
		
		//Switching frame and filing the number field of the credit card
//		WebElement iframeElement = driver.findElement(By.className("card-fields-iframe"));
//		driver.switchTo().frame(iframeElement);
		driver.switchTo().frame(0);
		
		//Filling the credit card number
		driver.findElement(By.xpath("//*[@id=\"number\"]")).sendKeys("4554677589449008");
		
		Thread.sleep(1000);
		
		//Switching frames and updating the name field of the credit card 
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Rodrigo Lima");
		
		//Switching frames and updating the date field of the credit card 
		driver.switchTo().defaultContent();
		driver.switchTo().frame(2);
		driver.findElement(By.xpath("//*[@id=\"expiry\"]")).sendKeys("08/2008");
		
		//Switching frames and updating security code field of the credit card
		driver.switchTo().defaultContent();
		driver.switchTo().frame(3);
		driver.findElement(By.xpath("//*[@id=\"verification_value\"]")).sendKeys("899");
		
		driver.switchTo().defaultContent();
		
		
		
	}
		
}
