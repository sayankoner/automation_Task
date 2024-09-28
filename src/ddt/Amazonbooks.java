package ddt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import generic.Baseclass;

public class Amazonbooks extends Baseclass {
	public static void main(String[] args)
			throws InterruptedException, EncryptedDocumentException, FileNotFoundException, IOException {
		String path = "./excel/ddtfile.xlsx";
		chromebase();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hindi books" + Keys.ENTER);
		Thread.sleep(2000);
		List<WebElement> ele_name = driver
				.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		List<WebElement> ele_star = driver.findElements(By.xpath("//span[contains(@aria-label,'stars')]"));
		List<WebElement> eleprice = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		Workbook book = WorkbookFactory.create(new FileInputStream(path));
		Sheet sheet = book.getSheet("amazon");

		// sheet = book.createSheet("amazon");
		int i = 0;
		Row r = null;
		for (WebElement ele : ele_name) {
			String name = ele.getText();	
			r = sheet.createRow(i);
			r.createCell(1).setCellValue(name);
			i++;
		}
		i = 0;
		for (WebElement ele2 : ele_star) {
			String star = ele2.getAttribute("aria-label");
			try {
				 r = sheet.getRow(i);
				 System.out.println(star);
				}catch(NullPointerException e) {
				}
			r.createCell(2).setCellValue(star);

			i++;
		}
		i = 0;
		for (WebElement ele3 : eleprice) {
			String price = ele3.getText();
			try {
			 r = sheet.getRow(i);
			}catch(NullPointerException e) {		
			}
			r.createCell(3).setCellValue(price);
			i++;
		}

		FileOutputStream fos = new FileOutputStream(path);
		book.write(fos);
	}

}
