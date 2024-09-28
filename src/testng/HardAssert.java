package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.ReadGenDDT;
import orangeHRM.GenOrange;
public class HardAssert extends GenOrange {
	@Test
	public void title() {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.name("username")).sendKeys(ReadGenDDT.readddt("Sheet1", 6, 0),Keys.TAB,ReadGenDDT.readddt("Sheet1", 6, 1),Keys.ENTER);
		Assert.assertEquals(driver.getCurrentUrl(),"https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index","tile is not verified");
		Reporter.log("url is correct",true);
	}
}
