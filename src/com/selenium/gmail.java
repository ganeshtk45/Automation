package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by ganesh on 30-10-2018.
 */
public class gmail
{
    public static void main(String[] args)
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://accounts.google.com/");
        WebElement username = driver.findElement(By.id("identifierId"));
        username.sendKeys("ganeshtk45@gmail.com");
        WebElement NextButton = driver.findElement(By.id("identifierNext"));
        NextButton.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement GPassword = driver.findElement(By.cssSelector("input[type='password']"));
        GPassword.sendKeys("test");
        driver.close();
    }
}
