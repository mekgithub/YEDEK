import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefoxdriver {
    public void Firefox(){
        System.out.println(Thread.currentThread().getId());
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
        driver.get("http://www.amazon.com");
        System.out.println(driver.getTitle());
    }
}
