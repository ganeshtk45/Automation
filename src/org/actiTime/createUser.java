package org.actiTime;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

/**
 * Created by ganesh on 06-11-2018.
 */
public class createUser
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.actitime.com");
        WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
        username.sendKeys("admin");
        WebElement password = driver.findElement(By.xpath("//input[@name='pwd']"));
        password.sendKeys("manager");
        WebElement loginButton = driver.findElement(By.xpath("//div[text()='Login ']"));
        loginButton.click();
        Thread.sleep(3000);
        WebElement usersTab = driver.findElement(By.xpath("//div[text()='USERS']"));
        usersTab.click();
        Thread.sleep(3000);
        WebElement addUserButton = driver.findElement(By.xpath("//div[text()='Add User']"));
        addUserButton.click();
        Thread.sleep(3000);
        WebElement createUser_firstName = driver.findElement(By.xpath("//input[@name='firstName']"));
        createUser_firstName.sendKeys("test");
        WebElement createUser_lastName = driver.findElement(By.xpath("//input[@name='lastName']"));
        createUser_lastName.sendKeys("abc");
        WebElement createUser_email = driver.findElement(By.xpath("//input[@name='email']"));
        createUser_email.sendKeys("test@test.com");
        WebElement createUser_username = driver.findElement(By.xpath("//input[@name='username']"));
        createUser_username.sendKeys("rewrrewe");
        WebElement createUser_password = driver.findElement(By.xpath("//input[@name='password']"));
        createUser_password.sendKeys("sfgsgsfg");
        WebElement createUser_retypePassword = driver.findElement(By.xpath("//input[@name='passwordCopy']"));
        createUser_retypePassword.sendKeys("gfdgdshf");
        driver.findElement(By.xpath("//div[@id='closeUserDataLightBoxBtn']")).click();
        Alert a = driver.switchTo().alert();
        String text = a.getText();
        System.out.println(text);
        a.dismiss();
    }
}
