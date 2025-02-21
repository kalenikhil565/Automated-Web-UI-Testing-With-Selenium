package com.alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentAlerts {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/alerts");

//        driver.findElement(By.id("alertButton")).click();
//        Alert a = driver.switchTo().alert();
//        String msg = a.getText();
//        Thread.sleep(3000);
//        System.out.println("Message displayed in Alert window is " + msg);
//        a.accept();
//        driver.switchTo().defaultContent();
//        System.out.println("first..");
//
//        driver.findElement(By.id("confirmButton")).click();
//        Alert a2 = driver.switchTo().alert();
//        String msg2 = a2.getText();  
//        Thread.sleep(3000);
//        System.out.println("Message displayed in Alert window is " + msg2); 
//        a2.dismiss();
//        driver.switchTo().defaultContent();
//        System.out.println("second..");
        
      driver.findElement(By.id("timerAlertButton")).click();
      Thread.sleep(5000);
      Alert a = driver.switchTo().alert();
      String msg = a.getText();
      System.out.println("Message displayed in Alert window is " + msg);
      a.accept();
      driver.switchTo().defaultContent();
      System.out.println("first..");


        
        
    }
}
