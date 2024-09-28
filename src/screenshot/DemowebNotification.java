package screenshot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import generic.Baseclass;
import generic.GenScreenshot;

public class DemowebNotification extends Baseclass {
	public static void main(String[] args) throws InterruptedException {
		chromebase();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//ul[@class='top-menu']/li[4]/a")).click();
		for(int i=1;i<=5;i++)
		driver.findElement(By.xpath("(//input[@type='button' and @value='Add to cart'])[1]")).click();
		Thread.sleep(3000);
		//try {
			WebElement ele = driver.findElement(By.xpath("//div[@id='bar-notification']"));
			
			Boolean present = ele.isDisplayed();

			if (!present) {
				System.out.println("hello there is defect");
				GenScreenshot.sc(driver);
				
//				driver.findElement(By.xpath("//span[.='Shopping cart']")).click();
//				Thread.sleep(3000);
//				driver.findElement(By.xpath("//input[@name='removefromcart']")).click();
//				driver.findElement(By.xpath("//input[@name='updatecart']")).click();
//				System.out.println("hello");
				
			}
		
		

	}

}
//a[.='shopping cart']