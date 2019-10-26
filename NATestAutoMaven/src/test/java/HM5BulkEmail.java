import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class HM5BulkEmail {
    private static String customerEmail="";
    private static String subject="";
    private static String emailBody="";

    public static void main(String[] args) throws IOException, InterruptedException {
       /*WebDriverManager.chromedriver().setup();
        Browser myBrowser=new Browser();
        WebDriver driver=new ChromeDriver();*/
        WebDriverManager.firefoxdriver().setup();
        Browser myBrowser=new Browser();
        WebDriver driver=new FirefoxDriver();
       // File file=new File("C:\\Users\\18327\\Desktop\\HM5.xlsx");
       // FileInputStream fs=new FileInputStream(file);
        //XSSFWorkbook wb=new XSSFWorkbook(fs);
       // XSSFSheet sh=wb.getSheet("emails");
        driver.get(" https://accounts.google.com/signin/v2/identifier?sacu=1&ignoreShadow=1&flowName=GlifWebSignIn&flowEntry=AddSession&cid=1&navigationDirection=forward\n");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //put the email
        driver.findElement(By.id("identifierId")).sendKeys("mekselenium@gmail.com");
        Thread.sleep(1000);
        //click to next
        driver.findElement(By.xpath("//div[@class='dG5hZc']/div/div/span")).click();
        Thread.sleep(2000);
        System.out.println(20);
        //put my pasword, but it is not working! i find the element correctly..
        driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Mekselenium2019.");
        Thread.sleep(1000);
        System.out.println(21);
       driver.findElement(By.cssSelector("span[class='CwaK9']")).click();
       Thread.sleep(1000);
        driver.manage().window().maximize();
        System.out.println(22);
        Thread.sleep(1000);
        driver.findElement(By.className("gb_Xe")).click();
        Thread.sleep(1000);
        System.out.println(23);
        driver.findElement(By.className("gb_p")).click();
        Thread.sleep(1000);
        System.out.println(24);
       // driver.findElement(By.className("gb_e")).click();
        //Thread.sleep(1000);
       // System.out.println(25);

      /* int rowCount=sh.getLastRowNum();
       for(int i=1; i<rowCount; i++) {


           Row rw=sh.getRow(i);
           Cell cell1=rw.getCell(0);
           //customer email	subject	email body
           customerEmail=cell1.getStringCellValue();
           Cell cell2=rw.getCell(1);
           subject=cell2.getStringCellValue();
           Cell cell3=rw.getCell(2);
           emailBody=cell3.getStringCellValue();
           System.out.println(2);
           driver.findElement(By.className("vO")).sendKeys(customerEmail);
           Thread.sleep(1000);
           System.out.println(3);
           driver.findElement(By.id(":89")).sendKeys(subject);
           Thread.sleep(1000);
           System.out.println(4);
           driver.findElement(By.id(":9e")).sendKeys(emailBody);
           Thread.sleep(1000);
           System.out.println(5);

*/


       //}
    }
}
