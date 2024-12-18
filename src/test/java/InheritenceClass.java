import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.IOException;
import java.lang.NullPointerException;

public class InheritenceClass {
    Config config;
    WebDriver driver;
    @BeforeTest
    public void setup() throws IOException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        config=new Config();
        driver.manage().window().maximize();
        driver.get(config.returnValue("url"));
    }
    @AfterTest
    public void TearDown(){
        driver.quit();
    }
}
