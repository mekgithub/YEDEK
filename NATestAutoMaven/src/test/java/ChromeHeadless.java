import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ChromeHeadless {

        private static String userName = "";
        private static String password = "";

        public static void main(String[] args) throws IOException, InterruptedException {
            WebDriverManager.chromedriver().setup();
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\18327\\Desktop\\chromedriver_win32\\chromedriver.exe");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--headless", "--disable-gpu", "--start-maximized", "--ignore-certificate-errors");
            WebDriver driver = new ChromeDriver(options);

            // Get the login page
            driver.get("https://www.facebook.com/login/identify/?ctx=recover&ars=royal_blue_bar");

            File file = new File("C:\\Users\\18327\\Desktop\\SELENIUM\\MVN.xlsx");
            FileInputStream fis = new FileInputStream(file);
            // Finds the workbook instance for XLSX file
            XSSFWorkbook myWorkBook = new XSSFWorkbook(fis);
            // Return first sheet from the XLSX workbook
            XSSFSheet mySheet = myWorkBook.getSheet("Test1");
            int rowCount=mySheet.getLastRowNum();
            for (int i = 1; i < rowCount+1; i++) {
                Row rw = mySheet.getRow(i);
                Cell cell1 = rw.getCell(0);
                userName = cell1.getStringCellValue();
                Cell cell2 = rw.getCell(1);
                password = cell2.getStringCellValue();
                System.out.println("1");
                driver.findElement(By.id("email")).sendKeys(userName);
                Thread.sleep(1000);
                System.out.println("2");
                driver.findElement(By.id("pass")).sendKeys(password);
                Thread.sleep(1000);
                Cell newCell = rw.createCell(2);
                newCell.setCellValue("Passed");
                fis.close();
                FileOutputStream fos = new FileOutputStream(file);
                myWorkBook.write(fos);
                fos.close();

                System.out.println("Done");


        }
    }
}
