package apachepoi;


/*import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;*/

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelRead {
    public static void main(String[] args) throws IOException {

        File file=new File("C:\\Users\\18327\\Desktop\\Try.xls");
        FileInputStream fs=new FileInputStream(file);                  //for read the file..is pulling up outputstream is pushing
      /*  Workbook wb=new HSSFWorkbook(fs);                        //we have two diffretent version we use the this..our HM xsls do it
        Sheet    sh=wb.getSheet("DENEME");   //
        Row rw=sh.getRow(0);
        Cell cell=rw.getCell(0);
        System.out.println(cell.getStringCellValue());*/
    }
}
