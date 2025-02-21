package com.UIelement;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithMultipleTabs {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jobserve.com/in/en/Job-Search/");
		
		Thread.sleep(5000);
		driver.findElement(By.className("bannerimg_0")).click();
		Set <String> winIds = driver.getWindowHandles();
		Iterator <String> itr = winIds.iterator();
		String win1 = itr.next();
		String win2 = itr.next();
		
		driver.switchTo().window(win2);
		System.out.println("win1 title is "+driver.getTitle());
	
		driver.findElement(By.id("JobSearch_Keywords")).sendKeys("QA");
		driver.findElement(By.className("fat")).click();
		
		Thread.sleep(5000);
		 
		driver.switchTo().window(win1);
		System.out.println("win2 title is "+driver.getTitle());
		
		driver.quit();
		
		
	}

}
