package javaScriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import generic.*;
public class Dynamicele extends Baseclass{
	public static void main(String[] args) throws InterruptedException {
		chromebase();
		driver.get("https://www.amazon.in/");
		WebElement ele;
		try {
		ele=driver.findElement(By.xpath("//h2[.='Automotive essentials | Up to 60% off']"));
		Point p=ele.getLocation();
		int x=p.getX();
		int y= p.getY();
		Dimension d=ele.getSize();
		int h=d.height;
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy("+0+",-"+(3*h)+")");
		js.executeScript("arguments[0].scrollIntoView();", ele);
		Thread.sleep(500);
		GenScreenshot.sc(driver);
		Thread.sleep(4000);
		}catch(Exception e) {
			
		}
		
		driver.quit();
		ele=driver.findElement(By.xpath("//h2[.='Automotive essentials | Up to 60% off']"));
		

		
	}
}
