import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_EtsySearch {
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        chromeinvocation();
        driver.get("http://www.etsy.com");
        Thread.sleep(2000);
        driver.findElement(By.id("search-query")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("search-query")).sendKeys("softdesigngifts");
        Thread.sleep(2000);
        driver.findElement(By.id("search-query")).sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.id("search-query")).getAttribute("placeholder"));

    }
    public static void chromeinvocation(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\18327\\Desktop\\chromedriver_win32\\chromedriver.exe");
        driver=new ChromeDriver();
    }
}
