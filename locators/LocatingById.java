package com.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingById {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		WebElement username = driver.findElement(By.id("login1"));
		username.sendKeys("user123");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("pass@123");
		driver.close();
		
	}

}
