package com.UIelement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingWithDropdown {

	public static void main(String[] args) 
	{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://echoecho.com/htmlforms11.htm#google_vignette");
	
	WebElement selectchoice = driver.findElement(By.name("mydropdown"));
	Select choice = new Select(selectchoice);
	
	System.out.println("default selected option "+choice.getFirstSelectedOption().getText());
	
	choice.selectByVisibleText("Hot Bread");
    //choice.selectByIndex(2);    //to select Hot Bread using index
	//choice.selectByValue("Cheese");     //select using value
	
	System.out.println("selected option "+choice.getFirstSelectedOption().getText());
	
	//TO get all options from dropdown
	List<WebElement> allchoice = choice.getOptions();
	System.out.println("all options in dopdown");
	for(WebElement w : allchoice)
	{
		System.out.println(w.getText());
	}
	

	}

}
