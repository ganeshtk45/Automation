package org.class1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

/**
 * Created by ganesh on 08-11-2018.
 */
public class monsterResumeUpload
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.monsterindia.com/");
        WebElement uploadResume = driver.findElement(By.xpath("//span[text()='Upload Resume']"));
        uploadResume.click();
        Thread.sleep(1000);
        WebElement chooseFile = driver.findElement(By.xpath("//input[@id='wordresume']"));
        File f1 = new File("F:\\Java\\Intellij\\CV\\Resume.docx");
        String path = f1.getAbsolutePath();
        chooseFile.sendKeys(path);
    }
}
