package task_8_FileOperation;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		XSSFWorkbook book = new XSSFWorkbook("C:\\Users\\Faster\\eclipse-workspace\\task_8_FileOperation\\src\\main\\java\\ReadWriteExcell.xlsx");
		
		XSSFSheet sheet = book.getSheet("Sheet1");
		
		int rowCount = sheet.getLastRowNum();
		
		int columnCount = sheet.getRow(0).getLastCellNum();
		
		String[][] data = new String[rowCount][columnCount];
		
		for(int i=0; i<rowCount; i++) {
			
			XSSFRow row = sheet.getRow(i);
			
			for(int j=0; j<columnCount; j++) {
				
				XSSFCell cell = row.getCell(j);
				
				System.out.print(cell.getStringCellValue()+" ");
				
			}
		}
		
		book.close();
	}

}
