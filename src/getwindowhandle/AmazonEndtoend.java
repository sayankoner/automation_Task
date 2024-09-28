package getwindowhandle;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonEndtoend {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("titan watches",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[.='Newest First']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@class='WKTcLC'])[2]")).click();
		Thread.sleep(2000);
		Set<String> all_id=driver.getWindowHandles();
		for(String id: all_id) {
			driver.switchTo().window(id);
		}
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[name()='svg'  and @class='NwyjNT']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[.='Remove' and @class='sBxzFz']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[.='Remove'])")).click();
		Thread.sleep(5000);
		driver.quit();
	}
}
