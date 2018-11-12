package org.class1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * Created by ganesh on 10-11-2018.
 */
public class driveDoubleClick
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://drive.google.com/drive/my-drive");
        driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("ganeshtk45@gmail.com");
        driver.findElement(By.xpath("//span[text()='Next']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("g@neshtk2");
        driver.findElement(By.xpath("//span[text()='Next']")).click();
        Thread.sleep(3000);
        WebElement folder = driver.findElement(By.xpath("//span[text()='redesign1']"));
        Actions a = new Actions(driver);
        a.doubleClick(folder).perform();
    }
}
