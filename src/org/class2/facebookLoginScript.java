package org.class2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pom.facebookLogin;

/**
 * Created by ganesh on 15-11-2018.
 */
public class facebookLoginScript
{
    public static void main(String[] args)
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://facebook.com");
        facebookLogin ob = new facebookLogin(driver);
        ob.setFbUsernameTextbox("ganeshtk45@gmail.com");
        ob.setFbPasswordTextbox("test1234");
    }
}
