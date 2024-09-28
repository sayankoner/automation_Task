package first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkpage {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./softwares/chromeDriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://youtube.com");
	Thread.sleep(2000);
	driver.findElement(By.name("search_query")).sendKeys("kalki");
	driver.findElement(By.id("search")).click();
	
	driver.quit();
}
}
