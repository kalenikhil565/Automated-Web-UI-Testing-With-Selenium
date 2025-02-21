package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/text-box");
		
		Thread.sleep(2000);
		driver.findElement(By.id("userName")).sendKeys("Nikhil Kale");
		driver.findElement(By.id("userEmail")).sendKeys("kalenikhil565@gmail.com");
		driver.findElement(By.id("currentAddress")).sendKeys("Tuljapur");
		driver.findElement(By.id("permanentAddress")).sendKeys("Tuljapur");
		driver.findElement(By.id("submit")).click();
	}

}
