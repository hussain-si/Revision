import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class Demo1 extends InheritenceClass{
Config config;

    @Test(priority = 1,description = "Verify login page working as expected")
    public  void login() throws InterruptedException, IOException {
        //navigating to login page
        Thread.sleep(5000);
        driver.findElement(By.xpath(config.returnValue("login"))).click();
        //tested the username
        //tested the password field
        //testd login button
    }
    @Test(priority = 2,description = "naviagte back")
    public void back() throws InterruptedException, IOException {
        Thread.sleep(5000);
        driver.findElement(By.xpath(config.returnValue("explore"))).click();

    }

    @Test(priority = 3,description = "Verify Register working as expected")
    public  void register() throws InterruptedException, IOException {
        //navigating to Register
        Thread.sleep(5000);
        driver.findElement(By.xpath(config.returnValue("register"))).click();
        //tested the username
        //tested the password field
        //tested the confirm password field
        //testd login button
    }


}
