package com.selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by ganesh on 06-11-2018.
 */
public class enableDisable
{
        public static void main (String[]args)
        {
        WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
        driver.get("https://www.plus2net.com/javascript_tutorial/enable-disable-demo.php");
            WebElement checkbox = driver.findElement(By.xpath("//input[@name='others']"));
            WebElement textbox = driver.findElement(By.xpath("//input[@name='other_text']"));
            boolean beforeCheckbox = checkbox.isSelected();
            boolean beforeTextbox = textbox.isEnabled();
            checkbox.click();
            boolean afterCheckbox = checkbox.isSelected();
            boolean afterTextbox = textbox.isEnabled();
            System.out.println("Before selecting checkbox "+beforeCheckbox+" "+beforeTextbox);
            System.out.println("after selecting checkbox "+afterCheckbox+" "+afterTextbox );
            System.out.println(checkbox.isDisplayed());
            System.out.println(textbox.isDisplayed());
            String attribute = textbox.getAttribute("name");
            System.out.println(attribute);
        }
}