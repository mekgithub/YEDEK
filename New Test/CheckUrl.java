import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckUrl {

    public static String url="https://www.amazon.com/";
    public static WebDriver driver;
    public static void main(String args[]){
        chrome(url);
        boolean result=urlValidation(url);
        System.out.print("Validation: "+result);
    }

    public static void chrome(String url)
    {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\iulusoy\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get(url);
    }
    public static boolean urlValidation(String url)
    {
       System.out.println("Current Url: "+driver.getCurrentUrl());
       System.out.println("Requested Url: "+url);
        if(url.equals(driver.getCurrentUrl()))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}