package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demoweb2sau {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement apparelshoes = driver.findElement(By.xpath("//ul[@class='top-menu']/li[4]/a"));
		apparelshoes.click();
		
		WebElement sort = driver.findElement(By.id ("products-orderby"));
		Thread.sleep(2000);
		Select s1 = new Select(sort);
		s1.selectByVisibleText("Name: A to Z");
		Thread.sleep(2000);
		
		WebElement display = driver.findElement(By.id("products-pagesize"));
		Thread.sleep(2000);
		Select s2 = new Select(display);
		s2.selectByVisibleText("4");
		Thread.sleep(2000);
		
		WebElement view = driver.findElement(By.id("products-viewmode"));
		Thread.sleep(2000);
		Select s3 = new Select(view);
		s3.selectByVisibleText("List");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[.='Blue and green Sneaker']/../../div[3]/div[2]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("add-to-cart-button-28")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//div[@class='header-links-wrapper']/div/ul/li[3]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='removefromcart']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@value='Update shopping cart']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@class='header-logo']")).click();
		Thread.sleep(3000);
		driver.quit();

	}
}
