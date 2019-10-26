import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.*;

public class ExercisesHome2 {
    public static void main(String[] args) throws IOException {
      File file=new File("C:\\Users\\18327\\Desktop\\SELENIUM\\MVN.xlsx");
        FileInputStream fs=new FileInputStream(file);
        Workbook wb= new HSSFWorkbook();
        Sheet sh=wb.getSheet("Test1");
        Row rw=sh.getRow(0);
        //Cell cell=rw.createCell(0,CellType.STRING);//? BURADA OTOMATIK OLARAK NEDEN CIKMIYOR?
       // cell.setCellValue("Updated");
        fs.close();
        FileOutputStream fos=new FileOutputStream(file);
        wb.write(fos);
        fos.close();
        System.out.println("updated");

    }
}
