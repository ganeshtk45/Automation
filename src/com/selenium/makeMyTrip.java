package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by ganesh on 03-11-2018.
 */
public class makeMyTrip
{
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://flights.makemytrip.com/makemytrip/search/O/O/E/1/0/0/S/V0/BLR_BOM_10-11-2018?contains=false&remove=/");
        WebElement price = driver.findElement(By.xpath("(//span[text()='9W-410'])[1]/../../../..//span[@class='num ng-binding']"));
        //driver.findElement(By.xpath("(//span[text()='9W-410'])[1]//parent::span/parent::span//parent::div/parent::div//span[@class='num ng-binding']"));
        System.out.println(price.getText());
        WebElement price1 = driver.findElement(By.xpath("(//span[text()='G8-426'][1])/../../../..//span[@class='num ng-binding']"));
        String p = price1.getText();
        System.out.println(p);


    }
}
