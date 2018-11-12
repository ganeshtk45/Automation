package org.class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Date;

/**
 * Created by ganesh on 12-11-2018.
 */
public class makeMyTripCurrentDate
{
    public static void main(String[] args)
    {
        Date d = new Date();
        String date = d.toString();
        String[] date1 = date.split(" ");
        String d1 = date1[2];
        System.out.println(d1);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.makemytrip.com/");
        driver.findElement(By.xpath("//input[@id='hp-widget__depart']")).click();
        driver.findElement(By.xpath("//span[text()='November']/parent::div/parent::div/following-sibling::table//a[text()="+d1+"]")).click();
    }
}
