package Practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class DataDrivenTest {
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("C:/Users/YASH/Desktop/testdata.xlsx");
		XSSFWorkbook w = new XSSFWorkbook(fis);
		XSSFSheet s = w.getSheet("Sheet1");
		
		int rows = s.getLastRowNum();
		System.out.println(rows);
		XSSFRow r = s.getRow(0);
		int cel = r.getLastCellNum();
		System.out.println(cel);
		
		//String inputdata [][]= new String [rows][cel];
		
		for (int i=0; i<rows; i++) {
			for (int j=0; j<cel; j++) {
				
				Cell c = s.getRow(i).getCell(j);
				System.out.println(c);
			}
		}
	
		
		
				
		
	}

}
