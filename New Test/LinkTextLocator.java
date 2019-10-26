import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextLocator {
    public static WebDriver ibrahim;
    public static void main(String args[]) throws InterruptedException {
        String expectedValue="Sizin İçin Buradayız!";
        invokeChromeBrowser();
        ibrahim.manage().window().maximize();
        ibrahim.get("http://www.flypgs.com");
        // Thread.sleep("")
        ibrahim.findElement(By.xpath("//*[@id='divHeaderCurrency']/div/div/div/label")).click();
        Thread.sleep(2000);
        ibrahim.findElement(By.linkText("BİZE YAZIN")).click();
        Thread.sleep(2000);
        System.out.println("Validation"+isTextTrue(expectedValue));

    }

    public static void invokeChromeBrowser()
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\18327\\Desktop\\chromedriver_win32\\chromedriver.exe");
        ibrahim=new ChromeDriver();
    }
    public static boolean isTextTrue(String expectedValue)
    {
        String resultValue=ibrahim.findElement(By.xpath("//*[@id='sf-recase-query']/h2")).getText();
        return resultValue.equals(expectedValue);
    }
}
