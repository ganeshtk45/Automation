package org.class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

/**
 * Created by ganesh on 12-11-2018.
 */
public class facebookDate
{
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://facebook.com/");
        WebElement yearDropdown = driver.findElement(By.xpath("//select[@id='year']"));
        Select s= new Select(yearDropdown);
        /*List<WebElement> options = s.getOptions();
        for (WebElement b:options)
        {
                System.out.println(b.getText());
        }*/
        for (int i=0;i<100;i++)
        {
            s.selectByIndex(i);
        }
        List<WebElement> a = s.getAllSelectedOptions();
        for (WebElement b:a)
        {
            System.out.println(b.getText());
        }
    }
}
