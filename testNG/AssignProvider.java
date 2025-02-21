package com.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class AssignProvider {
    WebDriver driver;

    @BeforeTest
    public void beforeTest() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://demowebshop.tricentis.com/");
    }

    @DataProvider(name = "dp")
    public Object[][] dp() {
        Object[][] data = new Object[2][2];

        // First row
        data[0][0] = "sampleuser1@hotmail.com";
        data[0][1] = "sample";

        // Second row
        data[1][0] = "rootuser@gmail.com";
        data[1][1] = "root123";

        return data;
    }

    @Test(dataProvider = "dp")
    public void validateLogin(String un, String pwd) {
    	driver.findElement(By.linkText("Log in")).click();
        driver.findElement(By.id("Email")).sendKeys(un);
        driver.findElement(By.id("Password")).sendKeys(pwd);
        driver.findElement(By.xpath("//input[contains(@class, 'login-button')]")).click();

        

        if (driver.getCurrentUrl().contains("tricentis.com")) 
        {
        driver.findElement(By.linkText("Log out")).click();
        } 
        else 
        {
        	String errorMsg = driver.findElement(By.cssSelector(".validation-summary-errors")).getText();
            Assert.assertTrue(errorMsg.equalsIgnoreCase("Login was unsuccessful. Please correct the errors and try again."));
        }
    }

    @AfterMethod
    public void afterMethod() {
        driver.navigate().to("https://demowebshop.tricentis.com/");
    }

    @AfterTest
    public void afterTest() {
        driver.quit();
        System.out.println("Done..");
    }
}


  



