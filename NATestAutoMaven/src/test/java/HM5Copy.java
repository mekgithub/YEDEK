import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.*;
import java.util.concurrent.TimeUnit;


import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class HM5Copy {

        private static String customerEmail="";
        private static String subject="";
        private static String emailBody="";

        public static void main(String[] args) throws IOException, InterruptedException {
        WebDriverManager.chromedriver().setup();
        Browser myBrowser=new Browser();
        WebDriver driver=new ChromeDriver();

            File file=new File("C:\\Users\\18327\\Desktop\\SELENIUM\\HM5_DataSource.xlsx");
            FileInputStream fs=new FileInputStream(file);
            XSSFWorkbook wb=new XSSFWorkbook(fs);
            XSSFSheet sh=wb.getSheet("emails");
            driver.get(" https://mail.google.com/mail/u/0/#inbox");
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
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

       int rowCount=sh.getLastRowNum();
       for(int i=1; i<rowCount+1; i++) {

           Row rw=sh.getRow(i);
           Cell cell1=rw.getCell(0);
           customerEmail=cell1.getStringCellValue();
           Cell cell2=rw.getCell(1);
           subject=cell2.getStringCellValue();
           Cell cell3=rw.getCell(2);
           emailBody=cell3.getStringCellValue();
           System.out.println(2);
           driver.findElement(By.cssSelector("div[gh='cm']")).click();
           Thread.sleep(1000);
           driver.findElement(By.className("vO")).sendKeys(customerEmail);
           Thread.sleep(1000);
           System.out.println(3);
           driver.findElement(By.cssSelector("input[name='subjectbox']")).sendKeys(subject);
           Thread.sleep(1000);
           System.out.println(4);
           driver.manage().window().maximize();
           driver.findElement(By.cssSelector("div.dC > div")).click();
           Thread.sleep(1000);
           System.out.println(5);
           Cell result=rw.createCell(3);
           result.setCellValue("Send email");
           fs.close();
           FileOutputStream fos=new FileOutputStream(file);
           wb.write(fos);
           fos.close();
           System.out.println("Done");

            }
    }
}
