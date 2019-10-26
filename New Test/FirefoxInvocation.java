import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxInvocation {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","C:\\Users\\18327\\Downloads\\geckodriver-v0.25.0-win64\\geckodriver.exe");
        WebDriver myMozilladriver=new FirefoxDriver();
        myMozilladriver.get("http://www.researchgate.com");
    }
}
