package orangeHRM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.ReadGenDDT;

public class DeleteEmp extends GenOrange{
	@Test
	public void test1() throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement ele1 = driver.findElement(By.xpath("//input[@name='username']"));
		ele1.sendKeys(ReadGenDDT.readddt("Sheet1", 6, 0),Keys.TAB,ReadGenDDT.readddt("Sheet1", 6, 1),Keys.ENTER);
		WebElement elepim = driver.findElement(By.xpath("(//span[.='PIM'])[1]"));
		elepim.click();
		
		WebElement eleedit = driver.findElement(By.xpath("(//button[@class='oxd-icon-button oxd-table-cell-action-space' and @type='button'])[4]/preceding-sibling::button"));
		eleedit.click();
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(Keys.CONTROL+"ax", ReadGenDDT.readddt("Sheet1", 6, 2));
		Thread.sleep(4000);
		WebElement elesave = driver.findElement(By.xpath("(//button[.=' Save '])[1]"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView", elesave);
		elesave.click();
		WebElement elesuccess = driver.findElement(By.xpath("//p[.='Successfully Updated']"));
		if(elesuccess.isDisplayed()) {
			Reporter.log("the data is successfully added",true);
		}
	}
}
