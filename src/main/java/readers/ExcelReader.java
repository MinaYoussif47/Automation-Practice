package readers;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	static String filePath = "0";
	
	static XSSFWorkbook wb;
	
	public static void setPath(String filePath2) throws IOException{
		
	File InputsFile = new File(filePath2);
	
	FileInputStream fip = new FileInputStream(InputsFile);
	
	wb = new XSSFWorkbook(fip); //HSSFWorkbook for xls format, XSSFWorkbook for xlsx format​

	}
	public static String read(int rowNumber, int columnNumber) throws IOException{
	String cellData = "2";
	XSSFSheet sheet = wb.getSheetAt(0);
	Row row = sheet.getRow(rowNumber);
	org.apache.poi.ss.usermodel.Cell cell = row.getCell(columnNumber);
	if (cellData != null && cell != null) //for NullPoiterException​

	cellData = cell.getStringCellValue().toString();
	return cellData;

	}
}
