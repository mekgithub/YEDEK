import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromebrowserInvokation {
    public static void main(String []args){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\18327\\Desktop\\chromedriver_win32\\chromedriver.exe");
        WebDriver myDriver=new ChromeDriver();
        myDriver.get("http://www.github.com");
    }
}

