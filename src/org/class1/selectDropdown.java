package org.class1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

/**
 * Created by ganesh on 11-11-2018.
 */
public class selectDropdown
{
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("F:/Selenium/test7.html");
        WebElement dropDown = driver.findElement(By.xpath("//select[@id='khans']"));
        Select s = new Select(dropDown);
        List<WebElement> list = s.getOptions();
        for (WebElement a:list)
        {
            System.out.println(a.getText());
        }
        s.selectByValue("d");
        s.selectByIndex(0);
        s.selectByVisibleText("peperdry");
        List<WebElement> list1 = s.getAllSelectedOptions();
        for (WebElement a1 :list1)
        {
            System.out.println(a1.getText());
        }
        s.deselectByValue("d");
        s.deselectAll();
    }
}
