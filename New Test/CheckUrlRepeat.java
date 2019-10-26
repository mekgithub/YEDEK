import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class CheckUrlRepeat {
    public static WebDriver driver;
    public static String url="https://www.google.com/";

    public static void main(String[] args) {
        Firefox(url);
        System.out.println(isCurrnetUrlTrue(url));
    }

    public static void Firefox(String url){
        System.setProperty("webdriver.gecko.driver","C:\\Users\\18327\\Downloads\\geckodriver-v0.25.0-win64\\geckodriver.exe");
        driver=new FirefoxDriver();
        driver.get(url);
    }
    public static boolean isCurrnetUrlTrue(String url) {
        Firefox(url);
        System.out.println("Sent Url:"+ url);
        System.out.println("Current Url:"+driver.getCurrentUrl());
        return driver.getCurrentUrl().equals(url);
    }
}
