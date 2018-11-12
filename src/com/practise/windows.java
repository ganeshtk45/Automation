package com.practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

/**
 * Created by ganesh on 05-11-2018.
 */
public class windows
{
    public static void main(String[] args) throws InterruptedException {
        //Redmi6 - Buy Products Online at Best Price in India - All Categories | Flipkart.com
        //Redmi 6 (Black, 32 GB) Online at Best Price Only On Flipkart.com
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://flipkart.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@class='_3Njdz7']/button")).click();
        Thread.sleep(2000);
        WebElement searchTextBox = driver.findElement(By.xpath("//input[@title='Search for products, brands and more']"));
        searchTextBox.sendKeys("redmi6");
        Thread.sleep(1000);
        WebElement dropdownResult = driver.findElement(By.xpath("//div[text()='in Mobiles']/parent::div/parent::a"));
        dropdownResult.click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[text()='Redmi 6 (Black, 32 GB)']")).click();
        Set<String> awh = driver.getWindowHandles();
        for (String b: awh)
        {
            driver.switchTo().window(b);
            System.out.println(driver.getTitle());
        }
        Thread.sleep(4000);
        driver.findElement(By.xpath("(//div[@class='_1k1QCg _3QNwd7']//button)[1]")).click();

        for (String c:awh)
        {
            driver.switchTo().window(c);
            if (driver.switchTo().window(c).getTitle().equals("Redmi6 - Buy Products Online at Best Price in India - All Categories | Flipkart.com"))
            {
                break;
            }
        }
        Thread.sleep(4000);
        WebElement searchTextBox1 = driver.findElement(By.xpath("//input[@title='Search for products, brands and more']"));
        Thread.sleep(1000);
        searchTextBox1.clear();
        searchTextBox1.sendKeys("redmi6");
        WebElement dropdownResult1 = driver.findElement(By.xpath("//div[text()='in Mobiles']/parent::div/parent::a"));
        dropdownResult1.click();

    }
}
