package com.UIelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWithDragAndDrop {

	public static void main(String[] args) {  
		
	    WebDriver driver = new ChromeDriver();  
	    driver.manage().window().maximize();  
	    driver.get("https://jqueryui.com/droppable/");  
	    
	    WebElement frame = driver.findElement(By.className("demo-frame"));  
	    driver.switchTo().frame(frame);  
	    WebElement smallBox = driver.findElement(By.id("draggable"));  
	    WebElement bigBox = driver.findElement(By.id("droppable"));  
	    Actions act = new Actions(driver);  
	    act.dragAndDrop(smallBox, bigBox).perform();  
	    driver.switchTo().defaultContent();  
	    System.out.println("Done..");  
	}


}
