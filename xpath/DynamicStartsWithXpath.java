package com.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicStartsWithXpath {

	public static void main(String[] args) 
	{

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		driver.findElement(By.xpath("//input[starts-with(@name,'name')]")).sendKeys("user1234");
		driver.findElement(By.xpath("//input[starts-with(@name,'Register')]")).click();

	}

}
