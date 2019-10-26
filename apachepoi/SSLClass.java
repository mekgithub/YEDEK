package apachepoi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SSLClass {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\18327\\Desktop\\chromedriver_win32\\chromedriver.exe");
        WebDriver Mehmet=new ChromeDriver();//chromedriver as a constractor
        DesiredCapabilities dc=new DesiredCapabilities();
        dc.acceptInsecureCerts();
        dc.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);
        ChromeOptions co=new ChromeOptions();
        co.merge(dc);
    }
}
