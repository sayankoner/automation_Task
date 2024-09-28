package orangeHRM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class GenOrange implements Base_constants {
	public WebDriver driver;

	@BeforeMethod
	public void chromebase() {
		System.setProperty(chrome_Key, Chrome_value);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(time , TimeUnit.SECONDS);
	}

	@AfterMethod
	public void closetab() {
		driver.quit();
	}
	public WebElement find(String path) {
		WebElement ele = driver.findElement(By.xpath(path));
		return ele;
	}

}
