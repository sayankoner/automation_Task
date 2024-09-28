package orangeHRM;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import generic.ReadGenDDT;

public class Addanddelete extends GenOrange {
	@Test
	public void demo() throws InterruptedException, IOException {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String username = ReadGenDDT.readddt("Sheet1", 6, 0);
		String password = ReadGenDDT.readddt("Sheet1", 6, 1);
		String firstname = ReadGenDDT.readddt("Sheet1", 3, 0);
		String lastname = ReadGenDDT.readddt("Sheet1", 3, 1);

		WebElement username1 = driver.findElement(By.xpath("//input[@name='username']"));
		username1.sendKeys(username);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		driver.findElement(By.xpath("//button[.=' Login ']")).click();

		WebElement ele = driver.findElement(By.className("oxd-brand-banner"));
		if (ele.isDisplayed()) {
			driver.findElement(By.xpath("//ul[@class='oxd-main-menu']/li[2]/a[1]/span[1]")).click();

			driver.findElement(By.xpath("//a[.='Add Employee']")).click();

			WebElement fn = driver
					.findElement(By.xpath("//input[@class='oxd-input oxd-input--active orangehrm-firstname']"));
			fn.click();

			fn.sendKeys(firstname);

			WebElement ln = driver
					.findElement(By.xpath("//input[@class='oxd-input oxd-input--active orangehrm-lastname']"));
			ln.click();

			ln.sendKeys(lastname);

			driver.findElement(By.xpath("//button[.=' Save ']")).click();

			try {
				WebElement ele1 = driver.findElement(By.xpath("//div[@id='oxd-toaster_1']"));
				Thread.sleep(3000);
				if (ele1.isDisplayed()) {
					Thread.sleep(3000);
					driver.findElement(By.xpath("//ul[@class='oxd-main-menu']/li[2]/a[1]/span[1]")).click();

					driver.findElement(By.xpath("//a[.='Employee List']")).click();

					driver.findElement(By.xpath("(//input[@placeholder='Type for hints...'])[1]")).sendKeys(firstname);

					driver.findElement(By.xpath("//button[.=' Search ']")).click();

					driver.findElement(By.xpath("//i[@class='oxd-icon bi-trash']")).click();

					driver.findElement(By.xpath("//button[.=' Yes, Delete ']")).click();

					WebElement ele2 = driver.findElement(By.xpath("//p[.='Successfully Deleted']"));
					if (ele2.isDisplayed()) {

						driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();

						driver.findElement(By.xpath("//ul[@class='oxd-dropdown-menu']/li[4]/a[1]")).click();
					}

				}

				else {
					System.out.println("defect");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
