package org.class1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

/**
 * Created by ganesh on 07-11-2018.
 */
public class uploadPopup
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://naukri.com/");
        WebElement uploadCv = driver.findElement(By.xpath("//input[@id='input_resumeParser']"));
        File f1 = new File("F:\\Java\\Intellij\\CV\\Resume.docx");
        String path = f1.getAbsolutePath();
        uploadCv.sendKeys(path);
    }
}
