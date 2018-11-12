package org.class1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.awt.*;
import java.awt.event.KeyEvent;

/**
 * Created by ganesh on 09-11-2018.
 */
public class downloadPopUp
{
    public static void main(String[] args) throws AWTException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.seleniumhq.org/download/");
        driver.findElement(By.xpath("//td[text()='Java']/parent::tr/td/a[text()='Download']")).click();
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_ALT);
        r.keyPress(KeyEvent.VK_S);
        r.keyRelease(KeyEvent.VK_ALT);
        r.keyRelease(KeyEvent.VK_S);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
    }
}
