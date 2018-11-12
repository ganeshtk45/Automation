package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;

/**
 * Created by ganesh on 01-11-2018.
 */
public class alert
{
        public static void main(String[] args)
        {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://facebook.com");
            WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
            username.sendKeys("ganeshtk45@gmail.com");
            WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
            password.sendKeys("test1");
            WebElement loginButton = driver.findElement(By.xpath("//input[@type='submit']"));
            loginButton.click();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            WebElement message = driver.findElement(By.xpath("//div[@class='_4rbf _53ij']"));
            message.getText();
        }
}
//The password that you've entered is incorrect. Forgotten password?