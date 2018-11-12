package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by ganesh on 31-10-2018.
 */
public class facebook
{
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://facebook.com");
        driver.findElement(By.cssSelector("input[tabindex='1']")).sendKeys("gffg");
        driver.findElement(By.cssSelector("input[tabindex='2']")).sendKeys("45454");
        driver.findElement(By.cssSelector("input[type='submit']")).click();
        driver.close();
    }
}
