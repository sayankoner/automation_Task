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
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bookswithforloop {
public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Hindi Books",Keys.ENTER);
		List<WebElement> all_name = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		List<WebElement> all_star = driver.findElements(By.xpath("//span[contains(@aria-label,'out of 5 stars')]"));
		List<WebElement> all_price = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		
		String path = "C:\\Users\\admin\\OneDrive\\Desktop\\demoselenium.xlsx";
		FileInputStream fis = new FileInputStream(path);
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = null;
		try {
			 sheet = book.createSheet("AmazonBook1");	
		} catch (IllegalArgumentException e) {
			 sheet = book.getSheet("AmazonBook1");
		}		
		int size = all_name.size();
		for (int i=0; i<size-1; i++) {
			Row r = sheet.createRow(i);
			WebElement name = all_name.get(i);
			String n = name.getText();
			Cell c = r.createCell(0);
			c.setCellValue(n);
			
			WebElement star = all_star.get(i);
			String s = star.getAttribute("aria-label");
			Cell c1 = r.createCell(1);
			c1.setCellValue(s);
			
			WebElement price = all_price.get(i);
			String p = price.getText();
			Cell c2 = r.createCell(2);
			c2.setCellValue(p);
		}
		FileOutputStream fos = new FileOutputStream(path);
		book.write(fos);
	}

	
}
