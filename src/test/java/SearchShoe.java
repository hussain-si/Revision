import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SearchShoe extends InheritenceClass{

    @Test
    public void search(){
        driver.findElement(By.xpath("(//input[@name='search'])[1]")).sendKeys("shoe");
    }

}
