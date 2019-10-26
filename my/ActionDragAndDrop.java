package my;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionDragAndDrop {
    public static void main(String[] args) {
        System.setProperty("webriver.chrome.driver","C:\\Users\\18327\\Desktop\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://demo.guru99.com/test/drag/_drop.html");
        WebDriverWait wait=new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()=' BANK ']")));
        WebElement source=driver.findElement(By.xpath("//a[text()=' BANK ']"));
        WebElement target=driver.findElement(By.xpath("ol#bank>li"));
        Actions myActions=new Actions(driver);
        myActions.dragAndDrop(source,target).build().perform();

    }
}
