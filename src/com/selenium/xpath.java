package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Created by ganesh on 01-11-2018.
 */
public class xpath
{
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://facebook.com");
        WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
        username.sendKeys("ganeshtk45@gmail.com");
        WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
        password.sendKeys("test1234");
        WebElement loginButton = driver.findElement(By.xpath("//input[@type='submit']"));
        loginButton.click();
        Thread.sleep(3000);
        WebElement navigationButton = driver.findElement(By.xpath("//div[@id='userNavigationLabel']"));
        navigationButton.click();
        Thread.sleep(3000);
        WebElement logoutOption = driver.findElement(By.xpath("//li[@class='_54ni navSubmenu _6398 _64kz __MenuItem']//a[@class='_54nc']/span/span"));
        logoutOption.click();
        driver.close();
    }
}
