package com.locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingByTagName {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		
		//display all links in webpage
		for(WebElement x: allLinks )
		{
			System.out.println(x.getText());
		}
		
		

		
		

	}

}
