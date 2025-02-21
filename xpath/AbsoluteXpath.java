package com.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXpath 
{

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.xpath("html/body/div[1]/div[1]/div[1]/div[2]/form/div[1]/div[2]/div[1]/div[2]/input")).sendKeys("user1234");

	}

}
