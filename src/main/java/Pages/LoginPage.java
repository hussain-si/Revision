package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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

    public LoginPage(WebDriver driver){
        this.driver= driver;
        PageFactory.initElements(driver,this);
    }

    public void BlankPassword(){
        Login.click();
        Usernamefield();
        LoginNow.click();
    }
    public void InvalidUsername(){
        Login.click();
        Usernamefield();
        Passwordfield();
        LoginNow.click();
    }
    public void InvalidPassword(){
        Login.click();
        ValidUsernamefield();
        Passwordfield();
        LoginNow.click();
    }
    public void DoLogin(){
        Login.click();
        ValidUsernamefield();
        ValidPasswordfield();
        LoginNow.click();
    }

    public void Usernamefield(){
        Username.sendKeys("Anura");
    }
    public void ValidUsernamefield(){
        Username.sendKeys("anurapanchal");
    }
    public void Passwordfield(){
        Password.sendKeys("abcd");
    }
    public void ValidPasswordfield(){
        Password.sendKeys("testadmin");
    }
    public String ValidationMessage(){
        return Validate.getText();
    }
}
