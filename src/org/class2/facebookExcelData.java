package org.class2;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by ganesh on 14-11-2018.
 */
public class facebookExcelData
{
    public static void main(String[] args) throws IOException, InvalidFormatException {
        FileInputStream f = new FileInputStream("F:\\Java\\Intellij\\Excel\\Facebook.xlsx");
        Workbook book = WorkbookFactory.create(f);
        String usernameValue = book.getSheet("Credentials").getRow(0).getCell(1).getStringCellValue();
        String passwordValue = book.getSheet("Credentials").getRow(1).getCell(1).getStringCellValue();
        WebDriver driver = new ChromeDriver();
        driver.get("https://facebook.com");
        WebElement username = driver.findElement(By.cssSelector("input[tabindex='1']"));
        WebElement password = driver.findElement(By.cssSelector("input[tabindex='2']"));
        username.sendKeys(usernameValue);
        password.sendKeys(passwordValue);
        driver.findElement(By.cssSelector("input[type='submit']")).click();
    }
}
