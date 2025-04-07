package TestQkart;

import Pages.LoginPage;
import Pages.RegisterPage;
import Utilities.Config;
import org.apache.commons.lang3.Validate;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class Login extends BaseClass {
    Config C;
    @Test
    public void Test1() throws InterruptedException, IOException {
        LoginPage LP = new LoginPage(driver);
        LP.BlankPassword();
        C=new Config();
        Assert.assertEquals(LP.ValidationMessage(), C.getproperties("ValidationMessage01"));
    }
    @Test
    public void Test2() throws IOException {
        LoginPage LP=new LoginPage(driver);
        LP.InvalidUsername();
        C=new Config();
        Assert.assertEquals(LP.ValidationMessage(), C.getproperties("ValidationMessage02"));

    }
    @Test
    public void Test3() throws IOException {
        LoginPage LP=new LoginPage(driver);
        LP.InvalidPassword();
        C=new Config();
        Assert.assertEquals(LP.ValidationMessage(), C.getproperties("ValidationMessage03"));

    }
    @Test
    public void Test4() throws IOException {
        LoginPage LP=new LoginPage(driver);
        LP.DoLogin();
        C=new Config();
        Assert.assertEquals(LP.ValidationMessage(), C.getproperties("ValidationMessage04"));

    }
}