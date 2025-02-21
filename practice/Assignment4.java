package com.practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");

		// First tab
		driver.findElement(By.id("tabButton")).click();
		Thread.sleep(2000);

		Set<String> winId1 = driver.getWindowHandles();
		Iterator<String> itr1 = winId1.iterator();
		String win1 = itr1.next();
		String win2 = itr1.next();

		driver.switchTo().window(win2);
		System.out.println("First tab: " + driver.findElement(By.id("sampleHeading")).getText());
		driver.close();
		driver.switchTo().window(win1);

		// Second tab
		driver.findElement(By.id("windowButton")).click();
		Thread.sleep(2000);

		Set<String> winId2 = driver.getWindowHandles();
		Iterator<String> itr2 = winId2.iterator();
		String win3 = itr2.next();
		String win4 = itr2.next();

		driver.switchTo().window(win4);
		System.out.println("Second tab: " + driver.findElement(By.id("sampleHeading")).getText());
		driver.close();
		driver.switchTo().window(win3);

		// Third tab (Message Window)
		driver.findElement(By.id("messageWindowButton")).click();
		Thread.sleep(2000);

		Set<String> winId3 = driver.getWindowHandles();
		Iterator<String> itr3 = winId3.iterator();
		String win5 = itr3.next();
		String win6 = itr3.next();

		Alert a = driver.switchTo().alert();
		System.out.println("Third Tab: " + a.getText());
		driver.close();
		driver.switchTo().defaultContent();

		driver.quit();
	}
}
