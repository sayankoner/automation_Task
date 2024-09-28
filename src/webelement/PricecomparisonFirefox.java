package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PricecomparisonFirefox {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("samsung s24 ultra 5g",Keys.ENTER);
		Thread.sleep(2000);
		WebElement ele1= driver.findElement(By.xpath("//span[.='Samsung Galaxy S24 Ultra 5G AI Smartphone (Titanium Black, 12GB, 256GB Storage)']/../../../following-sibling::div[2]/div/div[1]/div[1]/div[1]/div[1]/a/span/span[1]"));
		String te=ele1.getText();
		System.out.println(te);
		Thread.sleep(2000);
		System.out.println(ele1.getAttribute("class"));
		//String te=ele1.getText();
		Thread.sleep(2000);
		System.out.println(te);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("samsung s24 ultra 5g",Keys.ENTER);
		WebElement ele2=driver.findElement(By.xpath("//div[.='SAMSUNG Galaxy S24 Ultra 5G (Titanium Black, 256 GB)']/../following-sibling::div/div[1]/div[1]/div[1]"));
		String s=ele2.getText();
		System.out.println(s);
		driver.quit();
		
	}
}
