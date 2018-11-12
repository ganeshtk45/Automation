package org.class1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * Created by ganesh on 10-11-2018.
 */
public class doubleClick
{
        public static void main(String[] args)
        {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("F:/Selenium/test6.html");
            WebElement link = driver.findElement(By.xpath("//p[@id='demo']"));
            Actions a = new Actions(driver);
            a.doubleClick(link).perform();
    }
}
