package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemowebChrome {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement ele = driver.findElement(By.xpath("//ul[@class='top-menu']/li[4]/a"));
		ele.click();
		WebElement ele3 = driver.findElement(By.xpath("(//input[@type='button'])[4]"));
		ele3.click();
		
//			WebElement ele2 = driver.findElement(By.xpath("//div[id='bar-notification']"));
//			System.out.println("there is no defect");
//			Thread.sleep(10000);
//			boolean se=ele2.isDisplayed();
//			//WebElement ele4 = driver.findElement(By.xpath("(//span[.='Shopping cart']"));			ele4.click();
		
			WebElement ele4 = driver.findElement(By.xpath("//div[@id='bar-notification']"));
			//System.out.println("there is no defect");
			Thread.sleep(2000);
			boolean se12=ele4.isDisplayed();
			System.out.println(se12);
			if(se12==true)
			{
				System.out.println("there are no defects");
				driver.findElement(By.xpath("//span[contains(@class,'cart-label')]/../../../li[3]/a/span")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@type='checkbox' and @name='removefromcart']")).click();
				driver.findElement(By.xpath("//input[@name='updatecart']")).click();
			}
			else {
				
				System.out.println("defect is present");
			}
			Thread.sleep(10000);
			//driver.quit();

	}
}
