package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by ganesh on 02-11-2018.
 */
public class actiTime
{
        public static void main(String[] args)
        {
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://demo.actitime.com");
            WebElement username = driver.findElement(By.id("username"));
            WebElement password = driver.findElement(By.xpath("//input[@name='pwd']"));
            WebElement loggedInCheckbox = driver.findElement(By.xpath("//input[@id='keepLoggedInCheckBox']"));
            WebElement loginButton = driver.findElement(By.xpath("//div[text()='Login ']"));
            WebElement version = driver.findElement(By.xpath("//nobr[contains(text(),'actiTIME')]"));
            WebElement copyrightLink = driver.findElement(By.xpath("//a[text()='actiTIME Inc.']"));
            WebElement image = driver.findElement(By.xpath("//td[@id='logoContainer']//img"));
        }
}
