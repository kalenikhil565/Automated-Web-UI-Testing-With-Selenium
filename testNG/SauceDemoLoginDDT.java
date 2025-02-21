package com.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class SauceDemoLoginDDT {
    WebDriver driver;

    @BeforeTest
    public void beforeTest() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://www.saucedemo.com/");
    }

    @DataProvider(name = "dp")
    public Object[][] dp() {
        Object[][] data = new Object[6][2];

        // First row
        data[0][0] = "standard_user";
        data[0][1] = "secret_sauce";

        // Second row
        data[1][0] = "locked_out_user";
        data[1][1] = "secret_sauce";

        // Third row
        data[2][0] = "problem_user";
        data[2][1] = "secret_sauce";

        // Fourth row
        data[3][0] = "performance_glitch_user";
        data[3][1] = "secret_sauce";

        // Fifth row
        data[4][0] = "error_user";
        data[4][1] = "secret_sauce";

        // Sixth row
        data[5][0] = "visual_user";
        data[5][1] = "secret_sauce";

        return data;
    }

    @Test(dataProvider = "dp")
    public void validateLogin(String un, String pwd) {
        driver.findElement(By.id("user-name")).sendKeys(un);
        driver.findElement(By.id("password")).sendKeys(pwd);
        driver.findElement(By.id("login-button")).click();

        if (driver.getCurrentUrl().contains("inventory.html")) {
            driver.findElement(By.id("react-burger-menu-btn")).click();
            driver.findElement(By.id("logout_sidebar_link")).click();
        } else {
            String errorMsg = driver.findElement(By.xpath("//h3[@data-test='error']")).getText();
            Assert.assertTrue(errorMsg.equalsIgnoreCase("Epic sadface: Sorry, this user has been locked out."));
        }
    }

    @AfterMethod
    public void afterMethod() {
        driver.navigate().to("https://www.saucedemo.com/");
    }

    @AfterTest
    public void afterTest() {
        driver.quit();
        System.out.println("Done..");
    }
}
