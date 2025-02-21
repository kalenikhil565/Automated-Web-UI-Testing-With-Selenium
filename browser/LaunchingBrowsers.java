package com.browser;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchingBrowsers 
{
		public static void main(String[] args)
		{
	        System.out.println("Enter browser choice:\n 1. Chrome \n 2. Edge \n 3. Firefox");
	        
	        // Scanner for user input
	        Scanner sc = new Scanner(System.in);
	        int choice = sc.nextInt();
	       WebDriver driver;

	        // Switch statement for browser choice
	        switch (choice) 
	        {
	            case 1:
	                driver = new ChromeDriver();
	                driver.get("http://www.google.com");
	                driver.manage().window().maximize();
	                break;

	            case 2:
	               
	                driver = new EdgeDriver();
	                driver.get("http://www.google.com");
	                driver.manage().window().maximize();
	                break;

	            case 3:
	               
	                driver = new FirefoxDriver();
	                driver.get("http://www.google.com");
	                driver.manage().window().maximize();
	                break;

	            default:
	                System.out.println("Invalid choice. Please select a valid browser option.");
	                break;
	        }
	        sc.close();
	        System.out.println("Done.");
	    }

}
