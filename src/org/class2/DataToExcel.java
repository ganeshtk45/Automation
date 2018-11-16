package org.class2;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by ganesh on 14-11-2018.
 */
public class DataToExcel
{
    public static void main(String[] args) throws IOException, InvalidFormatException {
        //WebDriver driver = new ChromeDriver();
        FileInputStream f = new FileInputStream("F:\\Java\\Intellij\\Excel\\Input.xlsx");
        Workbook book = WorkbookFactory.create(f);
        book.getSheet("sheet1").getRow(0).getCell(1).setCellValue("ganesh");
        FileOutputStream f1 = new FileOutputStream("F:\\Java\\Intellij\\Excel\\Input.xlsx");
        book.write(f1);
    }
}
