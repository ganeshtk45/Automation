package org.class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

/**
 * Created by ganesh on 12-11-2018.
 */
public class findElements
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://flipkart.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@class='_3Njdz7']/button")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[text()='Electronics']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@title='Mobiles']")).click();
        Thread.sleep(3000);
        List<WebElement> a = driver.findElements(By.xpath("//div[contains(text(),'From ')]"));
        System.out.println(a.size());
        for (WebElement b:a)
        {
            System.out.println(b.getText());
        }
    }
}
