package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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

    public RegisterPage(WebDriver driver){
        this.driver= driver;
        PageFactory.initElements(driver,this);
    }

    public void DoRegister() {
        Register.click();
        Usernamefield();
        Passwordfield();
        ConfirmPasswordfield();
        RegisterNow.click();
    }

    public void InvalidScenario(){
        Register.click();
        Usernamefield();
        RegisterNow.click();
    }

    public void Usernamefield(){
        Username.sendKeys("Anura");
    }
    public void Passwordfield(){
        Password.sendKeys("abcd");
    }
    public void ConfirmPasswordfield(){
        ConfirmPassword.sendKeys("abcd");
    }
    public String ValidationMessage(){
        return Validate.getText();
    }
}

