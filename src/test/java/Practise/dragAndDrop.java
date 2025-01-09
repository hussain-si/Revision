package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class dragAndDrop extends BaseClass {

    @Test
    public void test1() throws InterruptedException {

        Actions actions = new Actions(driver);
        WebElement from = driver.findElement(By.id("column-a"));
        WebElement to = driver.findElement(By.id("column-b"));
        actions.dragAndDrop(from,to).perform();
        Thread.sleep(5000);
    }
}