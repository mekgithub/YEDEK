import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browsers {
    public static void main(String [] args){
        for(int i=1;i<4;i++) {
            Chrome();
            firefox();
        }
        int j=1;
        while (j<4){
            Chrome();
            firefox();
        }

    }
    public static void Chrome(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\18327\\Desktop\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.chrome.com");

    }
    public static void firefox(){
        System.setProperty("webdriver.gecko.driver","C:\\Users\\18327\\Downloads\\geckodriver-v0.25.0-win64\\geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.get("http://www.etsy.com");
    }
}
