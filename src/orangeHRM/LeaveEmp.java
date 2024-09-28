package orangeHRM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.ReadGenDDT;

public class LeaveEmp extends GenOrange {
	@Test
	public void leave() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement ele1 = driver.findElement(By.xpath("//input[@name='username']"));
		ele1.sendKeys(ReadGenDDT.readddt("Sheet1", 6, 0),Keys.TAB,ReadGenDDT.readddt("Sheet1", 6, 1),Keys.ENTER);
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[.='Leave']")).click();
		//to click on apply button
		driver.findElement(By.xpath("//a[.='Apply']")).click();
		//to click on dropdown
		driver.findElement(By.xpath("//div[.='-- Select --']/div/div/div")).click();
		Thread.sleep(2000);
		//to select the leave type
		driver.findElement(By.xpath("//span[.='CAN - FMLA']")).click();
		String fromDate="2024-12-12";
		String toDate="2024-15-12";
		WebElement eleFromdate = driver.findElement(By.xpath("//label[.='From Date']/../../div[2]/div/div/input"));
		Thread.sleep(2000);
		eleFromdate.sendKeys(fromDate);
		Thread.sleep(4000);
		WebElement eleTodate = driver.findElement(By.xpath("//label[.='To Date']/../../div[2]/div/div/input"));
		eleTodate.sendKeys(Keys.CONTROL+"ax");
		eleTodate.sendKeys(toDate);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.=' Apply ']")).click();
		WebElement elesuccess = driver.findElement(By.xpath("//p[.='Successfully Saved']"));
		if(elesuccess.isDisplayed()) {
			Reporter.log("successfully applied",true);
		}
		WebElement eleleavelist = driver.findElement(By.xpath("//a[.='Leave List']"));
		eleleavelist.click();
		WebElement eledate = driver.findElement(By.xpath("//div[.='Date']/following-sibling::div[1]"));
		if((eledate.getText() ).contains(toDate) &&(eledate.getText() ).contains(fromDate)) {
			Reporter.log("leave is in applied list", true);
		}
		
	}
}
