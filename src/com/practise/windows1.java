package com.practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

/**
 * Created by ganesh on 05-11-2018.
 */
public class windows1
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://flipkart.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@class='_3Njdz7']/button")).click();
        Thread.sleep(2000);
        WebElement searchTextBox = driver.findElement(By.xpath("//input[@title='Search for products, brands and more']"));
        searchTextBox.sendKeys("redmi6");
        Thread.sleep(1000);
        WebElement dropdownResult = driver.findElement(By.xpath("//div[text()='in Mobiles']/parent::div/parent::a"));
        dropdownResult.click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[text()='Redmi 6 (Black, 32 GB)']")).click();
        String productList = driver.getWindowHandle();
        for (String a:driver.getWindowHandles())
        {
            driver.switchTo().window(a);
        }
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//div[@class='_1k1QCg _3QNwd7']//button)[1]")).click();
        String productDetail = driver.getWindowHandle();

    }
}
