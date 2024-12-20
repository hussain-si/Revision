
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


        // Click the button to trigger the alert


        // Get the text displayed on the alert and print it


        // Accept the alert (click "OK" on the alert)

        // Display output text after accepting the alert


        // Handling Confirm Box


        // Display initial output text before interacting with the confirm box

        // Click the button to trigger the confirm box

        // Get the text displayed on the confirm box and print it

        // Accept the confirm box (click "OK")

        // Display output text after accepting the confirm box

        // Trigger the confirm box again

        // Get the text displayed on the confirm box and print it

        // Dismiss the confirm box (click "Cancel")

        // Display output text after dismissing the confirm box


        // Handling Prompt Box

        // Display initial output text before interacting with the prompt box

        // Click the button to trigger the prompt box

        // Get the text displayed on the prompt box and print it

        // Enter text into the prompt box

        // Accept the prompt box (click "OK")

        // Display output text after accepting the prompt box

        // Trigger the prompt box again

        // Get the text displayed on the prompt box and print it

        // Dismiss the prompt box (click "Cancel")

        // Display output text after dismissing the prompt box


        // Step 5: Close the browser and quit the WebDriver session

    }
}
