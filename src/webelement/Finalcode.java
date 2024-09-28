package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Finalcode {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[contains(.,'Apparel & Shoes')])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]")).click();
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.xpath("//div[@id='bar-notification']"));
		 boolean msg = ele.isDisplayed();
		Thread.sleep(2000);
		if (!msg) {
			System.out.println("It is a defect");
		}
		driver.findElement(By.xpath("(//a[contains(.,'Apparel & Shoes')])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@value='Add to cart'])[3]")).click();
		Thread.sleep(2000);
		WebElement ele1=driver.findElement(By.xpath("//div[@id='bar-notification']"));
		Thread.sleep(2000);
		boolean msg1=ele1.isDisplayed();
		Thread.sleep(4000);
		if (msg1) {
			driver.findElement(By.xpath("//span[.='Shopping cart']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@type='checkbox']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='updatecart']")).click();
		}
		else {
			System.out.println("It is a defect");
		}
		
	}
}
