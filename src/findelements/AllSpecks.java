package findelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AllSpecks {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("hindi books", Keys.ENTER);
		List<WebElement> elname=driver.findElements(By.xpath("(//div[@class='a-section a-spacing-small a-spacing-top-small'])[2]"));
		
		for(WebElement el: elname) {
			
			String s1=el.getText();
			System.out.println(s1);
		
		}
	}
}
