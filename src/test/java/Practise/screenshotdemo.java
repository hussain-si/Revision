package Practise;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class screenshotdemo extends BaseClass {
    @Test
    public void test1() throws InterruptedException, IOException {
        TakesScreenshot srcshot = ((TakesScreenshot) driver);
        File srcFile = srcshot.getScreenshotAs(OutputType.FILE);
        File destination = new File("src/test/java/Practise/demo.JPG");
        FileUtils.copyFile(srcFile,destination);
    }
}