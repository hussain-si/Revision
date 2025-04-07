package Pages;

import Utilities.Config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class LoginPage {
    WebDriver driver;
    @FindBy(xpath = "//button[.='Login']")
    WebElement Login;
    @FindBy(xpath = "//input[@id='username']")
    WebElement Username;
    @FindBy(xpath = "//input[@id='password']")
    WebElement Password;
    @FindBy(xpath = "//button[.='Login to QKart']")
    WebElement LoginNow;
    @FindBy(xpath = "//div[@id='notistack-snackbar']")
    WebElement Validate;
    Config C;

    public LoginPage(WebDriver driver){
        this.driver= driver;
        PageFactory.initElements(driver,this);
    }

    public void BlankPassword() throws IOException {
        if (Login.isDisplayed() &&  Login.isEnabled()) {
            Login.click();
        }
        Usernamefield();
        if (LoginNow.isDisplayed() &&  LoginNow.isEnabled()) {
            LoginNow.click();
        }
    }
    public void InvalidUsername() throws IOException {
        if (Login.isDisplayed() &&  Login.isEnabled()) {
            Login.click();
        }
        Usernamefield();
        Passwordfield();
        if (LoginNow.isDisplayed() &&  LoginNow.isEnabled()) {
            LoginNow.click();
        }
    }
    public void InvalidPassword() throws IOException {
        if (Login.isDisplayed() &&  Login.isEnabled()) {
            Login.click();
        }
        ValidUsernamefield();
        Passwordfield();
        if (LoginNow.isDisplayed() &&  LoginNow.isEnabled()) {
            LoginNow.click();
        }
    }
    public void DoLogin() throws IOException {
        if (Login.isDisplayed() &&  Login.isEnabled()) {
            Login.click();
        }
        ValidUsernamefield();
        ValidPasswordfield();
        if (LoginNow.isDisplayed() &&  LoginNow.isEnabled()) {
            LoginNow.click();
        }
    }

    public void Usernamefield() throws IOException {
        C=new Config();
        Username.sendKeys(C.getproperties("InvalidUsername"));
    }
    public void ValidUsernamefield() throws IOException {
        C=new Config();
        Username.sendKeys(C.getproperties("Username"));
    }
    public void Passwordfield() throws IOException {
        C=new Config();
        Password.sendKeys(C.getproperties("InvalidPassword"));
    }
    public void ValidPasswordfield() throws IOException {
        C=new Config();
        Password.sendKeys(C.getproperties("Password"));
    }
    public String ValidationMessage(){
        return Validate.getText();
    }
}
