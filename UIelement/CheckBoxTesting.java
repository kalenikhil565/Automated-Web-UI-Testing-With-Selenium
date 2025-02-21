package com.UIelement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxTesting {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://echoecho.com/htmlforms09.htm");
		
		List<WebElement> allcb = driver.findElements(By.cssSelector("input[name^='option']"));
		
		int i=1;
		for(WebElement x : allcb)
		{
			System.out.println("before status of checkbox "+i+"with title"+x.getDomAttribute("value")+ "is"+x.isSelected());
			x.click();
			System.out.println("after status of checkbox "+i+"with title"+x.getDomAttribute("value")+"is"+x.isSelected());
			i++;
		}
		

	}

}
