package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment6  //drag and drop
{
public static void main(String[] args) {  
		
	    WebDriver driver = new ChromeDriver();  
	    driver.manage().window().maximize();  
	    driver.get("https://demoqa.com/droppable");  
	     
	    WebElement smallBox = driver.findElement(By.id("draggable"));  
	    WebElement bigBox = driver.findElement(By.id("droppable"));  
	    Actions act = new Actions(driver);  
	    act.dragAndDrop(smallBox, bigBox).perform();  
	    System.out.println("Done..");  
	}

}
