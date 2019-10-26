import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataSourceDataProvider
{

    @Test(dataProvider = "DataSource")
    public void test1(String Url,String item,String name) throws InterruptedException
    {
        System.out.println(Url+ " is being searched by "+ item );
        System.out.println(name);
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get(Url);
        WebDriverWait wait =new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[name='q']")));
        driver.findElement(By.cssSelector("input[name='q']")).sendKeys(item);
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input[name='q']")).sendKeys(Keys.ENTER);
    }

    @DataProvider(name="DataSource")
    public Object[][] getData()
    {
        return new Object[][]{
                {"http://www.google.com","shoes","n1"},
                {"http://www.google.com","computer","n2"},
                {"http://www.google.com","books","n2"}
        };
    }

}
