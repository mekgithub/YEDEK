import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocator {
    public  static WebDriver driver;
    public static void main(String[] args) {
        invokeChromeBrowser();
        driver.get("http://www.facebook.com");
        driver.findElement(By.name("firstname")).sendKeys("driver");
        driver.findElement(By.name("lastname")).sendKeys("Mehmet");
    //    driver.findElement(By.name(.))

    }
    public static void invokeChromeBrowser(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\18327\\Desktop\\chromedriver_win32\\chromedriver.exe");
        driver =new ChromeDriver();
    }


}
