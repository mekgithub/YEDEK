import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomeworkChildParent {
    public static void main(String[] args) throws InterruptedException {
        Browser myBrowser=new Browser();
        WebDriver driver=myBrowser.invokeChromeBrowser();
        driver.get("http://www.expedia.com");
       // Thread.sleep(2000);
        driver.findElement(By.xpath("form[@id='gcw-packages-form-hp-package']/section/div/div/div/div/label/input")).sendKeys("Atlanta");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@for='package-origin-hp-package']/label/child::input")).sendKeys("Las Vegas");

    }
}
