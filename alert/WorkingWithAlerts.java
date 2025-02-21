package com.alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithAlerts {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.findElement(By.name("proceed")).click();
        Alert a = driver.switchTo().alert();
        String msg = a.getText();
        Thread.sleep(3000);
        System.out.println("Message displayed in Alert window is " + msg);
        a.accept();
        driver.switchTo().defaultContent();
        System.out.println("Done..");
    }
}
