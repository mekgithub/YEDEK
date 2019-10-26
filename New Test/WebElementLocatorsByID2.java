import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElementLocatorsByID2 {


    public static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        firefoxInvocation();
        driver.get("http://www.expedia.com");
        Thread.sleep(2000);
        driver.findElement(By.id("package-origin-hp-package")).sendKeys("H");
        Thread.sleep(6000);
        driver.findElement(By.id("package-origin-hp-package")).sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(2000);
        driver.findElement(By.id("package-origin-hp-package")).sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(2000);
        driver.findElement(By.id("package-origin-hp-package")).sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(2000);
        driver.findElement(By.id("package-origin-hp-package")).sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        driver.findElement(By.id("package-destination-hp-package")).sendKeys("I");
        Thread.sleep(2000);
        driver.findElement(By.id("package-destination-hp-package")).sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(2000);
        driver.findElement(By.id("package-destination-hp-package")).sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        driver.findElement(By.id("package-departing-hp-package")).sendKeys("09/18/2019");
        Thread.sleep(2000);

            driver.findElement(By.id("package-returning-hp-package")).clear();
            Thread.sleep(1000);
       /* driver.findElement(By.id("package-returning-hp-package")).sendKeys("09/21/2019");
      /* for(int i=1; i<4 ;i++){

            driver.findElement(By.id("package-returning-hp-package")).sendKeys(Keys.BACK_SPACE);
        }*/
        Thread.sleep(2000);
        driver.findElement(By.id("package-returning-hp-package")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("package-returning-hp-package")).sendKeys(Keys.chord(Keys.CONTROL,"A"));
        Thread.sleep(2000);
        driver.findElement(By.id("package-returning-hp-package")).sendKeys(Keys.BACK_SPACE);
        Thread.sleep(2000);
        driver.findElement(By.id("package-returning-hp-package")).sendKeys("09/21/2019");
        Thread.sleep(2000);
        driver.findElement(By.id("search-button-hp-package")).click();

        driver.findElement(By.id("package-destination-hp-package"));

    }
    public static void firefoxInvocation(){
        System.setProperty("webdriver.gecko.driver","C:\\Users\\18327\\Downloads\\geckodriver-v0.25.0-win64\\geckodriver.exe");
         driver=new FirefoxDriver();
    }
}
