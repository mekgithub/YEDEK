package my;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebLOcatorsId {
    public static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        firefox();
        driver.get("http://www.skyscanner.com");
        driver.findElement(By.id("fsc-origin-search")).clear();
        driver.findElement(By.id("fsc-origin-search")).sendKeys("Dallas");
        Thread.sleep(2000);
        driver.findElement(By.id("fsc-destination-search")).sendKeys("Atlanta");


    }
    public static void firefox(){
        System.setProperty("webdriver.gecko.driver","C:\\Users\\18327\\Downloads\\geckodriver-v0.25.0-win64\\geckodriver.exe");
        driver=new FirefoxDriver();

    }
}
