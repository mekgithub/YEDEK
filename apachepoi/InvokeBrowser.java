package apachepoi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvokeBrowser {
    public WebDriver invokeBrowser(){

            System.setProperty("webdriver.chrome.driver","C:\\Users\\18327\\Desktop\\chromedriver_win32\\chromedriver.exe");
            WebDriver Mehmet=new ChromeDriver();//chromedriver as a constractor
            Mehmet.get("http://www.amazon.com");
            return Mehmet;

    }
}
