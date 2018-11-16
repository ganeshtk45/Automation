package org.actiTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by ganesh on 15-11-2018.
 */
public class refreshPage
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.actitime.com");
        WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
        driver.navigate().refresh();
        username.sendKeys("admin");
        WebElement password = driver.findElement(By.xpath("//input[@name='pwd']"));
        password.sendKeys("manager");
        WebElement loginButton = driver.findElement(By.xpath("//div[text()='Login ']"));
        loginButton.click();
    }
}
