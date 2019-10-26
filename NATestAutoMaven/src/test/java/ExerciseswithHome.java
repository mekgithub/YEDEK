import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExerciseswithHome {
   private static String Username;
   private  static String Password;

    public static void main(String[] args) throws IOException {
        WebDriverManager.chromedriver().setup();
        Browser myBrowser=new Browser();
        WebDriver driver=new ChromeDriver();

        File file=new File("C:\\Users\\18327\\Desktop\\SELENIUM\\MVN.xlsx");
        FileInputStream fs=new FileInputStream(file);
        XSSFWorkbook myWorkbook=new XSSFWorkbook(fs);
        Sheet sh=myWorkbook.getSheet("Test1");

        int rowCount=sh.getLastRowNum();
        Row row;
        Cell cell;
        for(int i=0; i<rowCount +1; i++){
            row=sh.getRow(i);
            Cell cell1=row.getCell(0);
            Username= cell1.getStringCellValue();
            Cell cell2=row.getCell(1);
            Password=cell2.getStringCellValue();
            Cell cell3=row.getCell(2);



        }
    }
}
