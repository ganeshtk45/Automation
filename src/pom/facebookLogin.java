package pom;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by ganesh on 15-11-2018.
 */
public class facebookLogin
{
    @FindBy(xpath = "//input[@id='email']")
    private WebElement FbUsernameTextbox;
    @FindBy(xpath = "//input[@id='pass']")
    private  WebElement FbPasswordTextbox;
    @FindBy(xpath = "//input[@value='Log In']")
    private WebElement loginButton;
    public facebookLogin(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    public void setFbUsernameTextbox(String fbUsernameTextbox)
    {
        this.FbUsernameTextbox.sendKeys(fbUsernameTextbox);
    }

    public void setFbPasswordTextbox(String fbPasswordTextbox)
    {
        this.FbPasswordTextbox.sendKeys(fbPasswordTextbox);
    }

   /* public void setLoginButton()
    {
        this.loginButton.click();
    }*/
}
