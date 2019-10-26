import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import javax.swing.*;

public class YazBoz {
    public static void main(String[] args) throws InterruptedException {
        Browser myBrowser=new Browser();
        WebDriver driver=myBrowser.invokeChromeBrowser();
        driver.get("http://www.expedia.com");
        driver.findElement(By.xpath("//form[@id='gcw-packages-form-hp-package']/section/div/div/div/div/label/input")).sendKeys("Atlanta");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id='hero-banner']/div/div/section/div/div[2]/div[2]/section[3]/form/section/div/div[2]/div/div/label/input")).sendKeys("LasVegas");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='package-destination-hp-package']/label/child::input")).sendKeys("11/11/2019");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='package-destination-hp-package']/label/child::input")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='package-returning-hp-package']/label/child::input")).sendKeys("11/12/2019");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='package-returning-hp-package']/label/child::input")).click();


    }
}


