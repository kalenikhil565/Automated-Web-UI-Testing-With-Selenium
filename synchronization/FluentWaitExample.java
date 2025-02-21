package com.synchronization;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class FluentWaitExample {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("Selenium");
		FluentWait <WebDriver> fw = new FluentWait(driver);
		fw.withTimeout(Duration.ofSeconds(30))
		.pollingEvery(Duration.ofNanos(1))
		.ignoring(NoSuchElementException.class)
		.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"sBQTL\"]/div[1]/span/b"))).click();
	}

}
