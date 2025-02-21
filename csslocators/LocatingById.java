package com.csslocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingById {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.cssSelector("input#login1")).sendKeys("user123");
		driver.findElement(By.cssSelector("input#password")).sendKeys("pass@12");
		driver.close();


	}

}
