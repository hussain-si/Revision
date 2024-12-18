import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HTMLControls {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//input[@name='fName']")).sendKeys("Anura");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@name='lName']")).sendKeys("Panchal");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@type='radio']/following-sibling::input")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@type='checkbox']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@type='checkbox']/following-sibling::input")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("anura.kpd@gmail.com");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@name='psw']")).sendKeys("testpwd");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(3000);
        driver.quit();

    }
}
