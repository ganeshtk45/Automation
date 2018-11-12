package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by ganesh on 03-11-2018.
 */
public class flipkart
{
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://flipkart.com/");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("//div[@class='_3Njdz7']/button")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("//div[text()='Nokia 5.1 Plus']/following-sibling::div[1]")).click();
        driver.navigate().back();
        driver.findElement(By.xpath("//div[text()='iPhone 6s(32 GB)']//../div[4]")).click();
        driver.navigate().back();
        driver.findElement(By.xpath("//div[text()='Nokia 6.1 Plus']/following-sibling::div[2]")).click();
        driver.close();
    }
}
