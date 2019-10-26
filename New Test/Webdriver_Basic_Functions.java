import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver_Basic_Functions {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\18327\\Desktop\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.google.com");

        System.out.println("the title of web page: "+driver.getTitle());

        driver.navigate().back();
        driver.navigate().forward();
    }
}
