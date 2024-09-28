package javaScriptexecutor;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import generic.Baseclass;
public class Myntra extends Baseclass {
	public static void main(String[] args) throws InterruptedException {
		chromebase();
		driver.get("https://www.myntra.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input")).sendKeys("hrx shoes",Keys.ENTER);
		Thread.sleep(2000);
		//driver.findElement(By.xpath("(//span[@class='product-discountedPrice'])[1]")).click();
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.xpath("//div[contains(text(),'Sort by')]"));
		Actions a= new Actions(driver);
		a.moveToElement(ele).build().perform();
		Thread.sleep(2000);
		//WebElement ele=driver.findElement(By.xpath("//div[@class='sort-sortBy']"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		Thread.sleep(0);
		WebElement eleop=driver.findElement(By.xpath("//input[@value='new']"));
		Thread.sleep(2000);
		js.executeScript("arguments[0].click();", eleop);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='product-discountedPrice'])[1]")).click();

		Set<String> alllink=driver.getWindowHandles();
		for(String link:alllink) {
			driver.switchTo().window(link);
			Thread.sleep(20);
		}
		
		driver.findElement(By.xpath("//p[@class='size-buttons-unified-size' and text()='7']")).click();
		WebElement elewish=driver.findElement(By.xpath("//span[.='WISHLIST']"));
		Thread.sleep(2000);
		js.executeScript("arguments[0].click();", elewish);
		
		
		
	}//span[.='Recommended']
}