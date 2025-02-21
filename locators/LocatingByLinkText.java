package com.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingByLinkText {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		//driver.findElement(By.linkText("Forgot Password?")).click();

		driver.findElement(By.partialLinkText("Forgot")).click();

		
		driver.close();
	}

}
