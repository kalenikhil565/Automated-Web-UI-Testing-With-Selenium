package com.UIelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithCheckBox {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		WebElement cb = driver.findElement(By.id("remember"));
		
		if(cb.isDisplayed())
		{
			if(cb.isEnabled())
			{
				if(cb.isSelected()==true)
				{
					Thread.sleep(2000);
					cb.click();
				}
			}
		}

	}

}
