package ddt;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadOnly {
	
		
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis= new FileInputStream("C:\\Users\\admin\\OneDrive\\Desktop\\demoselenium.xlsx");
		Workbook book=WorkbookFactory.create(fis);
		Sheet s=book.getSheet("Sheet1");
		Row r=s.getRow(3);
		Cell c=r.getCell(0);
		String val=c.toString();
		System.out.println(val);		
	}
}
