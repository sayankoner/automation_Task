package ddt;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import generic.*;

public class Demoform {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys(ReadGenDDT.readddt("Sheet1", 4, 0),Keys.TAB+ReadGenDDT.readddt("Sheet1", 4, 1),Keys.TAB+"abhis@gmail.com");
		WebElement ele=driver.findElement(By.xpath("//label[.='Male']"));
		ele.click();
		driver.findElement(By.xpath("//input[@id='userNumber']")).sendKeys(ReadGenDDT.readddt("Sheet1", 4, 2));
		driver.findElement(By.xpath("//input[@id='dateOfBirthInput']")).click();
		Thread.sleep(2000);
		WebElement elmonth = driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
		Dropdown.gdrf(elmonth).selectByIndex(4);
		WebElement elyear = driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
		Dropdown.gdrf(elyear).selectByVisibleText(ReadGenDDT.readddt("Sheet1", 4, 4));
		driver.findElement(By.xpath("//div[.='14']")).click();
		Thread.sleep(2000);
		WebElement ele1 = driver.findElement(By.xpath("//input[@id='subjectsInput']"));
		ele1.sendKeys(ReadGenDDT.readddt("Sheet1", 4, 5));
		Thread.sleep(1000);
		ele1.sendKeys(Keys.ENTER);
		driver.findElement(By.cssSelector("textarea[id='currentAddress']")).sendKeys(ReadGenDDT.readddt("Sheet1", 4, 6));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[.='Select State']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[.='Haryana']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[.='Select City']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[.='Karnal']")).click();
		Thread.sleep(2000);
//		driver.findElement(By.cssSelector("button[type='submit']")).click();
//		Thread.sleep(2000);
//		driver.quit();
	}
}
