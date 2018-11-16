package org.actiTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by ganesh on 13-11-2018.
 */
public class implicitWait
{
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://demo.actitime.com"); //implicit wait works only for findElement and FindElements
        WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
        username.sendKeys("admin");
        WebElement password = driver.findElement(By.xpath("//input[@name='pwd']"));
        password.sendKeys("manager");
        WebElement loginButton = driver.findElement(By.xpath("//div[text()='Login ']"));
        loginButton.click();
        WebElement logOutButton = driver.findElement(By.id("logoutLink"));
        logOutButton.click();
    }
}
