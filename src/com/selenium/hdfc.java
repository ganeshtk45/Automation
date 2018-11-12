package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

/**
 * Created by ganesh on 30-10-2018.
 */
public class hdfc
{
    public static void main(String[] args)
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hdfcbank.com/");
        WebElement loginButton = driver.findElement(By.id("loginsubmit"));
        loginButton.click();
        Set<String> awh = driver.getWindowHandles();
        for (String b:awh)
        {
          driver.switchTo().window(b);
            String title = driver.getTitle();
            System.out.println(title);
        }
        driver.quit();
    }
}
