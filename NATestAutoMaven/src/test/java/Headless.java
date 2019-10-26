import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Headless {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\18327\\Desktop\\chromedriver_win32\\chromedriver.exe");
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--headless","--start maximized","--ignore-certificate-errors");
        WebDriver driver=new ChromeDriver(options);
        driver.get("https://www.facebook.com/login/identify/?ctx=recover&ars=royal_blue_bar");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println('1');
        driver.findElement(By.id("email")).sendKeys("headless");
        System.out.println("done");
    }

}
