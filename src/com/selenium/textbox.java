package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by ganesh on 31-10-2018.
 */
public class textbox
{
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("F:/Selenium/test2.html");
        WebElement textbox1 = driver.findElement(By.cssSelector("input[tabindex='1']"));
        textbox1.sendKeys("abc");
        WebElement textbox2 = driver.findElement(By.cssSelector("input[tabindex='2']"));
        textbox2.sendKeys("cbcbvc");
        driver.close();
    }
}
