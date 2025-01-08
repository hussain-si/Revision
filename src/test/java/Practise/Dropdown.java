package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Dropdown extends BaseClass{

    @Test
    public void test1(){
        driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
        WebElement dropdown = driver.findElement(By.xpath("//select[@id='course']"));
        WebElement Course = driver.findElement(By.xpath("//select[@id='course']/preceding-sibling::label"));
        Select select = new Select(dropdown);
        //select.selectByIndex(2);
        //select.selectByValue("java");
        select.selectByVisibleText("Java");
        System.out.println(Course.getText());
        //validation
        Assert.assertEquals(Course.getText(),"Course Name");
    }
}
