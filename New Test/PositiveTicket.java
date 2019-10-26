import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PositiveTicket {
    public static void main(String[] args) throws InterruptedException {
        Browser myBrowser=new Browser();
        WebDriver driver=myBrowser.invokeChromeBrowser();

        driver.get("http://www.facebook.com");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("i>>");
        driver.findElement(By.xpath("//input[starts-with(@name,'firstname')]")).sendKeys("MEHMET");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("pwd");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[contains(@type,'ema')]")).sendKeys("contains ema");
        driver.findElement(By.xpath("//input[contains(@type,'pas')]")).sendKeys("pas");
       Thread.sleep(3000);

      driver.get("http://www.flypgs.com");

        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"fligth-searh\"]/div[1]/div[1]/div/div[2]/div/label")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("pwd");
    }
}