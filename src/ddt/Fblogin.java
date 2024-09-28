package ddt;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import generic.ReadGenDDT;
public class Fblogin {
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
//		FileInputStream fis= new FileInputStream("C:\\Users\\admin\\OneDrive\\Desktop\\abhi\\Selenium\\ddtfile.xlsx");
//		Workbook book = WorkbookFactory.create(fis);
//		Sheet sh= book.getSheet("Sheet1");
//		Row r= sh.getRow(1);
//		Cell s1= r.getCell(0);
//		String un=s1.toString();
//		Cell s2= r.getCell(1);
//		String pwd=s2.toString();
//		
		
		System.setProperty("webdriver.chrome.driver","softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://106.51.87.42:9007/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(ReadGenDDT.readddt("sheet1",1,0));
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(ReadGenDDT.readddt("sheet1",1,1));
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();

	
	}
}
