package TestQkart;

import Pages.RegisterPage;
import Utilities.Config;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import javax.swing.*;
import java.io.IOException;

public class Register extends BaseClass {
    Config C;
    @Test
    public void Test1() throws InterruptedException, IOException {
    RegisterPage RP=new RegisterPage(driver);
    RP.DoRegister();
        C=new Config();
        Assert.assertEquals(RP.ValidationMessage(), C.getproperties("ValidationMessage05"));
    }
    @Test
    public void Test2() throws IOException {
        RegisterPage RP=new RegisterPage(driver);
        RP.InvalidScenario();
        C=new Config();
        Assert.assertEquals(RP.ValidationMessage(), C.getproperties("ValidationMessage06"));
    }
}
