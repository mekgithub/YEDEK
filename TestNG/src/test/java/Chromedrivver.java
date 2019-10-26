import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Chromedrivver {
    @Test
    public void Chrome(){
        System.out.println(Thread.currentThread().getId());
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.kayak.com");
        System.out.println(driver.getTitle());


    }
}
