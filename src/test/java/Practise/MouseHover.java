package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.openqa.selenium.interactions.Actions;


public class MouseHover extends BaseClass{
    @Test
    public void test1() throws InterruptedException {
       driver.findElement(By.xpath("//button[.='Register']")).click();
       Thread.sleep(3000);
        WebElement username =driver.findElement(By.xpath("//input[@id='username']"));

        Actions action = new Actions(driver);
        action.moveToElement(username).perform();
    }
}
