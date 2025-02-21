package com.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("user123");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("pass@123");
		driver.findElement(By.xpath("//input[@name='proceed']")).click();
	}

}
