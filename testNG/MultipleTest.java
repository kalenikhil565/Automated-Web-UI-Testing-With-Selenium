package com.testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MultipleTest 
{
	WebDriver driver;
	
	@BeforeTest
	public void beforeTest()
	{
		 driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        driver.get("http://www.google.com");
	}
	
	@Test
	public void validateAboutLink()
	{
		driver.findElement(By.linkText("About")).click();
		Assert.assertTrue(driver.getTitle().contains("About"));
	}
	
	@Test
	public void validateBusinessLink()
	{
		driver.findElement(By.linkText("Business")).click();
		Assert.assertTrue(driver.getTitle().contains("Business"));
	}
	
	@Test
	public void validateTermsLink()
	{
		driver.findElement(By.linkText("Terms")).click();
		Assert.assertTrue(driver.getTitle().contains("Terms"));
	}
	
	@Test
	public void validatePrivacyLink()
	{
		driver.findElement(By.linkText("Privacy")).click();
		Assert.assertTrue(driver.getTitle().contains("Privacy"));
	}
	
	@Test
	public void validateAdvertisingLink()
	{
		driver.findElement(By.linkText("Advertising")).click();
		Assert.assertTrue(driver.getTitle().contains("Advertising"));
	}
	
	@AfterMethod
	public void afterMethod() throws InterruptedException
	{
		driver.navigate().back();
		driver.navigate().refresh();
		Thread.sleep(2000);
	}
	
	@AfterTest
	public void afterTest()
	{
		driver.close();
	}
			

}
