package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by ganesh on 15-11-2018.
 */
public class LoginActiTime
{
    @FindBy(xpath = "//input[@id='username']")
    private WebElement usernameTextbox;
    @FindBy(xpath = "//input[@name='pwd']")
    private WebElement passwordTextbox;
    @FindBy(xpath = "//div[text()='Login ']")
    private WebElement loginButton;
    public LoginActiTime(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    public void setUsernameTextbox(String un)
    {
        this.usernameTextbox.sendKeys(un);
    }

    public void setPasswordTextbox(String pwd)
    {
        this.passwordTextbox.sendKeys(pwd);
    }
    public void clickLogin()
    {
        this.loginButton.click();
    }
}
