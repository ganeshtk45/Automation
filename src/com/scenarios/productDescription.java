package com.scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.Set;

/**
 * Created by ganesh on 03-11-2018.
 */
public class productDescription
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://flipkart.com");
            Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@class='_3Njdz7']/button")).click();
            Thread.sleep(2000);
        driver.findElement(By.xpath("//ul[@class='_114Zhd']/li[1]/span")).click();
            Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='Apple']")).click();
            Thread.sleep(2000);
        driver.findElement(By.xpath("//p[text()='iPhone']")).click();
            Thread.sleep(2000);
        WebElement brandFilter = driver.findElement(By.xpath("//input[@placeholder='Search Brand']"));
        brandFilter.sendKeys("mi");
        WebElement checkbox = driver.findElement(By.xpath("//div[text()='Mi']/parent::label/div[1]"));
        checkbox.click();
            Thread.sleep(2000);
        WebElement expandFilter = driver.findElement(By.xpath("//div[text()='Speciality']"));
        expandFilter.click();
        driver.findElement(By.xpath("//div[text()='Big Storage']/parent::label/div[1]")).click();
            Thread.sleep(2000);
        WebElement sortBy = driver.findElement(By.xpath("//div[text()='Price -- Low to High']"));
        sortBy.click();
            Thread.sleep(2000);
        driver.findElement(By.xpath("//div[text()='Redmi 6 (Blue, 64 GB)']")).click();
           Thread.sleep(5000);

        Thread.sleep(3000);
        Set<String> awh = driver.getWindowHandles();
        for (String b:awh)
        {
            driver.switchTo().window(b);
        }
        driver.findElement(By.xpath("(//div[@class='_1k1QCg _3QNwd7']//button)[1]")).click();
    }
}
