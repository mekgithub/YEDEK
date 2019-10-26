import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Browser {
    public WebDriver invokeBrowser(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\18327\\Desktop\\chromedriver_win32\\chromedriver.exe");
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--NATestAuto","--disable-gpu","--ignore-certificate-errors","--window-size=1920,1080");
        WebDriver driver=new ChromeDriver(options);
        return driver;
    }
}
