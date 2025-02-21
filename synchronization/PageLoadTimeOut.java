package com.synchronization;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageLoadTimeOut {

	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

        driver.navigate().to("http://www.google.com");
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

        driver.navigate().to("http://www.saucedemo.com");
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

        driver.navigate().back();
        Thread.sleep(2000);

        driver.navigate().forward();
        driver.navigate().refresh();

	}

}
