package com.csslocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingByCssDynamicElement 
{

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		driver.findElement(By.cssSelector("input[name^='name']")).sendKeys("nikhil kale");
		driver.findElement(By.cssSelector("input[name^='Register']")).click();
		
	}

}
