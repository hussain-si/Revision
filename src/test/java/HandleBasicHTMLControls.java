import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBasicHTMLControls {
    public static void main(String[] args) throws Exception {
        // Setup WebDriver using WebDriverManager
WebDriverManager.chromedriver().setup();

        // Launch Chrome browser
WebDriver driver=new ChromeDriver();

        // Maximize the browser window
driver.manage().window().maximize();;

        // Navigate to the target URL
driver.get("https://www.hyrtutorials.com/p/basic-controls.html");

        // Pause for 3 seconds to allow the page to load (not recommended in real-time projects, use WebDriverWait)
Thread.sleep(3000);

        // Select the "Female" radio button using its ID

driver.findElement(By.id("femalerb")).click();

        // Pause for 3 seconds to observe the action

        Thread.sleep(3000);
        // Select the "English" checkbox using its ID

        driver.findElement(By.id("englishchbx")).click();
        // Pause for 3 seconds to observe the action

        Thread.sleep(3000);
        // Locate the "Hindi" checkbox using its ID
        WebElement element=driver.findElement(By.id("hindichbx"));

        // Check the "Hindi" checkbox
         element.click();


        // Pause for 3 seconds to observe the action
        Thread.sleep(3000);

        // Verify if the "Hindi" checkbox is selected
        if(element.isSelected()){
            element.click();
        }

        // Pause for 3 seconds to observe the action
        Thread.sleep(3000);

        // Click on the "Register" button using its ID

        driver.findElement(By.id("registerbtn")).click();
        // Retrieve and print the message displayed after clicking the "Register" button

        String e=driver.findElement(By.id("navigateHome")).getText();
        System.out.println(e);
        // Pause for 3 seconds to observe the output
        Thread.sleep(3000);

        // Click on the link to navigate to the home page
driver.findElement(By.id("navigateHome")).click();
        // Close the browser session (optional but recommended in practice)
driver.quit();
    }
}
