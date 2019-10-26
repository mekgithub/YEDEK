import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefocInvocation2 {
    public static void main(String[] Args) {
        for(int i=1;i<4;i++) {
            firefox();
            chrome();
        }

    }
    public static void firefox(){
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\18327\\Downloads\\geckodriver-v0.25.0-win64\\geckodriver.exe");
        WebDriver myFirefox2 = new FirefoxDriver();
        myFirefox2.get("http:www.ibsu.edu.ge");
    }
    public static void chrome(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\18327\\Desktop\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.amazon.com");
    }
}
