package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendkys {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("file:///C:/Users/admin/OneDrive/Desktop/abhi/Selenium/project.html");
		WebElement ele1 = driver.findElement(By.xpath("//input[1]"));
		ele1.sendKeys("selenium");
		WebElement ele2 = driver.findElement(By.xpath("//input[2]"));
		ele2.sendKeys("api");
		Thread.sleep(2000);

		WebElement ele3 = driver.findElement(By.xpath("//input[3]"));
		ele2.sendKeys(Keys.CONTROL + "ax");
		Thread.sleep(3000);
		// ele2.sendKeys(Keys.CONTROL+"x");
		// Thread.sleep(2000);
		ele3.sendKeys(Keys.CONTROL + "v");
		Thread.sleep(2000);

		ele1.sendKeys(Keys.CONTROL + "ax");
		Thread.sleep(3000);
		// ele1.sendKeys(Keys.CONTROL+"x");
		// Thread.sleep(2000);
		ele2.sendKeys(Keys.CONTROL + "v");
		Thread.sleep(2000);

		ele3.sendKeys(Keys.CONTROL + "ax");
		Thread.sleep(3000);
		// ele3.sendKeys(Keys.CONTROL+"x");
		// Thread.sleep(2000);
		ele1.sendKeys(Keys.CONTROL + "v");
		Thread.sleep(2000);

		//driver.quit();

	}
}
