import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebLocatorsId {

    static WebDriver driver;

    public static void main(String []args){
        Firefox();
        driver.get("http://www.skyscanner.com");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.id("fsc-origin-search")).clear();
        driver.findElement(By.id("fsc-origin-search")).sendKeys("Dallas");
        driver.findElement(By.id("fsc-destination-search")).sendKeys("Istanbul");

        driver.findElement(By.id("fsc-destination-search")).sendKeys("Atlanta");
        driver.findElement(By.id("fsc-destination-search")).sendKeys("pennsilvanya");
    }//
    public static void Firefox(){
        System.setProperty("webdriver.gecko.driver","C:\\Users\\18327\\Downloads\\geckodriver-v0.25.0-win64\\geckodriver.exe");
                driver=new FirefoxDriver();
    }
}
