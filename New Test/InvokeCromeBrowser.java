import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvokeCromeBrowser
{
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\18327\\Desktop\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();//chromedriver as a constractor
        driver.get("http://www.amazon.com");
    }
}
