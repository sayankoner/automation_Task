package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import generic.*;

public class Demoformbdday {
	
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("abhish",Keys.TAB+"kumar",Keys.TAB+"abhis@gmail.com");
		//Robot r = new Robot();
		WebElement ele=driver.findElement(By.xpath("//label[.='Male']"));
		ele.click();
		//ele.sendKeys(Keys.TAB,"900897763");
		//r.keyPress(KeyEvent.VK_TAB);
		driver.findElement(By.xpath("//input[@id='userNumber']")).sendKeys("98673080");
		driver.findElement(By.xpath("//input[@id='dateOfBirthInput']")).click();
		Thread.sleep(2000);
		WebElement elmonth = driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
		Dropdown.gdrf(elmonth).selectByIndex(4);
		WebElement elyear = driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
		Dropdown.gdrf(elyear).selectByVisibleText("1995");
		driver.findElement(By.xpath("//div[.='14']")).click();
		Thread.sleep(3000);
		WebElement ele1 = driver.findElement(By.xpath("//input[@id='subjectsInput']"));
		ele1.sendKeys("English");
		Thread.sleep(3000);
		ele1.sendKeys(Keys.ENTER);
		driver.findElement(By.cssSelector("textarea[id='currentAddress']")).sendKeys("kolkata");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[.='Select State']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[.='Uttar Pradesh']")).click();
		Thread.sleep(2000);
//		driver.findElement(By.cssSelector("button[type='submit']")).click();
//		Thread.sleep(2000);
		
		
	}
}
