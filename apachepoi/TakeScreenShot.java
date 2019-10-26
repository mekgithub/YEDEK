package apachepoi;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class TakeScreenShot {
    public static void main(String[] args) throws IOException {
        InvokeBrowser myBrowser = new InvokeBrowser();
        WebDriver driver = myBrowser.invokeBrowser();
        driver.get("http://www.amazon.com");
        File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file,new File("C:\\Users\\18327\\Desktop\\ScreenshotsSE\\ScreenshotsSE.bmp"));
    }
}
