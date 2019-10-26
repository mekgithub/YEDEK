import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelRead {

        public static void main(String[] args) throws IOException {
            File file=new File("C:\\Users\\18327\\Desktop\\SELENIUM\\Try.xlsx");
            FileInputStream fs=new FileInputStream(file);
            Workbook wb=new XSSFWorkbook(fs);
            Sheet sh=wb.getSheet("DENEME");
            int rowCount=sh.getLastRowNum();
            Row rw;
            Cell cell;
            for(int i=0;i<rowCount;i++){
                rw=sh.getRow(i);
                cell=rw.getCell(0);
                System.out.println(cell.getStringCellValue());
            }
    }

}
