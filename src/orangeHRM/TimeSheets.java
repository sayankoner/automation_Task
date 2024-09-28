package orangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import generic.ReadGenDDT;

public class TimeSheets extends GenOrange {
	@Test
	public void testTime() throws InterruptedException {
		WebElement ele1 = driver.findElement(By.xpath("//input[@name='username']"));
		ele1.sendKeys(ReadGenDDT.readddt("Sheet1", 6, 0), Keys.TAB, ReadGenDDT.readddt("Sheet1", 6, 1), Keys.ENTER);
		WebElement eledash = driver.findElement(By.xpath("//h6[.='Dashboard']"));
		SoftAssert s = new SoftAssert();
		s.assertEquals(eledash.getText(), "Dashboard", "home page is not displayed");
		s.assertAll();
		driver.findElement(By.xpath("//span[.='Time']")).click();
		driver.findElement(By.xpath("//span[.='Timesheets ']")).click();
		driver.findElement(By.xpath("//a[.='My Timesheets']")).click();
		driver.findElement(By.xpath("//button[.=' Edit ']")).click();
		WebElement eleproject = driver.findElement(By.xpath("//div[@class='oxd-autocomplete-text-input--after']"));

		eleproject.sendKeys("Internal");
		Thread.sleep(4000);
		find("//span[.='Internal - Recruitment']").click();
		find("//div[.='-- Select --' and @class='oxd-select-text-input']").click();
		find("//span[.='HR Audit']").click();
		find("(//input[@class='oxd-input oxd-input--active'])[2]").sendKeys("08:30", Keys.TAB, "09:00");
		find("//button[.=' Save ']").click();

	}
}
