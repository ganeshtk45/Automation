package org.class2;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by ganesh on 14-11-2018.
 */
public class excelSheet
{
    public static void main(String[] args) throws IOException, InvalidFormatException
    {
        //WebDriver driver = new ChromeDriver();
        FileInputStream f = new FileInputStream("F:\\Java\\Intellij\\Excel\\Input.xlsx");
        Workbook book = WorkbookFactory.create(f);
        String username = book.getSheet("sheet1").getRow(0).getCell(1).getStringCellValue();
        System.out.println(username);
        String password = book.getSheet("sheet1").getRow(1).getCell(1).getStringCellValue();
        System.out.println(password);
    }
}
