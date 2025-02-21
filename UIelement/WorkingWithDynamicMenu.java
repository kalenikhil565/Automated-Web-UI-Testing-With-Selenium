package com.UIelement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWithDynamicMenu {

	public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://istqb.in");

        WebElement SPECIALIST_Menu = driver.findElement(By.linkText("SPECIALIST"));
        Actions act = new Actions(driver);
        act.moveToElement(SPECIALIST_Menu).perform();

        List<WebElement> SPECIALIST_options = driver.findElements(By.xpath("//*[@id=\"sp-menu\"]/div/nav/ul/li[7]/div/div/ul/li/a")); 

        for (WebElement w : SPECIALIST_options) {
            System.out.println(w.getText()); 
        }

    }

}
