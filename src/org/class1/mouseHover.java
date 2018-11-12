package org.class1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * Created by ganesh on 10-11-2018.
 */
public class mouseHover
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.vtiger.com/");
        WebElement resourceDropdown = driver.findElement(By.xpath("//a[text()='Resources']"));
        Actions a = new Actions(driver);
        a.moveToElement(resourceDropdown).perform();
        WebElement products = driver.findElement(By.xpath("//a[text()='Products']"));
        a.moveToElement(products).perform();
    }
}
