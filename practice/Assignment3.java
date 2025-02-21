package com.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();  
	    driver.manage().window().maximize();  
	    driver.get("https://demoqa.com/browser-windows");  

	}

}
