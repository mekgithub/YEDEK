
    import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

    public class AllBrowsers
    {
        public WebDriver  chrome()
        {
            System.setProperty("webdriver.chrome.driver","C:\\Users\\18327\\Desktop\\chromedriver_win32\\chromedriver.exe");
            WebDriver driver=new ChromeDriver();
            driver.get("http://www.amazon.com");
            return driver;
        }

        //this method invokes the firefox driver
        public void firefox()
        {
            System.setProperty("webdriver.gecko.driver","C:\\Users\\18327\\Downloads\\geckodriver-v0.25.0-win64\\geckodriver.exe");
            WebDriver driver=new FirefoxDriver();
            driver.get("http://www.facebook.com");
        }

    }


