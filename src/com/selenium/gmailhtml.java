package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by ganesh on 31-10-2018.
 */
public class gmailhtml
{
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("F:/Selenium/test.html");
        WebElement link = driver.findElement(By.linkText("Gmail"));
        link.click();
        WebElement link1 = driver.findElement(By.partialLinkText("Gma"));
        link1.click();
    }
}
