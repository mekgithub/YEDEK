package apachepoi;

/*import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;*/

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExcelWrite {
    public static void main(String[] args) throws FileNotFoundException {
        File file=new File("C:\\Users\\18327\\Desktop\\Try.xls");
        FileInputStream fs=new FileInputStream(file);
       /*Workbook wb=new HSSFWorkbook();
        Sheet sh=wb.getSheet("Sheet2");
        Row rw=sh.getRow(0);
        Cell cell=rw.getCell(0);*/



    }
}
