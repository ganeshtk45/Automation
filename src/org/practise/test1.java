package org.practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by ganesh on 12-11-2018.
 */
public class test1
{
    public static void main(String[] args)
    {
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/search?q=redmi6+mobile&sid=tyy%2C4io&as=on&as-show=on&otracker=AS_QueryStore_OrganicAutoSuggest_0_13&otracker1=AS_QueryStore_OrganicAutoSuggest_0_13&as-pos=0&as-type=HISTORY");
        WebElement price = driver.findElement(By.xpath("//div[text()='Redmi 6 (Rose Gold, 64 GB)']/parent::div/following-sibling::div/div/div/div[1]"));
        System.out.println(price.getText());

    }
}
