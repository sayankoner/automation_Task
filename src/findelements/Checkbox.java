package findelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Checkbox {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/admin/OneDrive/Desktop/abhi/Selenium/xpath.html");
		List<WebElement> all_checks=driver.findElements(By.xpath("//input[@type='checkbox']"));
		for(WebElement ele:all_checks) {
			ele.click();
			Thread.sleep(500); 			
		}
		
		for(int i=((all_checks.size())-1);i>=0;i--){
			WebElement ele=all_checks.get(i);
			ele.click();
			Thread.sleep(500); 
			
			
		}
		driver.quit();
	}

}
