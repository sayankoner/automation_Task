package generic;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadGenDDT {
	static String value = null;
	static String path = "C:\\Users\\admin\\OneDrive\\Desktop\\demoselenium.xlsx";

	public static String readddt(String sheet, int row, int cell) {
		try {
			value = WorkbookFactory.create(new FileInputStream(path)).getSheet(sheet).getRow(row).getCell(cell)
					.toString();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}
}
