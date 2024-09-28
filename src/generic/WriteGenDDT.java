package generic;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteGenDDT {

	static String path = "./excel/ddtfile.xlsx";

	public static void writeddt(String sheetname, int row, int cell, String value) {
		Sheet sheet;
		try {
			Workbook book = WorkbookFactory.create(new FileInputStream(path));
			try {
				sheet = book.createSheet(sheetname);
			} catch (IllegalArgumentException e) {
				sheet = book.getSheet(sheetname);
			}
			sheet.createRow(row).createCell(cell).setCellValue(value);
				FileOutputStream fos = new FileOutputStream(path);
			book.write(fos);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		// WorkbookFactory.create(new
					// FileInputStream(path)).createSheet(sheetname).createRow(row).createCell(cell).setCellValue(value);
				
	}
}
