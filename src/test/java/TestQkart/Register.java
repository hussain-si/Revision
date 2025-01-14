package TestQkart;

import Pages.RegisterPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import javax.swing.*;

public class Register extends BaseClass {

    @Test
    public void Test1() throws InterruptedException {
    RegisterPage RP=new RegisterPage(driver);
    RP.DoRegister();
        //Register.click();
//        Actions action=new Actions(driver);
//        action.click(Register).perform();
//        Thread.sleep(3000);
//        Username.sendKeys("Anura");
//        Password.sendKeys("");
//        ConfirmPassword.sendKeys("");
//        RegisterNow.click();
//        Thread.sleep(3000);
   Assert.assertEquals(RP.ValidationMessage(),"Username must be at least 6 characters");
    }
    @Test
    public void Test2(){
        RegisterPage RP=new RegisterPage(driver);
        RP.InvalidScenario();
    }
}
