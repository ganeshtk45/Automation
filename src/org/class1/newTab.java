package org.class1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.KeyEvent;

/**
 * Created by ganesh on 09-11-2018.
 */
public class newTab
{
    public static void main(String[] args) throws AWTException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://localhost/login.do");
        /*Robot r = new Robot();
        r.keyPress(KeyEvent.VK_SHIFT);
        driver.findElement(By.xpath("//a[text()='actiTIME Inc.']")).click();
        r.keyRelease(KeyEvent.VK_SHIFT);*/
        WebElement viewLicence = driver.findElement(By.xpath("//a[text()='View License']"));
        Actions a = new Actions(driver);
        a.sendKeys(Keys.CONTROL).click(viewLicence).perform();// to open in new tab, if it is opening in new window
    }
}
