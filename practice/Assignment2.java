package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/radio-button");
		
		WebElement rb = driver.findElement(By.className("custom-control-label"));
		if(!rb.isSelected())
		{
			rb.click();
		}
	}

}
