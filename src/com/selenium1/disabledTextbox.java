package com.selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by ganesh on 06-11-2018.
 */
public class disabledTextbox
{
    public  static void main(String[] args)
    {
        WebDriver driver = new ChromeDriver();
        driver.get("F:/Selenium/test5.html");
        WebElement textbox = driver.findElement(By.id("t1"));
        boolean cond1 = textbox.isEnabled();
        System.out.println("cond1 is "+cond1);
        JavascriptExecutor j1 = (JavascriptExecutor) driver;
        j1.executeScript("document.getElementById(\"t1\").value='abc'");
        boolean cond2 = textbox.isEnabled();
        System.out.println("cond2 is "+cond2);
    }
}
