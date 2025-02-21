package com.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.time.Duration;

public class FirstTest {
    WebDriver driver;

    @BeforeTest
    public void beforeTest() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void validateLogin() throws InterruptedException {
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("img.oxd-userdropdown-img")));
        driver.findElement(By.cssSelector("img.oxd-userdropdown-img")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("ul.oxd-dropdown-menu li:nth-child(4) a")).click();
        
        wait.until(ExpectedConditions.urlContains("login"));
        Assert.assertTrue(driver.getCurrentUrl().contains("login"));
    }

    @AfterTest
    public void tearDown() {
        // Close the browser
        if (driver != null) {
            driver.quit();
        }
    }
}

