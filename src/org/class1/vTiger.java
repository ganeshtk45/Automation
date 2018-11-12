package org.class1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by ganesh on 09-11-2018.
 */
public class vTiger
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.vtiger.com/");
        WebElement resourceDropdown = driver.findElement(By.xpath("//a[text()='Resources']"));
        resourceDropdown.click();
        Thread.sleep(1000);
        WebElement contactOption = driver.findElement(By.xpath("//a[text()='Contact']"));
        contactOption.click();
        Thread.sleep(3000);
        WebElement blorePhone = driver.findElement(By.xpath("//div[text()='India (Bangalore)']/following-sibling::div"));
        String b = blorePhone.getText();
        System.out.println(b);
    }
}
