package org.class1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.KeyEvent;

/**
 * Created by ganesh on 10-11-2018.
 */
public class newWindow
{
        public static void main(String[] args) throws AWTException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://localhost/login.do");
            WebElement copyright = driver.findElement(By.xpath("//a[text()='actiTIME Inc.']"));
            Actions a = new Actions(driver);
            Robot r = new Robot();
            a.contextClick(copyright).perform();
            r.keyPress(KeyEvent.VK_W);
            r.keyRelease(KeyEvent.VK_W);
    }
}
