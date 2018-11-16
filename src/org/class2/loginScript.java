package org.class2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pom.LoginActiTime;

/**
 * Created by ganesh on 15-11-2018.
 */
public class loginScript
{
    public static void main(String[] args)
    {
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.actitime.com");
        LoginActiTime ob = new LoginActiTime(driver);
        /*ob.usernameTextbox.sendKeys("admin");
        ob.passwordTextbox.sendKeys("manager");
        ob.loginButton.click();*/
        ob.setUsernameTextbox("admin");
        ob.setPasswordTextbox("manager");
        ob.clickLogin();
    }
}
