package com.scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by ganesh on 03-11-2018.
 */
public class serachFlight
{
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.makemytrip.com/");
        WebElement fromText = driver.findElement(By.xpath("//label[text()='From']/parent::div/input[@tabindex='1']"));
        fromText.clear();
        fromText.sendKeys("goa");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement fromOptions = driver.findElement(By.xpath("//li[@aria-label='Search Result : Goa, India']"));
        fromOptions.click();
        WebElement toText = driver.findElement(By.xpath("//label[text()='To']/parent::div/input[@tabindex='1']"));
        toText.clear();
        toText.sendKeys("bangalore");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement toOptions = driver.findElement(By.xpath("//li[@aria-label='Search Result : Bangalore, India']"));
        toOptions.click();
        WebElement depart = driver.findElement(By.xpath("//input[@mt-id='departDate']"));
        depart.click();
        WebElement selectDate = driver.findElement(By.xpath("(//span[text()='December']/parent::div/parent::div/following-sibling::table//td/a[text()='5'])[1]"));
        selectDate.click();
        WebElement passanger = driver.findElement(By.xpath("//label[text()='Passengers | Class']/parent::div/input"));
        passanger.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement adult = driver.findElement(By.xpath("//span[text()='(+12 yrs)']/parent::p/parent::div/following-sibling::div//li[text()='1']"));
        adult.click();
        WebElement Aclass = driver.findElement(By.xpath("//span[@id='premiumEconomy']"));
        Aclass.click();
        driver.findElement(By.xpath("//ul[@id='pot_ul']/parent::div/a[text()='Done']")).click();
        driver.findElement(By.xpath("//label[text()='Passengers | Class']/parent::div/parent::div/button[text()='Search']")).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(driver.getTitle());
        driver.close();
    }
}
