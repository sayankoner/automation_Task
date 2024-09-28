package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemowebDefect {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement ele = driver.findElement(By.xpath("//ul[@class='top-menu']/li[4]/a"));
		ele.click();
		WebElement ele3 = driver.findElement(By.xpath("(//input[@type='button'])[4]"));
		ele3.click();
		
//			WebElement ele2 = driver.findElement(By.xpath("//div[id='bar-notification']"));
//			System.out.println("there is no defect");
//			Thread.sleep(10000);
//			boolean se=ele2.isDisplayed();
//			//WebElement ele4 = driver.findElement(By.xpath("(//span[.='Shopping cart']"));			ele4.click();
		
			WebElement ele4 = driver.findElement(By.xpath("//div[@id='bar-notification' and @class='bar-notification success']"));
			//System.out.println("there is no defect");
			Thread.sleep(10000);
			boolean se12=ele4.isDisplayed();
			System.out.println(se12);
			Thread.sleep(10000);
			//driver.quit();

	}
}