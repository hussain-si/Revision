package TestQkart;

import Pages.LoginPage;
import Pages.RegisterPage;
import org.apache.commons.lang3.Validate;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login extends BaseClass {
    @Test
    public void Test1() throws InterruptedException {
        LoginPage LP = new LoginPage(driver);
        LP.BlankPassword();

        Assert.assertEquals(LP.ValidationMessage(), "Password is a required field");
    }
    @Test
    public void Test2(){
        LoginPage LP=new LoginPage(driver);
        LP.InvalidUsername();
        Assert.assertEquals(LP.ValidationMessage(),"Username does not exist");

    }
    @Test
    public void Test3(){
        LoginPage LP=new LoginPage(driver);
        LP.InvalidPassword();
        Assert.assertEquals(LP.ValidationMessage(),"Password is incorrect");

    }
    @Test
    public void Test4(){
        LoginPage LP=new LoginPage(driver);
        LP.DoLogin();
        Assert.assertEquals(LP.ValidationMessage(),"Logged in successfully");

    }
}