package Pages;

import Utilities.Config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class HomePage {

    WebDriver driver;
    @FindBy(xpath = "//input[1]")
    WebElement Search;
    @FindBy(xpath = "//button[text()='Add to cart']")
    WebElement AddToCart;
    WebElement Validate;
    Config C;

    public HomePage(WebDriver driver){
        this.driver= driver;
        PageFactory.initElements(driver,this);
    }

    public void Search() throws IOException {
        Searchtext();
        AddToCart.click();
    }

    public void Searchtext() throws IOException {
        C=new Config();
        Search.sendKeys(C.getproperties("Search"));
    }

    public String ValidationMessage(){
        return Validate.getText();
    }
}
