package com.selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by ganesh on 05-11-2018.
 */
public class height
{
    public static void main(String[] args)
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://facebook.com/");
        WebElement username = driver.findElement(By.cssSelector("input[tabindex='1']"));
        WebElement password = driver.findElement(By.cssSelector("input[tabindex='2']"));
        int h1 = username.getSize().getHeight();
        int w1 = username.getSize().getWidth();
        int h2 = password.getSize().getHeight();
        int w2 = password.getSize().getWidth();
        if ((h1==h2)&&(w1==w2))
        {
            System.out.println("Dimensions are matching");
        }
        else
        {
            System.out.println("Dimensions are not matching");
        }
        WebElement copyright = driver.findElement(By.xpath("//span[text()=' Facebook © 2018']"));
        int y = copyright.getLocation().getY();
        int x = copyright.getLocation().getX();
        System.out.println("X axis is "+x+" y axis is "+y);
    }
}
