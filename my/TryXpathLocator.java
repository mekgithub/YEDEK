package my;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TryXpathLocator {
public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        invokeCh();
        driver.get("http://facebook.com");
      //  driver.findElement(By.name("firstname")).sendKeys("MEHMET");
       // driver.findElement(By.name("lastname")).sendKeys("KOrtak");
        Thread.sleep(5000);
      //  driver.findElement(By.linkText("Forgot account?")).click();
      //  driver.findElement(By.xpath())
       /* driver.findElement(By.xpath("//input[@type='email']")).sendKeys("mehmet@sdad.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("1qaz2wsx");*/
       // driver.findElement(By.xpath("//input[contains(@type,'l_e')]")).sendKeys("conatins");

    }
    public static void invokeCh(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\18327\\Desktop\\chromedriver_win32\\chromedriver.exe");
        driver=new ChromeDriver();

    }
}
