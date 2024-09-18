package fileoperations;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writefileoperationtask {

	public static void main(String[] args) throws IOException {
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("EmployeeData");
		
		Object empData[][] = {{"Name", "Age", "Email"},{ "John Doe", "30", "john@test.com"},{"Jane Doe", "28", "john@test.com"},
				{"Bob Smith", "35", "jacky@example.com"},{"Swapnil", "37", "swapnil@example.com"}};
		
		int rows = empData.length;
		int cols = empData[0].length;
		
		System.out.println(rows);
		System.out.println(cols);
		
		for (int r = 0; r < rows; r++) {
			
			XSSFRow row = sheet.createRow(r);
			
			for (int c = 0; c < cols; c++) {
				
				XSSFCell cell = row.createCell(c);
				Object value = empData[r][c];
				if (value instanceof String)
					cell.setCellValue((String) value);
				if (value instanceof Integer)
					cell.setCellValue((Integer) value);
				if (value instanceof Boolean)
					cell.setCellValue((Boolean) value);		
				
			}
		}
		
		String filePath = ".\\excel\\Employees.xlsx";
		FileOutputStream fos = new FileOutputStream(filePath);
		workbook.write(fos);
		System.out.println("Employee file written successfully");
	
		}

}
	

