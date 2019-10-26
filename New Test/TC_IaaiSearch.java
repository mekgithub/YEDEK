import jdk.swing.interop.SwingInterOpUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_IaaiSearch {
static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        chromeInvocation();
        driver.get("http://www.iaai.com");
        Thread.sleep(1000);
        driver.findElement(By.id("txtSearch")).sendKeys("Lexus");
        Thread.sleep(1000);
        driver.findElement(By.id("btnSearch")).sendKeys(Keys.ENTER);
        System.out.println(driver.findElement(By.id("txtSearch")).getAttribute("placeholder"));
        Thread.sleep(1000);
        driver.navigate().to("http.amazom.com");
        Thread.sleep(1000);
        System.out.println("text: "+ driver.findElement(By.xpath("//*[@id=\"nav-orders\"]")));

    }
    public static void chromeInvocation(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\18327\\Desktop\\chromedriver_win32\\chromedriver.exe");
       driver=new ChromeDriver();

    }
}
