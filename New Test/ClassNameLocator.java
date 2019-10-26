import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNameLocator {
    static WebDriver Mehmet;
    public static void main(String [] args) throws InterruptedException {
        invokeChromeBrowser();
        Mehmet.get("https://www.turkishairlines.com/");
        Thread.sleep(3000);
        Mehmet.findElement(By.className("thyHeaderLink")).click();
    }


   public static void invokeChromeBrowser(){
       System.setProperty("webdriver.chrome.driver","C:\\Users\\18327\\Desktop\\chromedriver_win32\\chromedriver.exe");
       Mehmet=new ChromeDriver();

   }
}
