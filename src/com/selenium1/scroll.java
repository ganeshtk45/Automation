package com.selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by ganesh on 05-11-2018.
 */
public class scroll
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://facebook.com/");
        WebElement copyright = driver.findElement(By.xpath("//span[text()=' Facebook © 2018']"));
        int y = copyright.getLocation().getY();
        int x = copyright.getLocation().getX();
        System.out.println("X axis is " + x + " y axis is " + y);
        JavascriptExecutor j1 = (JavascriptExecutor) driver;
        //j1.executeScript("window.scrollBy(183,818)");
        //j1.executeScript("window.scrollBy("+x+","+y+")");
        for (int i =1;i<5;i++)
        {
            j1.executeScript("window.scrollBy(0,18)");
            Thread.sleep(1000);
        }
    }
}
