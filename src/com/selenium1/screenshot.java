package com.selenium1;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/**
 * Created by ganesh on 06-11-2018.
 */
public class screenshot
{
    public static void main(String[] args) throws IOException {
        Date d = new Date();
        String time = d.toString();
        String[] a = time.split(" ");
        String[] t1 = a[3].split(":");
        String sec = t1[2];
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://facebook.com");
        TakesScreenshot t = (TakesScreenshot)driver;
        File source = t.getScreenshotAs(OutputType.FILE);
        //File dest = new File("F:\\Java\\Intellij\\photo\\photo2.png");
        File dest = new File("F:\\Java\\Intellij\\photo\\"+sec+".png");
        FileUtils.copyFile(source,dest);
    }
}
