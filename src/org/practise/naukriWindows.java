package org.practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

/**
 * Created by ganesh on 06-11-2018.
 */
public class naukriWindows
{
    public static void main(String[] args)  {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://naukri.com");
        String naukriWindow = driver.getWindowHandle();
        Set<String> awh = driver.getWindowHandles();
        for (String b:awh)
        {
            driver.switchTo().window(b);
            System.out.println(driver.getTitle());
            if (!b.equals(naukriWindow))
            {
                driver.close();
            }
        }
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Set<String> awh1 = driver.getWindowHandles();
        for (String b:awh1) {
            driver.switchTo().window(b);
        }
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("//span[text()='Later']")).click();
    }
}
