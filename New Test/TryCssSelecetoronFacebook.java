import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//facebook tan fprgot account boluune ulasmayi denedik. linktext ile..css ve xpath ile dene!
public class TryCssSelecetoronFacebook {
    public static void main(String []args) throws InterruptedException {
        Browser myBrowser=new Browser();
        WebDriver driver=myBrowser.invokeChromeBrowser();
        driver.get("http://www.facebook.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a:contains(text()'Forgot account?')")).click();
    }
}
