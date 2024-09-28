package first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demowebshop {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.xpath("//ul[@class='top-menu']/li[4]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@data-productid='36']/div[2]/div[3]/div[2]/input")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[contains(@class,'cart-label')]/../../../li[3]/a/span")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='checkbox' and @name='removefromcart']")).click();
	driver.findElement(By.xpath("//input[@name='updatecart']")).click();
	driver.quit();
}
}
//input[@name='updatecart']
//input[@type='checkbox' and @name='removefromcart']
//ul[@class='top-menu']/li[4]
//div[@data-productid='36']/div[2]/div[3]/div[2]/input
//span[contains(@class,'cart-label')]/../../../li[3]/a/span