package ddt;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WriteExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		List<WebElement> list_link= driver.findElements(By.xpath("//a"));
		
		String path="./excel/ddtfile.xlsx";
		FileInputStream fis= new FileInputStream(path);
		Workbook book= WorkbookFactory.create(fis);
		Sheet sheet= book.createSheet("all_links");
		
		int i=0;
		for (WebElement ele : list_link) {
			Row r=sheet.createRow(i);
			Cell s=r.createCell(1);
			String hrefvlaue= ele.getAttribute("href");
			s.setCellValue(hrefvlaue);
			FileOutputStream fos= new FileOutputStream(path);
			book.write(fos);
			i++;
		}
		
	}
}
