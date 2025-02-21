package com.UIelement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingWithListBox {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		
		 WebElement lb = driver.findElement(By.name("cars"));
	        Select cars = new Select(lb);

	        // Check if the dropdown supports multiple selections
	        if (cars.isMultiple()) {
	            cars.selectByVisibleText("Volvo");
	            cars.selectByVisibleText("Audi");

	            // Print selected options
	            System.out.println("Selected cars:");
	            List<WebElement> selectedCars = cars.getAllSelectedOptions();
	            for (WebElement w : selectedCars) {
	                System.out.println(w.getText());
	            }
	        } else {
	            System.out.println("Dropdown is not multi-select.");
	        }
	}

}
