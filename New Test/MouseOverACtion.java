import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class MouseOverACtion {
    public static void main(String []args){
        Browser myBrowser=new Browser();
        WebDriver driver=myBrowser.invokeChromeBrowser();
        driver.get("http://www.amazon.com");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        Actions myMouse=new Actions(driver);
        myMouse.moveToElement(driver.findElement(By.linkText("Orders"))).build().perform();
        myMouse.click();
    }
}
