package com.selenium;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

/**
 * Created by ganesh on 30-10-2018.
 */
public class basics
{
    static
    {
        System.setProperty("webdriver.chrome.driver","F:\\Java\\Intellij/chromedriver.exe");
    }
    public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://facebook.com");
        driver.close();

        JavascriptExecutor j1 = (JavascriptExecutor)driver;
        j1.executeScript("wndow.scrollBy()");
        j1.executeScript("document.getElementById().value='asd'");
        TakesScreenshot t1 = (TakesScreenshot)driver;
        File source = t1.getScreenshotAs(OutputType.FILE);
        File dest = new File("path");
        FileUtils.copyFile(source,dest);
        File f1 = new File("path");
        String path = f1.getAbsolutePath();
        //webelement.sendkeys(path);
    }
}
