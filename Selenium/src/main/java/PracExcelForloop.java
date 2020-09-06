import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PracExcelForloop {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

//Open/Enter into workbook
		XSSFWorkbook wb = new XSSFWorkbook("./data/Readdata.docx");
		
//Get Sheet
		XSSFSheet sheet = wb.getSheet("Sheet1");

//Get Row Count
		int rowcount = sheet.getLastRowNum();
		System.out.println(rowcount);
		
//Get Column Count
		
		int columnCount = sheet.getRow(0).getLastCellNum();
		System.out.println(columnCount);
		
// Open for loop for row
		
// Open for loop for column
		
	
		for (int i = 0; i <=rowcount; i++) {
			XSSFRow row = sheet.getRow(i);
					for (int j = 0; j < args.length; j++) {
						XSSFCell cell = row.getCell(j);
								String value = cell.getStringCellValue();
						System.out.println(value);
					}
		}

		
		
	}

}
