package org.actiTime;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/**
 * Created by ganesh on 13-11-2018.
 */
public class fluentWait
{
    public static void main(String[] args)
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.actitime.com"); //implicit wait works only for findElement and FindElements
        WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
        username.sendKeys("admin");
        WebElement password = driver.findElement(By.xpath("//input[@name='pwd']"));
        password.sendKeys("manager");
        WebElement loginButton = driver.findElement(By.xpath("//div[text()='Login ']"));
        loginButton.click();
        FluentWait w = new FluentWait(driver);
        w.pollingEvery(250, TimeUnit.MILLISECONDS);
        w.withTimeout(10,TimeUnit.SECONDS);
        w.ignoring(NoSuchElementException.class);
        w.until(ExpectedConditions.visibilityOfElementLocated(By.id("logoutLink")));
        System.out.println(driver.getTitle());
        WebElement logOutButton = driver.findElement(By.id("logoutLink"));
        logOutButton.click();
    }
}
