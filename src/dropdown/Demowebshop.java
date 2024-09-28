 package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demowebshop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//ul[@class='top-menu']/li[4]/a"));
		ele.click();
		Thread.sleep(2000);
		WebElement ele1=driver.findElement(By.xpath("//select[@id='products-orderby']"));
		Select s1=new Select(ele1);
		s1.selectByIndex(1);
		Thread.sleep(2000);
		WebElement ele2=driver.findElement(By.xpath("//select[@id='products-viewmode']"));
		s1=new Select(ele2);
		s1.selectByIndex(1);
		Thread.sleep(2000);
		WebElement ele3=driver.findElement(By.xpath("//select[@id='products-pagesize']"));
		s1=new Select(ele3);
		
		s1.selectByVisibleText("4");

		Thread.sleep(2000);
	}
}
