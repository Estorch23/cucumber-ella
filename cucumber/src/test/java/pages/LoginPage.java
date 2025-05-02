package pages;

import Utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends CommonMethods {

    //Object repositories for all the objects that we have

    @FindBy(id="txtusername")
    public WebElement usernameField;

    @FindBy(id="password")
    public WebElement passwordField;

    @FindBy(id="btnLogin")
    public WebElement loginButton;

    public LoginPage() {
        PageFactory.initElements(driver,this);
    }


}
