import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckUrl3 {

    public static String url="https://www.amazon.com/";
    public static WebDriver driver;

    public static void main(String[] args) {
        chrome(url);
       // boolean result=urlValidation(url);
        System.out.println("Validation:"+urlValidation(url));//parantez icine'+result'yazacgimiza direk'urlValidation(url)'yazarak da printedilebeilir

    }
    public static void chrome(String url){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\18327\\Desktop\\chromedriver_win32\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get(url);
    }
     public static boolean urlValidation(String url){
         System.out.println("Current url:"+driver.getCurrentUrl());
         System.out.println("Requested url:"+url);
        /* if(url.equals(driver.getCurrentUrl())){
             return  true;
         }
         else{
             return false;
         }*/
         return url.equals(driver.getCurrentUrl());//istersek bu sekilde yukarikdail if bogunu kaldirip kullanbiliriz.
     }
}
