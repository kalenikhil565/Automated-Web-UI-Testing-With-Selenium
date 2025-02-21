package com.UIelement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithTable {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/gainers");
		
		//To print all column headings
		List<WebElement> colHeading = driver.findElements(By.xpath("//Table[@class='dataTable']/thead/tr/th"));
		
		System.out.println("all column headings are ");
		for(WebElement w : colHeading)
		{
			System.out.println(w.getText());
		}
		
		System.out.println("Total columns are "+colHeading.size());
		
		//To print total rows
		List<WebElement> rows = driver.findElements(By.xpath("//Table[@class='dataTable']/tbody/tr"));
		
		System.out.println("Total rows are "+rows.size());
		
		//To get all company names in list
		List<WebElement> companyName = driver.findElements(By.xpath("//Table[@class='dataTable']/tbody/tr/td[1]/a"));
		
		for(int i=0; i<companyName.size(); i++)
		{
			if(companyName.get(i).getText().equalsIgnoreCase("Arfin India"))
			{
				System.out.println("company found "+(i+1)+" position");
				System.out.println(driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[" + (i + 1) + "]")).getText());
				break;
				
			}
			
			
		}
		
		

		
	}

}
