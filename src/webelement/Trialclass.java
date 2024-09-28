package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Trialclass {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("file:///C:/Users/admin/OneDrive/Desktop/abhi/Selenium/xpath.html");
		WebElement ele=driver.findElement(By.xpath("//input[@class='candy']"));
		
		Thread.sleep(20000);	
		driver.close();
	}
}
