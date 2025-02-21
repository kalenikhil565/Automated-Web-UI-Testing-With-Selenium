package com.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		
		  // Print the page source of the Google page
        System.out.println("Page source of Google page is: " + driver.getPageSource());

        // Print the title of the Google page
        System.out.println("Title of the Google page is: " + driver.getTitle());

        // Print the URI (current URL) of the Google page
        System.out.println("URI of Google page is: " + driver.getCurrentUrl());

        // Close the browser
        driver.close();
		
	}

}
