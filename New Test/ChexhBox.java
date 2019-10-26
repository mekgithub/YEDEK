import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ChexhBox {
    public static void main(String[] args) throws InterruptedException {
        Browser myBrowser=new Browser();
        WebDriver driver=myBrowser.invokeChromeBrowser();
        driver.get("http:www.expedia.com");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input#hotel-add-flight-checkbox-hp-hotel")).click();
        Thread.sleep(2000);
        System.out.println("is selected"+ driver.findElement(By.cssSelector("input#hotel-add-flight-checkbox-hp-hotel")).isSelected());
        Thread.sleep(2000);
        Thread.sleep(2000);
    }
}
