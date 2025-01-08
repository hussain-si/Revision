package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class RegisterTest extends BaseClass {
    //locators

    WebElement Username = driver.findElement(By.xpath("user"));
    @Test
    public void test1(){
        // username
        Username.sendKeys("Anura");
        //blank password
        // blank confirm pwd
        //validate ---> actual result and expect result
    }
    @Test
    public void test2(){
        //username
        //blank password
        // blank confirm pwd
        //validate ---> actual result and expect result
    }
    @Test
    public void test3(){
        //username
        // password
        // blank confirm pwd
        //validate ---> actual result and expect result
    }
}
