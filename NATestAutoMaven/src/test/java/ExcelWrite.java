import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelWrite {
    public static void main(String[] args) throws IOException {
       // File file=new File("")
        File file = new File("C:\\Users\\18327\\Desktop\\SELENIUM\\MVN.xlsx");
        FileInputStream fs = new FileInputStream(file);
        XSSFWorkbook wb = new XSSFWorkbook(fs);
        XSSFSheet sh = wb.getSheet("Test1");
        int rowCount = sh.getLastRowNum();
        for(int i=1; i<rowCount; i++){
            Row rw=sh.getRow(i);
            Cell cell1=rw.createCell(2);
            cell1.setCellValue("Passed");
            //fs.close();
            //FileInputStream foss=new FileInputStream(file);

        }

    }
}

