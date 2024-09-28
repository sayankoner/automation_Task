package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Usetab {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/");
		WebElement ele =driver.findElement(By.xpath("//input[@id='email']"));
		ele.sendKeys("username",Keys.TAB,"sdfghjk",Keys.ENTER);
//		Thread.sleep(2000);
//		ele.sendKeys(Keys.TAB,"password")
//		Thread.sleep(2000);
//		ele.sendKeys(Keys.TAB,Keys.ENTER);
//		Thread.sleep(2000);
//		driver.close();
	}
}
