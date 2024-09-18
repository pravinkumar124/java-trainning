package fileoperations;
 
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


 public class Readfileoperationstasks {
	 
static XSSFWorkbook workbook;
static XSSFSheet sheet;
 
public static void main(String[] args) {
 getRowCount();
 getCellDataString(0, 0);
 getCellDataNumeric(1, 1);
 
 
 }
private static void getCellDataString(int rowNum, int colNum) {
	try {
		String projectPath=System.getProperty("user.dir");
		workbook= new XSSFWorkbook(projectPath+"\\JavaTranning\\excel");
		sheet = workbook.getSheet("Sheet1");
		String cellData = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
		System.out.print(cellData);
		
		
	} catch (IOException e) {
		e.printStackTrace();
	}
}

private static void getCellDataNumeric(int rowNum, int colNum) {

	try {
		String projectPath=System.getProperty("user.dir");
		workbook= new XSSFWorkbook(projectPath+"\\JavaTranning\\excel");
		sheet = workbook.getSheet("Sheet1");
		int cellData = (int) sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
		System.out.println(cellData);
		
		
	} catch (IOException e) {
		e.printStackTrace();
	}
		
}
private static void getRowCount() {
	
	try {
		String projectPath=System.getProperty("user.dir");
		workbook= new XSSFWorkbook(projectPath+"\\JavaTranning\\excel");
		sheet = workbook.getSheet("Sheet1");
		int rowCount = sheet.getPhysicalNumberOfRows();
		System.out.print("Number of Rows " + rowCount);
		
		
	} catch (IOException e) {
		
		e.printStackTrace();
	}
}
 }
