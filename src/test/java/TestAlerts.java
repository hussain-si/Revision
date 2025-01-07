
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author Hussain
 * Demonstrates how to handle alerts on a web page using Selenium WebDriver.
 */
public class TestAlerts {

    public static void main(String[] args) throws Exception {
        // Step 1: Set up ChromeDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();

        // Step 2: Create an instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Step 3: Maximize the browser window for better visibility
        driver.manage().window().maximize();

        // Step 4: Navigate to the web page containing alert examples
        driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");

        // Handling Alert Box

        // Display initial output text before interacting with the alert
        System.out.println(driver.findElement(By.id("output")));

        // Click the button to trigger the alert

        driver.findElement(By.id("alertBox")).click();
        Thread.sleep(2000);
        // Get the text displayed on the alert and print it
        Alert alert=driver.switchTo().alert();
        System.out.println(alert.getText());
        Thread.sleep(2000);
        // Accept the alert (click "OK" on the alert)
        alert.accept();
        // Display output text after accepting the alert
        System.out.println(driver.findElement(By.id("output")).getText());
        Thread.sleep(2000);
        // Handling Confirm Box


        // Display initial output text before interacting with the confirm box
        System.out.println(driver.findElement(By.id("output")).getText());
        Thread.sleep(2000);
        // Click the button to trigger the confirm box
        driver.findElement(By.id("confirmBox")).click();
        Thread.sleep(2000);
        // Get the text displayed on the confirm box and print it
        alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        Thread.sleep(2000);
        // Accept the confirm box (click "OK")
alert.accept();
        Thread.sleep(2000);

        // Display output text after accepting the confirm box
        System.out.println(driver.findElement(By.id("output")).getText());
        Thread.sleep(2000);
        // Trigger the confirm box again
        driver.findElement(By.id("confirmBox")).click();
        Thread.sleep(2000);

        // Get the text displayed on the confirm box and print it
        alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        Thread.sleep(2000);

        // Dismiss the confirm box (click "Cancel")
alert.dismiss();
        Thread.sleep(2000);

        // Display output text after dismissing the confirm box

        System.out.println(driver.findElement(By.id("output")).getText());
        Thread.sleep(2000);


        // Handling Prompt Box

        // Display initial output text before interacting with the prompt box
        System.out.println(driver.findElement(By.id("output")).getText());
        Thread.sleep(2000);

        // Click the button to trigger the prompt box
        driver.findElement(By.id("promptBox")).click();
        Thread.sleep(2000);

        // Get the text displayed on the prompt box and print it
        alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        Thread.sleep(4000);

        // Enter text into the prompt box
        alert.sendKeys("Anura");
        Thread.sleep(4000);

        // Accept the prompt box (click "OK")
        alert.accept();
        Thread.sleep(4000);

        // Display output text after accepting the prompt box
        System.out.println(driver.findElement(By.id("output")).getText());
        Thread.sleep(2000);

        // Trigger the prompt box again
        driver.findElement(By.id("promptBox")).click();
        Thread.sleep(2000);


        // Get the text displayed on the prompt box and print it
        alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        Thread.sleep(2000);

        // Dismiss the prompt box (click "Cancel")
        alert.dismiss();
        Thread.sleep(2000);

        // Display output text after dismissing the prompt box
        System.out.println(driver.findElement(By.id("output")).getText());
        Thread.sleep(2000);


        // Step 5: Close the browser and quit the WebDriver session
driver.quit();
    }
}
