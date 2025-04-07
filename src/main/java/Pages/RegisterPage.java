package Pages;

import Utilities.Config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class RegisterPage {

    WebDriver driver;
    @FindBy(xpath = "//button[.='Register']")
    WebElement Register;
    @FindBy(xpath = "//input[@id='username']")
    WebElement Username;
    @FindBy(xpath = "//input[@id='password']")
    WebElement Password;
    @FindBy(xpath = "//input[@id='confirmPassword']")
    WebElement ConfirmPassword;
    @FindBy(xpath = "//button[.='Register Now']")
    WebElement RegisterNow;
    @FindBy(xpath = "//div[@id='notistack-snackbar']")
    WebElement Validate;
    Config C;

    public RegisterPage(WebDriver driver){
        this.driver= driver;
        PageFactory.initElements(driver,this);
    }

    public void DoRegister() throws IOException {
        Register.click();
        Usernamefield();
        Passwordfield();
        ConfirmPasswordfield();
        RegisterNow.click();
    }

    public void InvalidScenario() throws IOException {
        Register.click();
        Usernamefield();
        Passwordfield();
        ConfirmPasswordfield();
        RegisterNow.click();
    }

    public void Usernamefield() throws IOException {
        C=new Config();
        Username.sendKeys(C.getproperties("Username"));
    }
    public void Passwordfield() throws IOException {
        C=new Config();
        Password.sendKeys(C.getproperties("Password"));
    }
    public void ConfirmPasswordfield() throws IOException {
        C=new Config();
        ConfirmPassword.sendKeys(C.getproperties("ConfRegPassword"));
    }
    public String ValidationMessage(){
        return Validate.getText();
    }
}

