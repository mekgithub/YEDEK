import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;
@Listeners(ExamListener.class)
public class ExDataProvider {
    @Test (dataProvider = "DataSorce")
    public void searchGOOGLE(String url,String items) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("input[type='text']")).sendKeys(items);//same
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("input[type='text']")).sendKeys(Keys.ENTER);//same
        driver.close();

    }
    @DataProvider(name="DataSource")
    public Object[][] getData(){
        return new Object[][]{
                {"http://www.google.com","shoes"} ,
                {"http://www.google.com","computer"},
                {"http://google.com","books"},
                {"http://google.com","jacket"},
                {"http://google.com","shirt"}
        };
    }

}
