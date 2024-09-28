package javaScriptexecutor;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Time;
import java.time.LocalTime;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import generic.Baseclass;
public class DemoOrange extends Baseclass{
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
		//firebase();
		chromebase();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.name("username"));
		FileInputStream fis= new FileInputStream("C:\\Users\\admin\\OneDrive\\Desktop\\demoselenium.xlsx");
		Workbook book=WorkbookFactory.create(fis);
		Sheet s=book.getSheet("Sheet1");
		Row r=s.getRow(6);
		//Thread.sleep(2000);
		//Date d= new Date();
		LocalTime time=java.time.LocalTime.now();
		String id="ab"+time.toString();
		ele.sendKeys(r.getCell(0).toString(),Keys.TAB,r.getCell(1).toString(),Keys.ENTER);
		Thread.sleep(4000);
		
		WebElement ele1=driver.findElement(By.xpath("//h6[.='Dashboard']"));
		if(ele1.isDisplayed()) {
			System.out.println("home page is opened");		
		}
//		WebElement eleham=driver.findElement(By.xpath("//i[@class='oxd-icon bi-list oxd-topbar-header-hamburger']"));
//		System.out.println("ham is found");
//		eleham.click();
		WebElement elepim=driver.findElement(By.xpath("//span[.='PIM']"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",elepim);
		System.out.println("pim is found");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Add Employee']")).click();
		Thread.sleep(4000);
		driver.findElement(By.name("firstName")).sendKeys("abhis",Keys.TAB,"middle",Keys.TAB,"last",Keys.TAB,id, Keys.ENTER);
		Thread.sleep(2000);
		WebElement elenote=driver.findElement(By.xpath("//p[.='Successfully Saved']"));
		if(elenote.isDisplayed()) {
			System.out.println("new employee id is created");
		}else {
			System.out.println("check the entered data ");
		}  	
		Thread.sleep(8000);
		driver.findElement(By.xpath("//a[.='Employee List']")).click();
		WebElement eledelete=driver.findElement(By.xpath("//div[.='"+id+"']/../../../following-sibling::div/div/div/button[2]"));
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView();", eledelete);
		eledelete.click();
	}
}
